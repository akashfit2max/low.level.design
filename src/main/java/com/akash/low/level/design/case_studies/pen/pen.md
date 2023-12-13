# Design a pen

## Steps

```
- context / overview
- Ask questions
    - current requirements
    - future requirements
    - behaviore 
    
```

## Gather requirements

```
- A pen is anything that can write
- types of pen - gel, ball, fountain, marker, throwaway pen
- ball pen have ball pen refil gel pen will have gel pen refil
- refil has a tip and an ink
- ink can be of diff colors
- fountain pen has a ink
- refil has a radius. for fountain pen, its tip has a radius
- each pen can write in diff way
- some pen write in the same way
- every pen has a brand and a name
- some pens allow refilling while others might not
```

## Entities and attributes

```
* Pen
    * Brand
    * Name
    * Type - Ball, Gel, Fountain, Marker, Throwaway pen
    * Price
    * Refillable
    
* Refil
    * Type - Gel, Ball
    * Ink
    * Nib
    * Refillable
    
*Ink
    * Coor
    * Brand
    * Type - Gell, Ball, Fountain
    
*Nib
    * radius
    * type - gold, silver, platinum    
```

### Different types of pens

```
* Gel Pen
    * type - gel
    * refillable - yes
    * refill
        * type - gel
        * refillable - yes
    * ink
    * nib
    
* Throwaway Pen
    * type - gel
    * refillable - no
    * refill
        * type - gel
        * refillable - no
    * ink
    * nib

* fountain pen
    * type - fountain
    * refillable - yes
    * ink
    * nib
    
    
```

### V1 - Single class

```mermaid
classDiagram
    class Pen {
        - String brand
        - String name
        - PenType type
        - double price
        - bool isRefillable
        - Ink ink
        - Nib nib
        - Refill refill
        + write() void
        + changeRefill(Refil) void
    }

    class PenType {
        <<enumeration>>
        GEL
        BALL
        FOUNTAIN
        THROW_AWAY
    }

    class Refill {
        - RefillType type
        - Nib nib
        - Ink ink
    }

    class RefillType {
        <<enumeration>>
        GEL
        BALL
    }

    class Nib {
        - double radius
    }

    class Ink {
        - String color
        - String brand
        - InkType type
    }

    class InkType {
        <<enumeration>>
        GEL
        BALL
        FOUNTAIN
    }
    Pen "*" --o "1" PenType
    Pen "1" --* "1" Refill
    Pen "1" --* "1" Nib
    Pen "1" --* "1" Ink
    Refill "*" --o "1" RefillType
    Refill "1" --* "1" Ink
    Refill "1" --* "1" Nib
    Ink "*" --o "1" InkType

```

## Problems
```
- Single Responsibility Principle is violated. There are multiple reasons to change the class such as modifying a single type of pen.
- Open Closed Principle is violated. Adding a new type of pen requires changing the class.
- Null checks are required for handling refill and ink for fountain pens.
- Object creation is complex
- duplication
```
## V2 - Multiple class 

```mermaid
classDiagram
    class Pen {
        <<abstract>>
        - String brand
        - String name
        - PenType type
        - Double price
        - bool refillable
        + write()* void
        + changeRefill()* void
    }

    class GelPen {
        - Refill refill
        + write() void
        + changeRefill(refill) void
    }

    class BallPen {
        - Refill refill
        + write() void
        + changeRefill(refill) void
    }

    class FountainPen {
        - Ink ink
        - Nib nib
        + write() void
        + changeRefill(refill) void
    }

    class Refill {
        - RefillType type
        - Nib nib
        - Ink ink
    }

    class Nib {
        - double radius
    }

    class Ink {
        - String color
        - String brand
        - InkType type
    }

    Pen <|-- GelPen
    Pen <|-- BallPen
    Pen <|-- FountainPen
    GelPen "1" --* "1" Refill
    BallPen "1" --* "1" Refill
    FountainPen "1" --* "1" Ink
    FountainPen "1" --* "1" Nib
    Refill "1" --* "1" Ink
    Refill "1" --* "1" Nib
```
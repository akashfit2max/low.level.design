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
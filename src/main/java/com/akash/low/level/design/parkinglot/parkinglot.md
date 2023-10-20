# Design a Parking Lot Management System

### Rhough flow

```
vechile (entrance gate) --> parking slot --> exit --> vechile out
     ticket                                    payment
```

### Gather Requirements

```
1. How many entrances [1 exit 1 entry] it should be sclable 
2. Different types of spot [two wheeler , four wheeler]
3. Hourly based charge / minutes based charge [mix]
4. Parking spot shoul be nearest to entrance
5. Multiple floors
6. Different payment method
```

### Class Diagram
```mermaid
classDiagram
    ParkingSpotManager <|-- ParkingSpot: has-a
    ParkingSpotManager <|-- TwoWheelerManager
    ParkingSpotManager <|-- FourWheelerManager
    ParkingSpot <|-- TwoWheelerSpot: inheritance
    ParkingSpot <|-- FoueWheelerSport: inheritance
    ParkingStrategy <|-- NearToEntrace
    ParkingStrategy <|-- NearToEntraceAndElevator
    ParkingStrategy <|-- default

    class ParkingSpotManager {
        - List< ParkingSpot> parkingSlots
        - ParkingSpotManager(List< ParkingSpot> parkingSlots): set the type of parking sport required
        - findParkingSpace(ParkingStrategy)
        - addParkingSpace()
        - removeParkingSpace()
        - parkVechile()
        - removeVechile()
    }

    class TwoWheelerManager {
        - List< ParkingSpot> twoWheelerParkingSpots
        - ParkingStrategy parkingStrategy
        - TwoWheelerManager(twoWheelerParkingSpots, parkingStrategy)
    }

    class FourWheelerManager {
        - List< ParkingSpot> fourWheelerParkingSpots
        - ParkingStrategy parkingStrategy
        - FourWheelerManager(fourWheelerParkingSpots, parkingStrategy)
    }

    class ParkingStrategy {
        <<interface>>
    }
    class NearToEntrace {
        - find()
    }
    class NearToEntraceAndElevator {
        - find()
    }
    class default {
        -find()
    }

    class ParkingSpot {
        <<General>>
        - int id
        - bool isEmpty
        - Vechile vechile
        - int Price
        - parkVechile(vechile)
        - removeVechile()
    }

    class TwoWheelerSpot {
        - price()
    }

    class FoueWheelerSport {
        - price()
    }

    ParkingSpot <|-- Vechile : has-a

    class Vechile {
        - int vechileNo
        - VechileType vechileType
    }

    class VechileType {
        <<enumeration>>
        2W
        4W
        3W
    }
    
    Vechile <|-- Ticket : has-a
    
    
    class Ticket {
        - long entryTime
        - Vechile vechile
        - ParkingSpot parkingSport
    }
```


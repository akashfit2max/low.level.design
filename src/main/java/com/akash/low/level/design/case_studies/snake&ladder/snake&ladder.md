# Design Snakes and Ladders

## Requirements
```
1. A game can be between multiple players 
2. a game will only have human players
3. each player can have multiple pieces
4. a board can be of any size decided by the client
5. a board will have different types ofcells
6. there can be normal cells and cells which contains snake and ladders
7. position of snakes and ladders is random or decided at the start of the game
8. the number of snakes and ladders is random or decided at the start of the game
9. the size of ladder and snake is random or decided at the start of the game
10. a player will move according to dice
11. a player will enter the game only when he gets one or max num in the dice
12. a player will win if they reach the last cell
13. the game will end when n-1 players reach the last cell
14. for each game maintain a leaderboard which has the rankings of each player
```
## Entities and their attributes
- Game
  - Board
    - Dimensions
    - Cells
      - position
      - pieces
      - type ?
    - snake
      - start
      - end
    - ladder
      - start
      - end
  - Players
    - pieces
    - name
  - Dices
  - LeaderBoard
    - players
    - ranking
  - Status

## initial design
```mermaid

classDiagram
    class Game {
        -Board board
        -Player[] players
        -Dice[] dices
        -Leaderboard leaderboard
        -StatusType status
        +createGame(CreateGameRequest)
        +roll() int
        +makeMover(Player, Piece)
        +getLeaderBoard()
    }

    class Board {
        -int size
        -Cell[] cells
        -Snake[] snakes
        -Ladders[] ladders
    }

    class Cell {
        -int position
        -Piece[] pieces
    }

    class Snake {
        -int start
        -int end
    }

    class Ladder {
        -int start
        -int end
    }

    class Player {
        -String name
        -Piece[] pieces
    }

    class LeaderBoard {
        -PlayerRanking[] rankings
    }

    class PlayerRanking {
        -Player player
        -int ranking
    }

    class Dice {
        -int faceValue
        -roll() int
    }

    class Piece {
        -String color
    }

    Game "1" --* "1" Board
    Game "1" --* "*" Player
    Game "1" --* "*" Dice
    Game "1" --* "1" LeaderBoard
    Board "1" --* "*" Cell
    Board "1" --* "*" Snake
    Board "1" --* "*" Ladder
    Cell "1" --* "*" Piece
    Player "1" --* "*" Piece
    LeaderBoard "1" --* "*" PlayerRanking

```

### Problems with initial design
* OCP violation in the board class
* No parent class for special cells to reduce code duplication

## Adding a new parent class for snake and ladder
```mermaid
classDiagram
    class Board {
        -int size
        -Cell[] cells
        -Map[position, Obstacle] obstacles
    }

    class Cell {
        -int position
        -Piece[] pieces
    }

    class Snake {
        -nextLocation() int
    }

    class Ladder {
        -nextLocation() int
    }

    class Obstacle {
        <<abstract>>
        -int start
        -int end
        -nextLocation()* int
    }

    Board "1" --* "*" Cell
    Board "1" --* "*" Obstacle
    Obstacle <|-- Snake
    Obstacle <|-- Ladder
```


## optimization - moving obstacle to cell
```mermaid
classDiagram
    class Board {
        -int size
        -Cell[] cells
    }

    class Cell {
        -int position
        -Piece[] pieces
        -Obstacle[] obstacles
    }

    class Snake {
        -nextLocation() int
    }

    class Ladder {
        -nextLocation() int
    }

    class Obstacle {
        <<abstract>>
        -int start
        -int end
        -nextLocation()* int
    }

    Board "1" --* "*" Cell
    Board "1" --* "*" Obstacle
    Obstacle <|-- Snake
    Obstacle <|-- Ladder
```

### Problem
- so many null check in case of empty cell

## optimizing sol - adding an empty cell to obstacle hierarchy

```mermaid
classDiagram
  class Board {
    -int size
    -Cell[] cells
  }

  class Snake {
    -nextLocation() int
  }

  class Ladder {
    -nextLocation() int
  }

  class BaseCell {
    -nextLocation() int
  }

  class Cell {
    <<abstract>>
    -int start
    -int end
    -nextLocation()* int
  }

  Board "1" --* "*" Cell
  Cell <|-- Snake
  Cell <|-- Ladder
  Cell <|-- BaseCell
```
```
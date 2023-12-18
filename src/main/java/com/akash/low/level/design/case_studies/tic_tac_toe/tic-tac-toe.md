# Design Tic-Tac-Toe

## What is tic tac toe

TicTacToe is a 2 player game played on a 3 x 3 board. Each player is allotted a symbol (one X and one O).
Initially, the board is empty. Alternatively, each player takes a turn and puts their symbol at any
empty slot. The first player to get their symbol over a complete row OR a complete column OR a diagonal wins.

## Problem statement

- design a tic tac toe

## Question to ask

- Current scope
    - size of the board
    - 2 player or more
- Future Scope
    - can there be multiple ways to win the game
- Behaviour
    - can a player play with a bot
    - how does a player win
    - who start the game

## Requirements clarification

- Board can be of any NxN size.
- There can be two players.
- Each player will be allotted a symbol.
- The symbol can be one of O and X.
- The players can be either humans or bots.
- Each human player will have a name, email and profile image.
- Each bot player will have a difficulty level.
- Any random player can start the game.
- Then the players will take turns alternatively.
- The player with any consecutive N symbols in a row, column or diagonal wins.
- If the board is full and no player has won, the game is a draw.
- CLI or API

## Entities and attributes

- Game
    - Board
    - players
        - humar / bot
- Board
    - cells[][]
- Cell
    - x,y (row , col)
    - symbol - O,X
- Human
    - name
    - email
    - photo
- Bot
    - level

## Behaviors

- Start theb game
- checkwinner
- makemove
- register

## Class Diagram

### version 1

```mermaid
classDiagram
    class Game {
        - Board board
        - HumanPlayer humanPlayer
        - BotPlayer botPlayer
        + register(humanPlayer) humanPlayer
        + startGame(humaPlayer, botPlayer, int row, int col)
        + makemover(playerId, int, int) Board
        + checkWinner(Board, HumanPlayer, BotPlayer) int
    }

    class Board {
        - Cell[][]
        + Board(int, int): Board
    }

    class Cell {
        - int x
        - int y
        - Symbol symbol
    }

    class HumanPlayer {
        - int id
        - String name
        - String email
        - Byte[] photo
        - Symbol symbol
        + play(Board) Cell
    }

    class BotPlayer {
        -int id
        -Level level
        -Symbol symbol
        + play(Board) Cell
    }

    Game "1" --* "1" Board
    Board "1" --* Cell
    Game "1" --* "1 " BotPlayer
    Game "1" --* "1" HumanPlayer
```

## Problems

- The Game class is tightly coupled with the HumanPlayer and BotPlayer classes. It is not extensible to support any
  other type of player and number of players.
- There is no common contract for the players.
- Huge memory consumption - A player can play multiple games at the same time. Each will have a new HumanPlayer object.
  Each player object will have the profile image. This will consume a lot of memory.
- Implementing the play method for the bot player will lead to SRP and OCP violations because it will be deciding the
  move based on the difficulty level. This will lead to a lot of if-else conditions.

## version 2

```mermaid
classDiagram
  class Player {
    <<abstract>>
    -Symbol symbol
    +play(Board)* Cell
  }

  class HumanPlayer {
    - String name
    - String email
    - Byte[] photo
    + play(Board) Cell
  }

  class BotPLayer {
    -Level level
    + play(Board) Cell
  }

  class Game {
    - Board board
    - Player[] players
    + register(humanPlayer) humanPlayer
    + startGame(humaPlayer, botPlayer, int row, int col)
    + makemover(playerId, int, int) Board
    + checkWinner(Board, HumanPlayer, BotPlayer) int
  }

  Player <|-- HumanPlayer
  Player <|-- BotPLayer
  Game "1" --* "*" Player

```
## Problems

- ~~The Game class is tightly coupled with the HumanPlayer and BotPlayer classes. It is not extensible to support any
  other type of player and number of players.~~
- ~~There is no common contract for the players.~~
- Huge memory consumption - A player can play multiple games at the same time. Each will have a new HumanPlayer object.
  Each player object will have the profile image. This will consume a lot of memory.
- Implementing the play method for the bot player will lead to SRP and OCP violations because it will be deciding the
  move based on the difficulty level. This will lead to a lot of if-else conditions.

## version 3 - solving memory consumption
```mermaid
classDiagram
    class Player {
        <<abstract>>
        -Symbol symbol
        +play(Board)* Cell
    }

    class User {
        - String name
        - String email
        - Byte[] photo
    }
    class HumanPlayer {
        -User user
        + play(Board) Cell
    }

    class Game {
        - Board board
        - Player[] players
        + register(humanPlayer) humanPlayer
        + startGame(humaPlayer, botPlayer, int row, int col)
        + makemover(playerId, int, int) Board
        + checkWinner(Board, HumanPlayer, BotPlayer) int
    }

    Player <|-- HumanPlayer
    Game "1" --* "*" Player
    HumanPlayer "*" --o "1" User

```

## Problems

- ~~The Game class is tightly coupled with the HumanPlayer and BotPlayer classes. It is not extensible to support any
  other type of player and number of players.~~
- ~~There is no common contract for the players.~~
- ~~Huge memory consumption - A player can play multiple games at the same time. Each will have a new HumanPlayer object.
  Each player object will have the profile image. This will consume a lot of memory.~~
- Implementing the play method for the bot player will lead to SRP and OCP violations because it will be deciding the
  move based on the difficulty level. This will lead to a lot of if-else conditions.

## version 4 - using strategy design pattern
```mermaid
classDiagram
  class BotPlayer {
    -int id
    -Level level
    -Symbol symbol
    - PlayingStrategy strategy
    + play(Board) Cell
  }

  class PlayingStrategy {
    <<interface>>
    + play(Board) Cell
  }

  class RandomPlayingStrategy {
    <<interface>>
    + play(Board) Cell
  }

  class MinMaxPlayingStrategy {
    <<interface>>
    + play(Board) Cell
  }

  class AlphaBetaPlayingStrategy {
    <<interface>>
    + play(Board) Cell
  }

  PlayingStrategy <|-- RandomPlayingStrategy
  PlayingStrategy <|-- MinMaxPlayingStrategy
  PlayingStrategy <|-- AlphaBetaPlayingStrategy
  BotPlayer "*" --* "1" PlayingStrategy
```

## final version
```mermaid
classDiagram
    class Game {
        - Board board
        - Player[] players
        +startGame(Player[], int)
        +makeMove(PlayerId, int, int)
        +checkWinner(Board, Player[]): Player
        +registerPlayer(Player)
    }

    class Board {
        -Cell[][] cells
        +Board(int size): Board
    }

    class Cell {
        -int row
        -int column
        -Symbol symbol
    }

    class Player {
        <<abstract>>
        -Symbol symbol
        +play(Board) BoardCell
    }

    class HumanPlayer {
        -User user
        +play(Board) BoardCell
    }

    class User {
        -String name
        -String email
        -Byte[] profileImage
    }

    class BotPlayer {
        -Level difficultyLevel
        -MoveStrategy moveStrategy
        +play(Board) BoardCell
    }

    class MoveStrategy {
        <<interface>>
        +makeMove(Board) BoardCell
    }

    class RandomMoveStrategy {
        +makeMove(Board) BoardCell
    }

    class ClusteringMoveStrategy {
        +makeMove(Board) BoardCell
    }

    class MinimaxMoveStrategy {
        +makeMove(Board) BoardCell
    }

    Game "1" --* "*" Player
    Game "1" --* "1" Board
    Board "1" --* "*" Cell
    HumanPlayer "*" --o "1" User
    Player <|-- HumanPlayer
    Player <|-- BotPlayer
    BotPlayer "*" --o "1" MoveStrategy
    MoveStrategy <|-- RandomMoveStrategy
    MoveStrategy <|-- ClusteringMoveStrategy
    MoveStrategy <|-- MinimaxMoveStrategy
```
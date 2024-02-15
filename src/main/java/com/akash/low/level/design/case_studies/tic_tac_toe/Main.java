package com.akash.low.level.design.case_studies.tic_tac_toe;

import com.akash.low.level.design.case_studies.tic_tac_toe.models.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User user = new User("akash", "aks@hotmail.com", new Byte[]{});
        Player human = new HumanPlayer(user, GameSymbol.O);
        Player bot = new BotPlayer(GameSymbol.X, BotLevel.EASY);

        List<Player> players = new ArrayList<>(Arrays.asList(human, bot));

        Game game = Game.createGame(players, 3, 4);

    }
}

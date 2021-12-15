package com.viewfromthecodeface.hexagonal;

import com.viewfromthecodeface.hexagonal.adapters.KeyboardGuesses;
import com.viewfromthecodeface.hexagonal.adapters.OsGUIDisplay;
import com.viewfromthecodeface.hexagonal.domain.Display;
import com.viewfromthecodeface.hexagonal.domain.Guesses;
import com.viewfromthecodeface.hexagonal.domain.HexagonalGuessMyNumber;

public class Game {
    public static void main ( String[] commandLineArguments ){

        Display display = new OsGUIDisplay();
        Guesses guesses = new KeyboardGuesses();

        new HexagonalGuessMyNumber(5, guesses, display).play();
    }
}

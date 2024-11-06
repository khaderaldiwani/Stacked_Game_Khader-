package view;
import controller.*;

import java.util.Scanner;

public class ConsoleScreen {
   static Scanner scanner = new Scanner(System.in);
    public static void StartGame(){

        LandGame.printInstructions();
        String input;
        System.out.println("press (s) to build game by user or press (c) to generate grid from computer: ");
        input=scanner.next();
        if (input.equals("s")){
           LandGame.inputValueForLandGameFromUser();
        }
        else {
            LandGame.inputValueForLandGame();
        }
        LandGame.printGrid();
        String move;
        while(true){
            if (Check.check(LandGame.grid))
            {
                System.out.println("You Win!");
                break;
            }
            printComnd();
             move = scanner.next();
            if (move.equals("u")){
               new MoveUp().move(LandGame.grid);
            }
            if (move.equals("d") ) {
               new MoveDown().move(LandGame.grid);
            }
            if (move.equals("l")) {
               new MoveLeft().move(LandGame.grid);
            }
            if (move.equals("r") ) {

             new  MoveRight().move(LandGame.grid);
            }
            if (move.equals("y")){
                LandGame.resetGrid();
            }
            LandGame.printGrid();
        }

    }

  static void printComnd(){
        System.out.println("press(y) to reset game :");
        System.out.println("press(u) to move up :");
        System.out.println("press(d) to move down :");
        System.out.println("press(r) to move right :");
        System.out.println("press(l) to move left :");
    }
}

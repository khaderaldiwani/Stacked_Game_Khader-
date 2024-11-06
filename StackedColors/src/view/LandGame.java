package view;

import model.Grid_Stages;

import java.util.Scanner;

public class LandGame {
   public static String[][] grid;
   private static String[][] gridSecondry;
    static Scanner scanner = new Scanner(System.in);
    static int stage;
     public static void inputValueForLandGame(){
         System.out.println("choose the game stage, \n Select Number from 1 to 7:");
        stage=scanner.nextInt();
        switch (stage)
         {
             case 1:
                 Grid_Stages.stageOne();
                break;
             case 2:
              Grid_Stages.stagetwo();
                    break;
             case 3:
                 Grid_Stages.stageThree();
                 break;
             case 4:
                     Grid_Stages.stageFour();
                 break;
             case 5:
                 Grid_Stages.stageFive();
                 break;
             case 6:
                 Grid_Stages.stageSix();
                 break;
             case 7:
                 Grid_Stages.stageSeven();
                 break;
             default:
                 Grid_Stages.stageSeven();
         }
       copyGrid();
    }

    public static void inputValueForLandGameFromUser() {
        System.out.println("Enter Rows Number: ");
        int row=scanner.nextInt();
        System.out.println("Enter column Number: ");
        int column=scanner.nextInt();
        LandGame.grid = new String[row][column];
//            LandGame.landGame[0][0] = "b";LandGame.landGame[0][1] = "_";LandGame.landGame[0][2] = "y"; LandGame.landGame[0][3] = "y";
//            LandGame.landGame[1][0] = "_";LandGame.landGame[1][1] = "*";LandGame.landGame[1][2] = "_"; LandGame.landGame[1][3] = "b";
//            LandGame.landGame[2][0] = "*";LandGame.landGame[2][1] = "y";LandGame.landGame[2][2] = "_";LandGame.landGame[2][3] = "_";
//            LandGame.landGame[3][0] = "b";LandGame.landGame[3][1] = "b"; LandGame.landGame[3][2] = "*";LandGame.landGame[3][3] = "_";

        for (int i = 0; i < LandGame.grid.length; i++) {
            for (int j = 0; j < LandGame.grid[0].length; j++) {
                System.out.print("("+i+","+j+"):");
                LandGame.grid[i][j]=scanner.next();
            }

        }
        System.out.println();
        copyGrid();
    }

    public static void printInstructions(){
        System.out.println("====== Read Me =======");
        System.out.println("welcome, Read game instructions please.");
        System.out.println("_: is space");
        System.out.println("*: is wall");
        System.out.println("any letter: is first letter from color");
        System.out.println("if you want reset game press(y).");
        System.out.println("if you want move up press(u).");
        System.out.println("if you want move down press(d).");
        System.out.println("if you want move right press(r).");
        System.out.println("if you want move left press(l).");
        System.out.println("loading game...");

    }

    public static void printGrid() {
        for (int i = 0; i < grid.length; i++) {

            for (int j = 0; j < grid[0].length; j++) {
                System.out.print("|" + grid[i][j]);
            }
            System.out.println("|");
        }
    }
    private static void copyGrid(){
         gridSecondry=new String[grid.length][grid[0].length];
        for (int i = 0; i < gridSecondry.length; i++) {
            for (int j = 0; j < gridSecondry[0].length; j++) {
                gridSecondry[i][j]=grid[i][j];
            }

        }
    }
    public static void resetGrid(){
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                grid[i][j]=gridSecondry[i][j];
            }

        }
    }
}

package model;

import view.LandGame;

public class Grid_Stages {
    public static void stageOne(){
        LandGame.grid = new String[4][3];
        LandGame.grid[0][0] = "_";LandGame.grid[0][1] = "g";LandGame.grid[0][2] = "g";
        LandGame.grid[1][0] = "g";LandGame.grid[1][1] = "_";LandGame.grid[1][2] = "g";
        LandGame.grid[2][0] = "y";LandGame.grid[2][1] = "_";LandGame.grid[2][2] = "y";
        LandGame.grid[3][0] = "y";LandGame.grid[3][1] = "y";LandGame.grid[3][2] = "_";

    }
    public static void stagetwo(){
        LandGame.grid = new String[3][3];
        LandGame.grid[0][0] = "y";LandGame.grid[0][1] = "_";LandGame.grid[0][2] = "y";
        LandGame.grid[1][0] = "_";LandGame.grid[1][1] = "_";LandGame.grid[1][2] = "_";
        LandGame.grid[2][0] = "b";LandGame.grid[2][1] = "_";LandGame.grid[2][2] = "b";
    }
    public static void stageThree(){
        LandGame.grid = new String[4][3];
        LandGame.grid[0][0] = "_";LandGame.grid[0][1] = "_";LandGame.grid[0][2] = "_";
        LandGame.grid[1][0] = "g";LandGame.grid[1][1] = "y";LandGame.grid[1][2] = "y";
        LandGame.grid[2][0] = "g";LandGame.grid[2][1] = "g";LandGame.grid[2][2] = "g";
        LandGame.grid[3][0] = "_";LandGame.grid[3][1] = "_";LandGame.grid[3][2] = "_";
    }
    public static void stageFour(){
        LandGame.grid = new String[3][3];
        LandGame.grid[0][0] = "y";LandGame.grid[0][1] = "y";LandGame.grid[0][2] = "_";
        LandGame.grid[1][0] = "y";LandGame.grid[1][1] = "*";LandGame.grid[1][2] = "g";
        LandGame.grid[2][0] = "_";LandGame.grid[2][1] = "g";LandGame.grid[2][2] = "g";

    }
    public static void stageFive(){
        LandGame.grid = new String[4][4];
        LandGame.grid[0][0] = "*";LandGame.grid[0][1] = "_";LandGame.grid[0][2] = "y";LandGame.grid[0][3] = "*";
        LandGame.grid[1][0] = "g";LandGame.grid[1][1] = "_";LandGame.grid[1][2] = "s";LandGame.grid[1][3] = "_";
        LandGame.grid[2][0] = "_";LandGame.grid[2][1] = "y";LandGame.grid[2][2] = "_";LandGame.grid[2][3] = "_";
        LandGame.grid[3][0] = "*";LandGame.grid[3][1] = "s";LandGame.grid[3][2] = "g";LandGame.grid[3][3] = "*";
    }
    public static void stageSix(){
        LandGame.grid = new String[6][4];
        LandGame.grid[0][0] = "b";LandGame.grid[0][1] = "_";LandGame.grid[0][2] = "_";LandGame.grid[0][3] = "b";
        LandGame.grid[1][0] = "_";LandGame.grid[1][1] = "y";LandGame.grid[1][2] = "y";LandGame.grid[1][3] = "_";
        LandGame.grid[2][0] = "g";LandGame.grid[2][1] = "p";LandGame.grid[2][2] = "p";LandGame.grid[2][3] = "y";
        LandGame.grid[3][0] = "g";LandGame.grid[3][1] = "p";LandGame.grid[3][2] = "p";LandGame.grid[3][3] = "y";
        LandGame.grid[4][0] = "_";LandGame.grid[4][1] = "g";LandGame.grid[4][2] = "g";LandGame.grid[4][3] = "_";
        LandGame.grid[5][0] = "h";LandGame.grid[5][1] = "_";LandGame.grid[5][2] = "_";LandGame.grid[5][3] = "h";
    }
    public static void stageSeven(){
        LandGame.grid = new String[4][4];
        LandGame.grid[0][0] = "b";LandGame.grid[0][1] = "_";LandGame.grid[0][2] = "y"; LandGame.grid[0][3] = "y";
        LandGame.grid[1][0] = "_";LandGame.grid[1][1] = "*";LandGame.grid[1][2] = "_"; LandGame.grid[1][3] = "b";
        LandGame.grid[2][0] = "*";LandGame.grid[2][1] = "y";LandGame.grid[2][2] = "_";LandGame.grid[2][3] = "_";
        LandGame.grid[3][0] = "b";LandGame.grid[3][1] = "b"; LandGame.grid[3][2] = "*";LandGame.grid[3][3] = "_";
    }

}

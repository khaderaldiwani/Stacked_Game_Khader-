package controller;

import view.LandGame;

public class MoveRight extends Moves {

    public  void move(String[][] landGame){
        for (int i = landGame.length-1; i >=0 ; i--) {
            for (int j = landGame[0].length-1; j >=0 ; j--) {
                if(isColor(j, landGame[i])){
                    moveCell(landGame,landGame[i][j],i,j);
                }
            }
        }
    }

    protected void  moveCell(String[][]landGame,String value,int row,int column){
        for(int i = column; i <landGame[0].length-1 ; i++) {
            if (isSpace(landGame, value, row, column)) {
                swap(landGame, row, column);
                column=column+1;
            }
        }
        damageSameColor(landGame, value, row, column);
    }


    protected boolean isSpace(String[][] landGame, String value, int row, int column) {
        return (landGame[row][column+1].equals("_") );
    }


    protected void damageSameColor(String[][] landGame, String value, int row, int column) {
        if (column != LandGame.grid[0].length-1){
            if ( LandGame.grid[row][column+1].equals(value)){
                LandGame.grid[row][column]="_";
            }
        }
    }

    protected void swap(String[][] landGame, int row, int column) {
        String temp = landGame[row][column];
        landGame[row][column] = landGame[row][column+1];
        landGame[row ][column+1] = temp;
    }

}

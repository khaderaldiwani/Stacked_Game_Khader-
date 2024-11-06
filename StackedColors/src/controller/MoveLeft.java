package controller;

public class MoveLeft extends Moves {
    public  void move(String[][] landGame){
        for (int i = 0; i < landGame.length; i++) {
            for (int j = 0; j < landGame[0].length; j++) {
                if(isColor(j, landGame[i])){
                    moveCell(landGame,landGame[i][j],i,j);
                }
            }
        }
    }
    protected void  moveCell(String[][]landGame,String value,int row,int column){
        for(int i = column; i >0 ; i--) {
            if (isSpace(landGame, value, row, column)) {
                swap(landGame, row, column);
                column=column-1;
            }
        }
        damageSameColor(landGame, value, row, column);
    }
    protected boolean isSpace(String[][] landGame, String value, int row, int column) {
        return (landGame[row][column-1].equals("_"));
    }
    protected void damageSameColor(String[][] landGame, String value, int row, int column) {
        if (column !=0){
            if ( landGame[row ][column-1].equals(value)){
                landGame[row][column]="_";
            }
        }
    }

    protected void swap(String[][] landGame, int row, int column) {
        String temp = landGame[row][column];
        landGame[row][column] = landGame[row ][column-1];
        landGame[row ][column-1] = temp;
    }

}

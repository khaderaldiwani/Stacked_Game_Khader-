package controller;

public class MoveUp extends Moves{


    public void  move(String[][] landGame){

        for (int i = 0; i < landGame.length; i++) {
            for (int j = 0; j < landGame[0].length; j++) {
                if(isColor(j, landGame[i])){
                    moveCell(landGame,landGame[i][j],i,j);
                }
            }
        }
    }

//    protected   boolean isColor(int j, String[] landGame) {
//        return !(landGame[j].equals("_") || landGame[j].equals("*"));
//    }

    public  void  moveCell(String[][]landGame,String value,int row,int column){
        for(int i = row; i >0 ; i--) {
            if (isSpace(landGame, value, row, column)) {
                swap(landGame, row, column);
                row=row-1;
            }
        }
        damageSameColor(landGame, value, row, column);
    }

    protected boolean isSpace(String[][] landGame, String value, int row, int column) {
        return (landGame[row - 1][column].equals("_") );
    }

    protected void swap(String[][] landGame, int row, int column) {
        String temp = landGame[row][column];
        landGame[row][column] = landGame[row - 1][column];
        landGame[row - 1][column] = temp;
    }

    protected  void damageSameColor(String[][] landGame, String value, int row, int column) {
        if (row !=0){
            if ( landGame[row -1][column].equals(value)){
                landGame[row][column]="_";
            }
        }
    }

}

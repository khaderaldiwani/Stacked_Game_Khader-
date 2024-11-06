package controller;

abstract public class Moves {
 abstract public void move(String[][] landGame);
  abstract   protected  void  moveCell(String[][]landGame,String value,int row,int column);

 abstract protected   boolean isSpace(String[][] landGame, String value, int row, int column) ;

  abstract  protected   void swap(String[][] landGame, int row, int column) ;

  abstract   protected   void damageSameColor(String[][] landGame, String value, int row, int column) ;

  protected   boolean isColor(int j, String[] landGame) {
  return !(landGame[j].equals("_") || landGame[j].equals("*"));
 }
}

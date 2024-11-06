package controller;

public class Check {
    public static int colorCounter;

    public static boolean check(String[][] landGame){
        colorCounter= getColorsNumber(landGame);
        String[] colors=new String[colorCounter];
        inputColors(colors,landGame);
        for (int i = 0; i <colors.length ; i++) {
            if ( 1 < getcolorNumber(colors,colors[i]))
            {
                return false;
            }
        }
        return true;
    }

    public static int getColorsNumber(String[][] landGame){
        int counter=0;
        for (int i = 0; i < landGame.length; i++) {
            for (int j = 0; j < landGame[0].length; j++) {
                if (isColor(j,landGame[i])){
                    counter++;
                }
            }
        }
        return counter;
    }

    private static boolean isColor(int j, String[] landGame) {
        return !(landGame[j].equals("_") || landGame[j].equals("*"));
    }
    public static void inputColors(String[] colors,String[][] landGame){
        int counter=0;
        for (int i = 0; i < landGame.length; i++) {
            for (int j = 0; j < landGame[0].length; j++) {
                if (isColor(j,landGame[i])){
                    colors[counter]=landGame[i][j];
                    counter++;
                }
            }
        }
    }

    public static int getcolorNumber(String[] colors,String color){
        int counter=0;
        for (int i = 0; i < colors.length; i++) {
            if (colors[i].equals(color)){
                counter++;
            }
        }
        return counter;
    }

}

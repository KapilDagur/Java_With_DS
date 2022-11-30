import java.util.ArrayList;

public class BoardGame {
    public static ArrayList<String> borad(int startRow, int startCol, int endRow, int endCol) {
        if(startRow > endRow || startCol > endCol){
            ArrayList<String> list = new ArrayList<>();
            return list;
        }
        if(startRow == endRow && startCol == endCol){
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        }
        ArrayList<String> finalList = new ArrayList<>();
        ArrayList<String> downList = borad(startRow+1, startCol, endRow, endCol);
        for(String s:downList){
            finalList.add(s+"D");
        }
        ArrayList<String> rightList = borad(startRow, startCol+1, endRow, endCol);
        for(String t:rightList){
            finalList.add(t+"R");
        }
        return finalList;
    }

    public static void main(String[] args) {
        // borad(0, 0, 3, 3);
        System.out.println(borad(0, 0, 3, 3));
    }
}

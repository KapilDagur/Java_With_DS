import java.util.ArrayList;

public class DiceGame {
    static ArrayList<String> diseRoll(int start, int target){
        if(start == target){
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        }
        if(start > target){
            ArrayList<String> list = new ArrayList<>();
            return list;
        }
        //Dice from 1 to 6
        ArrayList<String> finalResult = new ArrayList<>();

        for(int dice = 1; dice <= 6; dice++){
            int currentValue = dice + start;
            ArrayList<String> list = diseRoll(currentValue, target);
            for(String s: list){
                finalResult.add(s + dice);
            }
            
        }
        return finalResult;
    }
    public static void main(String[] args) {
        ArrayList<String> result = diseRoll(0, 6);
        result.forEach(i->System.out.println(i));
    }
}

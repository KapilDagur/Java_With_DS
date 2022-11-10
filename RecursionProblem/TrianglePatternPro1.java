public class TrianglePatternPro1 {
    public static void printPattern(int number,int i,int j) {
        if(number <= 0)
            return;
        else if(i == j){
            System.out.println("*");
            printPattern(number-1, i+1, 0);
        }
        else{
        System.out.print("*");
            printPattern(number, i, j+1);
        }
    }
    public static void main(String[] args) {
        printPattern(5, 0, 0);
    }
}

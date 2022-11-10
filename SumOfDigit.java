public class SumOfDigit {
    public static int operation(int number) {
        if(number <= 0)
            return 0;
        return number % 10 + operation(number/10);
    }
    public static void main(String[] args) {
        int num = 123456;
        System.out.println("The Sum of Digit of Number "+num+" is : "+operation(num));
    }
}

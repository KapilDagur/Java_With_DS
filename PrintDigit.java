public class PrintDigit {
    public static void pattern(int number) {
        if(number <= 0)
            return;
        else
        {
            pattern(number/10);
            System.out.println(number%10);
        }
    }
    public static void main(String[] args) {
        pattern(123456);
    }
}

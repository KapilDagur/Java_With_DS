public class PrimeNumber {
    public static boolean isPrimeNumber(int number) {
        int result = checkPrime(number, 2);
        if(number == result)
            return true;
        else
            return false;
        
    }
    public static int checkPrime(int number, int i) {
        if(number % i == 0)
            if(i == number)
                return number;
            else
                return -1;
        return checkPrime(number, i+1);
    }
    public static void main(String[] args) {
        System.out.println(isPrimeNumber(33));
        System.out.println(isPrimeNumber(17));
    }
}

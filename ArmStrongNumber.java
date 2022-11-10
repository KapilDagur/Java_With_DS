public class ArmStrongNumber {

    public static int checkArmStrong(int number) {
        int arm = 0, digit = 0;
        if(number <= 0)
            return 0;
        digit = countDigit(number);
        arm = armLogic(number,digit);
        if(arm == number)
            return number;
        else
            return -1;
    }

    public static int countDigit(int number) {
        if(number <= 0){
            return 0;
        }
        else{
            return 1 + countDigit(number/10);
        }
    }

    public static int pow(int number,int power) {
        if(power <= 0)
            return 1;
        return number*pow(number,power-1);
    }

    public static int armLogic(int number,int digit) {
        if(number <= 0)
            return 0;
        else
        return pow(number%10,digit) + armLogic(number/10,digit);
    }

    public static void main(String[] args) {
        int test1 = 125,test2=153;
        System.out.println("ArmStrong : "+checkArmStrong(test1));
        System.out.println("ArmStrong : "+checkArmStrong(test2));   
    }
}

package ua.nure.antoniuk.Practice1;

/**
 * Created by Max on 25.10.2017.
 */
public class Part5 {
    private static final int START = 64;
    private static final int NOTATION = 26;

    public static void main(String[] args) {
        System.out.println("A ==> " + str2int("A") + " ==> " + int2str(1));
        System.out.println("B ==> " + str2int("B") + " ==> " + int2str(2));
        System.out.println("Z ==> " + str2int("Z") + " ==> " + int2str(26));
        System.out.println("AA ==> " + str2int("AA") + " ==> " + int2str(27));
        System.out.println("AZ ==> " + str2int("AZ") + " ==> " + int2str(52));
        System.out.println("BA ==> " + str2int("BA") + " ==> " + int2str(53));
        System.out.println("ZZ ==> " + str2int("ZZ") + " ==> " + int2str(702));
        System.out.println("AAA ==> " + str2int("AAA") + " ==> " + int2str(703));
    }

    public static int str2int(String number){
        char[] numbers = new StringBuilder(number).reverse().toString().toCharArray();
        int digit = 0;

        for(int i = 0; i < numbers.length; i++)
            digit += Math.pow(NOTATION, i) * (numbers[i] - START);

        return digit;
    }

    public static String int2str(int number){
        StringBuffer sb = new StringBuffer();
        int temp = number;

        while(temp != 0){
            temp /= NOTATION;
            if(number % NOTATION == 0){
                sb.append((char)(START + NOTATION));
                temp--;
            } else{
                sb.append((char)(START + number % NOTATION));
            }
            number = temp;
        }

        return sb.reverse().toString();
    }

    public static String rightColumn(String number){
        return int2str(1 + str2int(number));
    }
}

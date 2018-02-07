package ua.nure.antoniuk.Practice1;

/**
 * Created by Max on 25.10.2017.
 */
public class Part4 {

    public static void main(String[] args) {
        if(args.length != 1){
            System.out.println("Error: Uncorrect lenght");
            return;
        }
        int number = Integer.parseInt(args[0]);
        int sum = 0;

        while(number != 0){
            sum += number % 10;
            number /= 10;
        }

        System.out.println(sum);
    }
}

package ua.nure.antoniuk.Practice1;

/**
 * Created by Max on 25.10.2017.
 */
public class Part3 {

    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("Error: Lenght 0");
            return;
        } else if(args.length > 2){
            System.out.println("Error: Lenght more than 2");
            return;
        }

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        while(b != 0){
            int temp = a % b;
            a = b;
            b = temp;
        }

        System.out.println(a);
    }
}

package ua.nure.antoniuk.Practice1;

/**
 * Created by Max on 25.10.2017.
 */
public class Part2 {

    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("Error: Lenght 0");
            return;
        } else if(args.length > 2){
            System.out.println("Error: Lenght more than 2");
            return;
        }

        System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[1]));
    }
}

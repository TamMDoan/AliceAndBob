import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args ){

        // for later -- modify the message so that it's always uppercase A/B lowercase rest of name
        String name;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        name = input.next();

        if(name.equalsIgnoreCase("alice") || name.equalsIgnoreCase("bob")){
            System.out.println("Hello, " + name + "!");
        }
        else{
            System.out.println("You are neither Alice nor Bob.");
        }
    }
}

import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Simulator {
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        boolean appCompleted = false;

        do{
            try {
                System.out.print("How many dice would you like ot roll? : ");
                int numberOfDice = input.nextInt();
                appCompleted = true;
                System.out.println("About to roll "+ numberOfDice +"dice(s)");
    
                Random rand = new Random();
        
                for (int i = 0 ;i < numberOfDice; i++) {
                    int rolledNumber = rand.nextInt(6)+1 ;
                    System.out.print(display(rolledNumber));
        
                }
    
            } catch (InputMismatchException e){ 
                System.out.println("That is not a valid number.");
                input.next();
            }
        } while (!appCompleted);

        
        input.close();

    }

    static String display(int value){
        return switch (value){
            case 1-> "\n -----\n|     |\n|  o  |\n|     |\n -----\n";
            case 2-> "\n -----\n|o    |\n|     |\n|    o|\n -----\n";
            case 3-> "\n -----\n|o    |\n|  o  |\n|    o|\n -----\n";
            case 4-> "\n -----\n|o   o|\n|     |\n|o   o|\n -----\n";
            case 5-> "\n -----\n|o   o|\n|  o  |\n|o   o|\n -----\n";
            case 6-> "\n -----\n|o   o|\n|o   o|\n|o   o|\n -----\n";
            default-> "Not a valid dice value";
        };
    }                                                 
}


import java.util.Scanner;

public class MainQ2 {
    public static void main(String[] args) {
        final Scanner SCANNER = new Scanner(System.in);
        System.out.print(" Enter the string to get middle characters : ");
        String enteredString = SCANNER.nextLine();
        displayTheMiddleCharacter(enteredString);
    }

    public static void displayTheMiddleCharacter(String enteredString){

        int stringLength = enteredString.length();
        if (stringLength%2 == 0){
            System.out.print(" This are middle characters : ");
            System.out.print(enteredString.charAt(stringLength/2 - 1));
            System.out.print(" , ");
            System.out.print(enteredString.charAt(stringLength/2 +1 -1));
        }else {
            System.out.print(" This is the middle characters : ");
            System.out.print(enteredString.charAt(stringLength/2 +1 - 1));
        }

    }

}


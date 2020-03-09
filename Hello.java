import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {
        // Bring in new scanner for user input
        Scanner scan = new Scanner(System.in);
        // Strings for user inputs
        String userName;
        String userAge;
        String userHome;


	// WOWOWOWOWOWOWWOWWOOOWOOOWOOWOW

        // Automated conversation
        System.out.print("Hello. What is your name?");
        userName = scan.next();
        System.out.print("It's nice to meet you, " + userName + ". How old are you?");
        userAge = scan.next();
        System.out.println("I see that you are still quite young at only " + userAge + ".");
        System.out.print("Where do you live?");
        userHome = scan.next();
        System.out.println("Wow! I've always wanted to go to " + userHome + ". Thanks for chatting with me. Bye!");
    }
}
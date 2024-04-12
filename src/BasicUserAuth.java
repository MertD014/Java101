import java.util.Scanner;

public class BasicUserAuth {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Please set up your password: ");
        String password = s1.next();

        System.out.print("Login with your password: ");
        String input = s1.next();

        if(password.equals(input)){
            System.out.println("Login successful!");
        }
        else{
            System.out.println("Your password is wrong!");
            System.out.println("Would you like to reset your password?(Y/N)");
            input=s1.next();
            switch (input) {
                case "Y":
                    System.out.print("Enter your new password: ");
                    input = s1.next();
                    System.out.print("Re-enter your new password: ");
                    if(input.equals(s1.next())){
                        if(input.equals(password)){
                            System.out.println("You can not use your last password!"); //The most annoying thing ever!
                        }
                        else password=input;
                    }
                    else{
                        System.out.println("Passwords does not match!");
                    }
                    break;
                case "N":
                    System.out.println("Please reload the page!");
                    break;
                default:
                    break;
            }


        }

        s1.close();
    }
}

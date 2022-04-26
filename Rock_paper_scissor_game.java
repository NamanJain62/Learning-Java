import java.util.Random;
import java.util.Scanner;
public class Rock_paper_scissor_game {
    public static void main(String[] args) {
        String[] gchoice= {"Rock","Paper","Scissor"};
        Random ran = new Random();
        int r = ran.nextInt(gchoice.length);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your choice: ");
        String ychoice = sc.nextLine();

        if(ychoice.equals("Rock")) {
            if (gchoice[r].equals("Scissor")) {
                System.out.println("You win");
            }
            else if (gchoice[r].equals("Paper")) {
                System.out.println("You loss the game");
            }
            else {
                System.out.println("Game is Tie");
            }
        }

        if(ychoice.equals("Paper")) {
            if (gchoice[r].equals("Rock")) {
                System.out.println("You win");
            }
            else if (gchoice[r].equals("Scissor")) {
                System.out.println("You loss the game");
            }
            else {
                System.out.println("Game is Tie");
            }
        }

        if(ychoice.equals("Scissor")) {
            if (gchoice[r].equals("Paper")) {
                System.out.println("You win");
            }
            else if (gchoice[r].equals("Rock")) {
                System.out.println("You loss the game");
            }
            else {
                System.out.println("Game is Tie");
            }
        }


    }
}

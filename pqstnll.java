import java.util.Scanner;
public class pqstnll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String question = "Extension of java?";
        String choice_1 = ".jva";
        String choice_2 = ".java";
        String choice_3 = ".jvr";
        System.out.println(question);
        System.out.println(choice_1);
        System.out.println(choice_2);
        System.out.println(choice_3);
        System.out.print("Your Choice: ");
        String answer = sc.next();
        if(answer.equals(choice_2))
        {
            System.out.println("You answer is correct");
        }
        else {
            System.out.println("Sorry!, Wrong answer");
        }


    }
}

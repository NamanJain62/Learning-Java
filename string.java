import java.util.Scanner;
public class string {
    public static void main(String[] args) {
        //String name = new String("Naman");
        String name1 = "Naman";
        System.out.println(name1);
        int a=6;
        float b=5.654f;
        System.out.printf("The value of a is %d and the value of b is %f\n",a,b);//this is from C language %d for int
        // ,%f for float,%c for char,%s for string
        System.out.format("the value of a is %d and the value of b is %f\n",a,b);
        Scanner sc = new Scanner(System.in);
        String st=sc.nextLine();
        System.out.println(st);

    }
}

import java.util.Scanner;
public class kmtomiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Kilometer:");//Print
        float km= sc.nextFloat();//take input from user
        float miles=km*0.621371F;//convert kilometer into miles that is in float
        System.out.print("in Miles:");
        System.out.println(miles);//print the distance in miles.
    }
}

import java.util.Scanner; //import this util scanner for taking input of any datatype

public class c2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //derive the Scanner in java
        String name=sc.next(); //next is use to take input as String
        System.out.println(name);//this will print the give name
        //Note if we write (hello naman) so it will read only hello, so to read this also we use (sc.nextLine())
    }
}
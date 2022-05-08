public class fntn {
    public static int readnumber(int n){                //in place of void i use int becoz i want to use their solution on other scope
        System.out.print("This Number is ");
        if(n % 2 == 0){
            System.out.println("Even number");
        }
        else {
            System.out.println("Odd number");
        }
        return n;             //here it show the return n i.e. integer so we use the output of function as a integer for more expansion of code
    }
    public static void main(String[] args) {
        System.out.println("Code for Practicing function in Java");

        readnumber(10);
        System.out.println("you done the job");

        int new_n = readnumber(10) / 5;   //here we use the function solution as a data for others
        System.out.println(new_n);

    }
}

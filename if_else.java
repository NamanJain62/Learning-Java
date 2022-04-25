public class if_else {
    public static void main(String[] args) {
        ////////////////////////////////////  If-else statement ///////////////////////////
        int age = 36;
        if(age>18)                      //if-else statement is basically if (condition) is true then print if statement while else statement print
        {
            System.out.println("You are eligible for voteId");
        }
        else
        {
            System.out.println("You are not eligible for voterId");
        }


/////////////////////////////////////////////////////   SWITCH-CASE Statement   ////////////////////////////////////////////////////////////////




        switch (age)       //we use this when we have multiple choice for one thing
        {
            case(23):
                System.out.println("you are Good person");
                break;

            case(26):
                System.out.println("you are nice");
                break;

            default:
                System.out.println("You are bad");
        }

    }
}

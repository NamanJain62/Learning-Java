public class loop {
    public static void main(String[] args) {
        //Loops
        System.out.println("while Loop");

        int i =1;
        while(i<=4)    //this is the while loop under the bracket is the condition
        {
            System.out.println(i); //print i
            i++;                         //increment the value of i every time unitl condition false
        }
        //do-while Loop
        System.out.println("do_while loop");

        int a=1;
        do {                      //in this loop one time variable will enter into loop
            System.out.println(a); //atleast one time definitly print
            a++;
        }while(a<10);
        //for loop
        System.out.println("For loop");

        int b;
        for(b=0;b<10;b++)
        {
            System.out.println(b);

        }

        System.out.println("break and continue");

        int c;
        for(c=0;c<10;c++)
        {
            System.out.println(c);
            if(c==5){
                System.out.println("End the Loop");
                break;                             //this will help to break the loop whether the condition is true and false
            }
        }

        int d;
        for(d=0;d<10;d++)
        {
            System.out.println(d);
            if(d==5){
                System.out.println("End the Loop");
                continue;                             //this will help to break the loop whether the condition is true and false
            }
            System.out.println("continue");
        }
    }
}

public class emplye {
    String name;
    int age;
    double salary;
    String location;

    emplye(String name, int age, double salary, String location) {      //constructor of this class
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.location = location;
    }

    void salarycomparison()    //function for making this code accessible to any user and to look simple
    {
        if(this.salary >80000)
        {
            System.out.println("You have reached excellence Mr."+ this.name);
        }
        else
        {
            System.out.println("Try Hard Mr."+ this.name);
        }

        if(this.age >24)
        {
            System.out.println("You are young Mr."+this.name);
        }
        else
        {
            System.out.println("You are still young Mr."+this.name);
        }
    }

    public static void main(String[] args) {
        emplye emplye_1 = new emplye("hfgbnf",25,91000,"Gaya");
        emplye emplye_2 = new emplye("fgbfgn",24,71000,"Shimla");

        emplye_1.salarycomparison();   //calling the function
        emplye_2.salarycomparison();   //calling the function
    }
}

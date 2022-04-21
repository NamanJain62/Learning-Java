
public class operatorexpression {
    public static void main(String[] args) {
        int a=4;
        int b=3;
        int c=a+b;//a-b,a*b,a/b,a++,a-- this all are arithmetic operator
        int d=a%b;//it is modulo operator(it give the remainder of a/b)
        b +=3;//it is assignment operator ex: -=,=
        System.out.println(a==b);//a>b,a<b,a>=b,a<=b all are comparison operator
        System.out.println(a>9&&b>8);// it is logical operator
        System.out.println(8&3);//it is bitwise operator it work only in binary(&,!,||)
        System.out.println(b);
    }
}

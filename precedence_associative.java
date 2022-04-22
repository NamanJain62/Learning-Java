public class precedence_associative {
    public static void main(String[] args) {
        int a=4;
        int b =48;
        int c=a*b-b/8;// this will happen according to precedence rule bcuz * have more precedence than - (also it will read data from left to right
        int k = (b*b-(4*a*c))/(2*a);// the precedence of () is more than *,/ so 2304 - 2976 then 2*a=8 2304-2976 = -672 after that -672/8 = -84
        System.out.println(c);//as we know (),/,*,-,+, all read from left to right
        System.out.println(k);

    }
}

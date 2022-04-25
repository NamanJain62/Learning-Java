
public class str_method {
    public static void main(String[] args) {
        String name = "Harry";//indexes H=0,a=1,=2,r=3,y=4
        System.out.println(name.length());// give the no of length

        System.out.println(name.toLowerCase());//it convert string into lower case whether it will be in lower or higher

        System.out.println(name.toUpperCase());//it convert string into upper case.........same

        System.out.println(name.trim());//it will eliminate all blank space in string

        System.out.println(name.substring(1,4));//give string from index 1 to index 4 i.e. arry

        System.out.println(name.replace('r','p'));//replace the string words r to p i.e. Happy

        System.out.println(name.startsWith("Ha")); //check string start wth 'ha' or not if yes print true else false
        System.out.println(name.endsWith("y"));//check string ends with 'y'..........same

        System.out.println(name.charAt(4));//print char that start from index 4

        System.out.println(name.indexOf("ry"));//print index of 'ry' but it will print only starting index for 'ry'
        System.out.println(name.indexOf("ary"));//if wrong string given then print -1

        System.out.println(name.lastIndexOf("a",4));//print index but from last

        System.out.println(name.equalsIgnoreCase("harry"));//check string match or not and print true or false
    }
}

public class triangle {
    double base;
    double height;
    double sidelenone;
    double sidelentwo;
    double sidelenthree;
    public triangle(double base,double height, double sidelenone, double sidelentwo, double sidelenthree)
    {
        this.base = base;
        this.height = height;
        this.sidelenone = sidelenone;
        this.sidelentwo = sidelentwo;
        this.sidelenthree = sidelenthree;
    }
    public double area(){
        return (this.base*this.height)/2;
    }

    public static void main(String[] args) {
        triangle triangleA = new triangle(15,8,15,8,17);
        double teianglearea = triangleA.area();
        System.out.println(teianglearea);

    }
}

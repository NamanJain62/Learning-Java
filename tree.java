public class tree {
    double height;
    double trunkdiameter;
    enum treetype{
        magoe,
        banana,
        pineapple,
        apple
    }
    treetype type;

    void grow(){
        this.height=this.height+10;
        this.trunkdiameter=this.trunkdiameter+1;
    }

    tree(double height, double trunkdiameter, treetype type){
        this.height=height;
        this.trunkdiameter=trunkdiameter;
        this.type = type;
    }

    void heightmesre(){
        if(this.height <100)
        {
            System.out.println("This "+this.type+" tree is tall");
        }

        if(this.height <100)
        {
            System.out.println("This "+this.type +" tree is tall");
        }
    }

    public static void main(String[] args) {
        tree treemagoe = new tree(25,5,treetype.magoe);

        tree treeapple = new tree(25,5,treetype.apple);

        treemagoe.heightmesre();
    }
}

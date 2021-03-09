package accolitegithuhubtest.niket;
import javax.swing.plaf.synth.SynthTextAreaUI;

class parentClass{
    private int var1;
    public int var2=10;
    public int var3=100;
    public int a;


    parentClass(){
        System.out.println("Parent Class");
    }
    parentClass(int a){
        this.a=a;
        System.out.println(this.a);

    }

    void methodOverride(){
        System.out.println("Parent Class Function");
    }

}

class childClass extends parentClass{

    childClass(){
        System.out.println("Child Class");
    }

    void methodOverride(){
        super.methodOverride();
        System.out.println("Child Class Function");
    }
}


class childClass2 extends childClass{
    childClass2(){
        System.out.println("Child Class 2");
    }

    void methodOverload(int a){
        System.out.println(a);
    }

    void methodOverload(int a,int b){
        System.out.println(a);
        System.out.println(b);
    }
}


public class Inheritance {
    public static void main(String[] args){

        parentClass p= new parentClass();
        p.methodOverride();

        parentClass p1= new parentClass(10);


        System.out.println("---------------");

        childClass c= new childClass();
        System.out.println(c.var2);
        System.out.println(c.var3);
        c.methodOverride();
        System.out.println("---------------");

        childClass2 c2= new childClass2();
        c2.methodOverload(10);
        c2.methodOverload(10,20);
        System.out.println("----------------");

    }
}


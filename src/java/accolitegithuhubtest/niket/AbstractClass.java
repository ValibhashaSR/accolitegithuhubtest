package accolitegithuhubtest.niket;
abstract class exampleClass{
    abstract void abstractMethod();
}


interface exampleInterface
{
    void method1();
    void method2();
}

class AbstractClass extends exampleClass implements exampleInterface{
    void abstractMethod(){
        System.out.println("hi");
    }

    public void method1(){
        System.out.println("hi 1");
    }

    public void method2() {
        System.out.println("hi 3");
    }

    public static void main(String args[]){
        exampleClass obj = new AbstractClass();
        obj.abstractMethod();

        AbstractClass a = new AbstractClass();
        a.method1();
        a.method2();
    }
}
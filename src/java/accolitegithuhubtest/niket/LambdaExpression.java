import java.util.ArrayList;
import java.util.List;

interface InterfaceSample{
    void printItem(int x, int y);
}

public class LambdaExpression {

    public static  void main(String[] args){
        InterfaceSample interfaceSample= (int x,int y)->{
            System.out.println(x+y);
        };
        interfaceSample.printItem(10,20);

        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        list.forEach((x)->{
            System.out.println("-------------------"+(x+10)+"------------------");
        });

    }
}

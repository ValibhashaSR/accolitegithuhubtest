package accolitegithuhubtest.niket;
import javax.annotation.processing.SupportedSourceVersion;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.net.Inet4Address;
import java.util.*;
import java.util.stream.Collectors;

class MethodParameterExample {
    void method1(){
        System.out.println("method1");
    }
    int method2(int a){
        return a+10;
    }

    float method3(float a, float b){
        return a/b;
    }

}

@FunctionalInterface
interface FunctionInterface{
    //It can have n number of static and default method but have only one abstract method
    void oneAbstractMethod();
    default void anotherMethod(){
        System.out.println("Default Method");
    }
}


//public class Java8Features implements FunctionInterface {
public class Java8Features{
//    public void oneAbstractMethod(){
//        System.out.println("Abstract Method");
//    }

        public static void oneAbstractMethodDefination(){
        System.out.println("Abstract Method");
    }

    public static  void main(String[] args){

//        FunctionInterface functionInterface= new Java8Features();
//        functionInterface.oneAbstractMethod();
//        functionInterface.anotherMethod();

            FunctionInterface functionInterface = Java8Features::oneAbstractMethodDefination;
            functionInterface.oneAbstractMethod();

        // Strem
        ArrayList<Integer> arrayList= new ArrayList<>();
        arrayList.add(10);
        arrayList.add((30));
        arrayList.add(-1);
        arrayList.add(0);

        Integer num[]= arrayList.toArray(new Integer[0]);
        Arrays.parallelSort(num);
        for(Integer x: num){
            System.out.println(x);
        }
        System.out.println("------------------");

        List<Integer> list1= arrayList.stream().filter(x -> x<=10).collect(Collectors.toList());
        for(Integer x: list1){
            System.out.println(x);
        }

        arrayList.stream().forEach(x -> System.out.println("-------"+x+"-----"));
        arrayList.forEach(x->System.out.println("------------------"+x+"++++++++++++++"));


        int sum=arrayList.stream().collect(Collectors.summingInt(x-> x));
        System.out.println(sum);

        Map<Integer,Integer> map= arrayList.stream().collect(Collectors.toMap(x->x, x->x));
        System.out.println(map);


        List<Integer> integerList= arrayList.stream().map(x-> x+10).collect(Collectors.toList());
        System.out.println("Map Use:- "+integerList);

        arrayList.stream().limit(2).forEach(x->System.out.println(x));

        Optional<Integer> sum1=arrayList.stream().reduce((a, b)->a+b);
        System.out.println("Sum is "+sum1.get());

        System.out.println(arrayList.stream().sorted((a,b)->{

            if((a+b)>10){
                return 1;
            }
            else if ((a+b)<20 && (a+b)>10){
                return -1;
            }
            else{
                return 0;
            }
        }).collect(Collectors.toList()));


        StringJoiner stringJoiner= new StringJoiner("-","[","]");
        stringJoiner.add("hi");
        stringJoiner.add("hello");
        System.out.println(stringJoiner);

        StringJoiner stringJoiner1= new StringJoiner(":","[","]");
        stringJoiner1.add("hi");
        stringJoiner1.add("hello");
        System.out.println(stringJoiner);

        StringJoiner stringJoiner2= stringJoiner.merge(stringJoiner1);
        System.out.println(stringJoiner2);


        System.out.println("------------------------------");

        MethodParameterExample methodParameterExample= new MethodParameterExample();

        Class cls= methodParameterExample.getClass();

        Method method[]= cls.getDeclaredMethods();

        for(Method m: method){
            System.out.println(m.getName() + " Return Type :- "+m.getReturnType());
            Parameter parameter[]= m.getParameters();
            for(Parameter p: parameter){
                System.out.println(p.getName()+" "+p.getParameterizedType());

            }
            System.out.println("++++++++++++++++++++");
        }


    }

}

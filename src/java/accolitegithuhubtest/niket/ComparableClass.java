import java.util.*;
import java.util.concurrent.ConcurrentMap;

public class ComparableClass implements Comparable<ComparableClass> {
    public int num;
    ComparableClass(int num){
        this.num=num;
    }
    public int compareTo(ComparableClass c){
        if(c.num > num){
            return -1;
        }
        else if(c.num < num)
            return 1;
        else
            return 0;

    }

    public static  void main(String[] args){
        ArrayList<ComparableClass> arrayList= new ArrayList<>();

        arrayList.add(new ComparableClass(10));
        arrayList.add(new ComparableClass(0));
        arrayList.add(new ComparableClass(-1));
        arrayList.add(new ComparableClass(100));

        Collections.sort(arrayList);
        for (ComparableClass c: arrayList){
            System.out.println(c.num);
        }



    }
}

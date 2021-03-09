package accolitegithuhubtest.niket;
import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.*;

public class MapCollections {


    public  static  void main(String[] args){
        Map<Integer,String> integerStringMap= new HashMap<>();

        integerStringMap.put(1,"Niket");
        integerStringMap.put(2,"Naman");
        integerStringMap.put(3,"jain");

        System.out.println(integerStringMap.get(2));

        Set s = integerStringMap.entrySet();
        Iterator itr= s.iterator();
        while(itr.hasNext()){
            Map.Entry entry= (Map.Entry) itr.next();
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        for(Map.Entry m: integerStringMap.entrySet()){
            System.out.println(m.getValue());
        }

System.out.println("------------------------------");
        Map<Integer,String> treeMap= new TreeMap<>();

        treeMap.put(100,"Niket");
        treeMap.put(20,"Naman");
        treeMap.put(3,"jain");

        for(Map.Entry m: treeMap.entrySet()){
            System.out.println(m.getKey());
            System.out.println(m.getValue());
        }



    }
}

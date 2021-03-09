package java.accolitegithuhubtest.niket;
import java.util.*;

public class SetCollections {
    public static void main(String[] args){
        HashSet<Integer> hashSet= new HashSet<>();
        LinkedHashSet<Integer> linkedHashSet= new LinkedHashSet<>();
        SortedSet<Integer> sortedSet= new TreeSet<>();

        for(int i=0;i<70;i+=10){
            hashSet.add(i);
            linkedHashSet.add(i) ;
            sortedSet.add(i);
        }

        Iterator itrSet= hashSet.iterator();
        while(itrSet.hasNext()){
            System.out.println(itrSet.next());
        }
        System.out.println(hashSet.size());
        hashSet.add(10);
        System.out.println(hashSet.size());


        System.out.println("-----------------------");


        Iterator itrLinkedHashSet= linkedHashSet.iterator();
        while (itrLinkedHashSet.hasNext()){
            System.out.println(itrLinkedHashSet.next());
        }


        System.out.println("-----------------------------");

        Iterator itrSortedSet= sortedSet.iterator();
        while(itrSortedSet.hasNext()){
            System.out.println(itrSortedSet.next());
        }

        sortedSet.remove(10);
        System.out.println(sortedSet.size());
    }
}

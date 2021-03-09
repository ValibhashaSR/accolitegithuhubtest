import java.util.*;

public class ListCollection {
    public static void main(String[] args){
        ArrayList<Integer> array= new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        Vector<Integer> vector= new Vector<>();
        Stack<String> stack= new Stack<String>();

        for(int i=10;i<70;i=i+10){
            array.add(i);
            linkedList.add(i);
            vector.add(i);
            stack.push(Integer.toString(i));
        }

        //Array List
        Iterator itr= array.listIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("---------------------");


        //Vector
        Iterator itrVector= vector.listIterator();
        while(itrVector.hasNext()){
            System.out.println(itrVector.next());
        }
        System.out.println("---------------------");


        //Stack
        Iterator itrStack= array.listIterator();
        while(itrStack.hasNext()){
            System.out.println(itrStack.next());
        }
        System.out.println("Popped Element");
        System.out.println(stack.pop());
        System.out.println(stack.pop());


        System.out.println("---------------------");
        //Linked List
        Iterator itrLinked= linkedList.listIterator();
        while(itrLinked.hasNext()){
            System.out.println(itrLinked.next());
        }

    }
}

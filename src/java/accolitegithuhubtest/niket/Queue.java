package java.accolitegithuhubtest.niket;
import java.util.*;

public class Queue {

    public static void main(String[] args){
        PriorityQueue<Integer> queue= new PriorityQueue<>();
        Deque<Integer> deque= new ArrayDeque<Integer>();

        for(int i=70;i>=0;i=i-10){
                queue.add(i);
                deque.add(i);
        }

        Iterator itrQueue= queue.iterator();
        while (itrQueue.hasNext()){
            System.out.println(itrQueue.next());
        }
        System.out.println("----------------------");
        while(queue.size()!=0) {
            //System.out.println(queue.peek());
            System.out.println(queue.poll());
        }
        System.out.println(queue.size());

        System.out.println("------------------------");

        Iterator itrDequeue= deque.iterator();
        while(itrDequeue.hasNext()){
            System.out.println(itrDequeue.next());
        }

        System.out.println("------------------------");
        deque.addFirst(0);
        deque.peek();
        deque.addLast(70);
        Iterator itrnew= deque.descendingIterator();
        while(itrnew.hasNext()){
            System.out.println(itrnew.next());
        }
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());

    }
}

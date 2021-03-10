package accolitegithuhubtest.nishu;
import java.util.*;

class A{
	public void print(List<String>list)
	{
		list.forEach(item->
		{
			System.out.println(item);
		});
	}
	public List<String> add(ArrayList<String> l){  
        l.add("Lily");
        l.add("Hibiscus");
        return l;
      }  
}
public class examples {
	public static void main(String[] args)
	{
		//ParallelSort
		int[] arr= {2,4,65,34,23};
		System.out.println("Before Sorting");
		for(int i=0;i<arr.length;i++)
			System.out.println("Value at "+i + " is "+arr[i]);
		Arrays.parallelSort(arr);
		System.out.println("After Sorting");
		for(int i=0;i<arr.length;i++)
			System.out.println("Value at "+i + " is "+arr[i]);
		//Type Inference
		A a=new A();
		List<String> animals = new ArrayList<String>();
		animals.add("Dog");
		animals.add("Cat");
		a.print(animals);
		List<String> birds = new ArrayList<>();
		birds.add("Parrot");
		birds.add("Peacock");
		a.print(birds);
		a.print(a.add(new ArrayList<>()));
    }  
	}
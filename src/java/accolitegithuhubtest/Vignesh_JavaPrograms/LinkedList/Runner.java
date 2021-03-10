package accolitegithuhubtest.Vignesh_JavaPrograms.LinkedList;

public class Runner {

	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.insert(10);
		l1.insert(20);
		l1.insert(30);
		l1.insert(40);
		l1.insert(45);
		l1.insert(50);
		l1.insertAtStart(5);
		l1.insertAt(3, 25);
		l1.deleteAt(3);
		l1.display();

	}
}

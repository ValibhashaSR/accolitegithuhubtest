package accolitegithuhubtest.Vignesh_JavaPrograms.LinkedList;

public class LinkedList {

	Node head;
	
	public void insert(int data){
		Node newNode=new Node();
		newNode.data=data;
		newNode.next=null;
		
		if(head==null){
			head=newNode;
		}else {
			Node n=head;
			while(n.next!=null){
				n=n.next;
			}
			n.next=newNode;
		}
	}
	
	public void display(){
		Node n=head;
		while(n.next!=null){
			System.out.println(n.data);
			n=n.next;
		}
		System.out.println(n.data);
		
		
	}
	
	public void insertAtStart(int data){
		Node newNode=new Node();
		newNode.data=data;
		newNode.next=head;
		head=newNode;
	}
	
	public void insertAt(int index,int data){
		Node newNode=new Node();
		newNode.data=data;
		newNode.next=null;
		Node n=head;
		for(int i=0;i<index-1;i++){
			n=n.next;
		}
		newNode.next=n.next;
		n.next=newNode;
		
	}
	
	public void deleteAt(int index) {
		if(index==0){
			head=head.next;
		}else{
		Node n=head;
		Node n1=null;
		for(int i=0;i<index-1;i++){
			n=n.next;
			System.out.println("delete at loop-->"+n.data);
		}
		n1=n.next;
		System.out.println("N1-->"+n1.data);
		System.out.println("N1.next-->"+n1.next.data);
		n.next=n1.next;
		}
	}
}

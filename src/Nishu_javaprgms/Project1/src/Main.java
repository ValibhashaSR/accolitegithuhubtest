
public class Main {
	public static void main(String[] args) {
		int i=0;
		for(;i<5;i++)
		{
			System.out.println(i);
		}
		while(i<10)
		{
			System.out.println(i);
			i++;
		}
		if(i<=10)
			System.out.println("Less than 10");
		else
			System.out.println("More than 10");
		i++;
		switch(i)
		{
		case 9: System.out.println("9");
		break;
		case 10: System.out.println("10");
		break;
		default:
			System.out.println(i);
		}
	}
}

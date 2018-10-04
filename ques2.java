import java.util.Scanner;
class Node
{
	int data;
	Node next;
}
 class Duplicate
{

	Node head;
	public void create(int n)
	{
		Scanner s = new Scanner(System.in);
		Node tmp = null;
		while(n > 0)
		{
			n--;
			System.out.println("Enter the data to insert");
			int d = s.nextInt();
			Node newnode = new Node();
			newnode.data = d;
			if(head == null)
			{
				head = newnode;
				tmp = newnode;
			}
			else
			{
				tmp.next = newnode;
				tmp = tmp.next;
			}
		}
	}
	public void display()
	{
		Node tmp = head;
		while(tmp != null)
		{
			System.out.println(tmp.data + " ");
			tmp = tmp.next;
		}
	}
	public void  removeDupli()
	{
		Node tmp = head;
		while(tmp.next != null)
		{
			if(tmp.data == tmp.next.data)
			{
				tmp.next = tmp.next.next;
			}
			else
				tmp = tmp.next;
		}

	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of linklist");
		int n = sc.nextInt();
		Duplicate obj = new Duplicate();
		obj.create(n);
		System.out.println("original linklist is");
		obj.display();
		obj.removeDupli();
		System.out.println("After removing duplicates linklist is");
		obj.display();
	}
}
import java.util.Scanner;
class Node
{
	int data;
	Node next;
}
 class reverse
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
	public void reverse()
	{
		Node cur = head, prev = null, next = null;
		while(cur != null)
		{
			next = cur.next;
			cur.next = prev;
			prev = cur;
			cur =  next;
		}
		head = prev;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of list");
		int n = sc.nextInt();
		reverse obj = new reverse();
		obj.create(n);
		System.out.println("original linklist is");
		obj.display();
		System.out.println("reverse linklist is");
		obj.reverse();
		obj.display();
	}
}
import java.util.Scanner;
class Node
{
	int data;
	Node next;
}
 class swap
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
	public boolean swap(int i,int j,int size)
	{
		int c = 1;
		Node t = head, k = head;
		if(i < 0 || j < 0 || i > size || j > size) return false;
		else
		{
			while(c != i)
			{
				t = t.next;
				c++;
			}
			int d = t.data;
			c = 1;
			while(c != j)
			{
				k = k.next;
				c++;
			}
			int tmp = t.data;
			t.data = k.data;
			k.data = tmp;
		}
		return true;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of linklist");
		int n = sc.nextInt();
		swap obj = new swap();
		obj.create(n);
		System.out.println("original linklist is");
		obj.display();
		System.out.println("Enter the first postion to swap element");
		int p = sc.nextInt();
		System.out.println("Enter the second postion to swap element");
		int t = sc.nextInt();
		if(obj.swap(p,t,n))
		{
			System.out.println("After swap linklist is");
			obj.display();
		}
		else System.out.println("No such position");
	}
}
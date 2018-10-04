import java.util.Scanner;
class Node
{
	int data;
	Node next;
}
class oddeven
{

	public Node create(int n,Node head)
	{
		System.out.println("Enter elements:");
		Scanner s = new Scanner(System.in);
		Node tmp = null;
		while(n > 0)
		{
			n--;
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
		return head;
	}
	public void display(Node head)
	{
		Node tmp = head;
		while(tmp != null)
		{
			System.out.println(tmp.data + " ");
			tmp = tmp.next;
		}
	}
	public Node arrange(Node head)
	{
		Node ptr = head,eptr = null,e = null,o = null,optr = null;
		while(ptr != null)
		{
			if(ptr.data % 2 == 0)
			{
				if(e == null)
				{
					e = ptr;
					eptr = ptr;
					ptr = ptr.next;
				}
				else
				{
					eptr.next = ptr;
					eptr = eptr.next;
					ptr = ptr.next;
				}
			}
			else
			{
				if(o == null)
				{
					o = ptr;
					optr = ptr;
					ptr = ptr.next;
				}
				else
				{
					optr.next = ptr;
					optr = optr.next;
					ptr = ptr.next;
				}	
			}

		}
		if(e != null)
		{
		eptr.next = o;		 
		return e;
		}
		return o;
	}
	public static void main(String args[])
	{
		Node head = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of linklist");
		int n = sc.nextInt();
		oddeven obj = new oddeven();
		head = obj.create(n,head);
		System.out.println("original linklist is");
		obj.display(head);
		Node p = obj.arrange(head);
		System.out.println("After arrangeing odd and even element list is");
		obj.display(p);
	}
}
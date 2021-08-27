package day7;

import java.util.Scanner;

class Node
{
	int data;
	Node next;
}

class Stack_List
{
	Node head;
	public Stack_List() {
		head = null;
	}
	public Node createNode(int ele)
	{
		Node temp = new Node();
		temp.data = ele;
		temp.next =null;
		return temp;
	}
	public void insertend(int ele)
	{
		Node newnode = createNode(ele);
		if(head==null)
			head = newnode;
		else
		{
			Node temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=newnode;
		}			
	}
	public void display()
	{
		
		if(head==null)
			System.out.println("no elements in Stack");
		else
		{
			System.out.println("stack elements are=");
			Node temp=head;
			while(temp!=null)
			{
				System.out.println(temp.data);
				temp=temp.next;
			}
		}
			
	}
}
public class Pg3_StackLinkedlist {

	public static void main(String[] args) {
		Stack_List st = new Stack_List();
		Scanner ob = new Scanner(System.in);
		int ch,ele;
		do
		{
			System.out.println("1 PUSH 2 POP 3 DISPLAY 4 EXIT");
			ch=ob.nextInt();
			switch(ch)
			{
				case 1:System.out.println("Enter element = ");
						ele=ob.nextInt();
						st.insertend(ele);
						break;			
				case 3:st.display();break;
				case 4: break;
			}
		}while(ch!=4);

	}

}

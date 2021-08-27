package day7;

import java.util.Scanner;

class Student
{
	int marks;
	String name;
	void getdata()
	{
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter name & marks");
		name = ob.nextLine();
		marks=ob.nextInt();
	}
	void display()
	{
		System.out.println("___________________");
		System.out.println("NAME    = "+ name);
		System.out.println("MARKS   = "+ marks);
		System.out.println("___________________");
	}
}
public class Pg1_arrayOb {

	public static void main(String[] args) {
		int n;

		Scanner ob = new Scanner(System.in);
		System.out.println("Enter no of records ");
		n = ob.nextInt();
		Student studist[] = new Student[n];
		for(int i=0;i<n;i++)
		{
			studist[i] = new Student();
			studist[i].getdata();
		}
		String searchkey;
		ob.nextLine();
		System.out.println("Enter name of the record");
		searchkey=ob.nextLine();
		System.out.println("you have entered search name= "+ searchkey);
		int flag=1;
		for(int i=0;i<n;i++)
		{
			if(studist[i].name.equals(searchkey))
			{
				flag=0;
				System.out.println("Record num = "+(i+1));
				studist[i].display();				
			}
		}
		if(flag==1)
			System.out.println("no records with name = "+ searchkey);
	}
}

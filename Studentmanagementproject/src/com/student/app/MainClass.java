package com.student.app;
import java.util.*;
public class MainClass {
	public static Student search(Collection<Student> data,int keyelement)
	{
		Iterator<Student> i =data.iterator();
		while(i.hasNext())
		{
			Student temp =i.next();
			if(temp.getId()== keyelement)
			{
				return temp;
			}
		}
		return null;
	}
	public static boolean remove(Collection<Student> data,int keyelement)
	{
		Iterator<Student> i =data.iterator();
		while(i.hasNext())
		{
			Student temp =i.next();
			if(temp.getId()== keyelement)
			{
				 i.remove();
				 return true;
				 
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Student> ls = new ArrayList<>();
		int id=0;
		String name=null;
		int age=0;
		while(true)
		{
		System.out.println("1:Add student details");
		System.out.println("2:Search a student");
		System.out.println("3:Remove a student");
		System.out.println("4:Update a student");
		System.out.println("0:Exit");
		System.out.println("Enter the above choice to do operation:");
		int n=scan.nextInt();
		if(n==1)
		{
			System.out.println("Enter how many students you want to add:");
			int count = scan.nextInt();
             for(int i=0;i<count;i++) {
            System.out.println("Enter the ID:");
			 id=scan.nextInt();
			 scan.nextLine();
			 System.out.println("Enter the Name:");
			 name = scan.nextLine();
			 System.out.println("Enter the Age:");
			  while(true) {
				  
			      age = scan.nextInt();
			      if(age > 0) 
			    	  {
			    	  break;
			    	  }
			      System.out.println("Enter age greater than 0");
					System.out.println("Enter the Age:");

			  }
			  Student obj = new Student(id,name,age);
			  
			 if(search(ls,id)!=null)
			 {
				 System.out.println("ID already exists");
			 }
			 else {
			 ls.add(obj);
			 }
			
             }
			 for(Student s:ls)
			 {
				 System.out.println(s);
			 }
        }
	

		else if(n==2)
		{
			System.out.println("Enter the student id to search:");
			int keyelement = scan.nextInt();
			Student res = search(ls,keyelement);
			if(res!=null)
			{
				System.out.println("Student found");
				System.out.println(res);
			}
			else
			{
				System.out.println("Student does not exist");
			}
		}
		else if(n==3)
		{
			System.out.println("Enter the student id to remove:");
			int keyelement = scan.nextInt();
			boolean removed= remove(ls,keyelement);
			if(removed) {
			System.out.println("The student with the id:"+keyelement+" was removed");
			for(Student s:ls)
			 {
				 System.out.println(s);
			 }
			}
			else {
				System.out.println("Student does not exist");
			}
        }
		else if(n==4)
		{
			System.out.println("Enter the student id to update:");
			int keyelement = scan.nextInt();
			Student res = search(ls,keyelement);
			if(res!=null)
			{
				System.out.println("Student exist");
				System.out.println("1:Update name");
				System.out.println("2:Update age");
				System.out.println("3:Update both");
				int c=scan.nextInt();
				scan.nextLine();
				if(c==1)
				{
					System.out.println("Enter the Name:");
					String newname=scan.nextLine();
					res.setName(newname);
				}
				else if(c==2)
				{
					System.out.println("Enter the Age:");
					int newage=0;
					while(true) {
						
						 newage=scan.nextInt();
						if(newage>0)
						{
							break;
						}
						System.out.println("Enter age greater than 0");
						System.out.println("Enter the Age:");


					}
				    res.setAge(newage);

				}
				else if(c==3)
				{
					System.out.println("Enter the Name:");
					String newname=scan.nextLine();
					System.out.println("Enter the Age:");
					res.setName(newname);
					int newage=0;
					while(true) {
						
						 newage=scan.nextInt();
						if(newage>0)
						{
							break;
						}
						System.out.println("Enter age greater than 0");
						System.out.println("Enter the Age:");


					}
				    res.setAge(newage);

				
				}
				for(Student s:ls)
				 {
					 System.out.println(s);
				 }
	        
			}
			else
			{
				System.out.println("Student does not exist");
			}
		
		}
		else if(n==0)
		{
			System.out.println("Thank you");
			break;
		}
		else
		{
			System.out.println("Invalid choice");
		}
		}
		scan.close();
		
		}
	}



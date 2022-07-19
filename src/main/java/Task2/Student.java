
/*task 2) 
	Student 
			-studentId 
			-name 
			-email
			-password 
			
	when any student registered studentId will automatically assign 
	an unique number. 
	name email and password will input by student. 
	
    create two methods 1) input 2) print 
    
    
    111111	ram	ram@gmail.com	ram123*/



package Task2;
import java.util.*;
import java.lang.Math;  
class Student {
    int StudentId;
    String Name,Email,Password;
    Scanner sc = new Scanner(System.in);
    
    Student()
    {
        StudentId = (int) (Math.random()*10000000);
    }
        
    
    void input()
    {
        System.out.println("Enter Name");
        Name = sc.next();
        System.out.println("Enter Email"); 
        Email = sc.next();
        System.out.println("Enter Password");
        Password = sc.next();
    }
    
    void print()
    {
        System.out.println(StudentId + "\t" + Name + "\t" + "Email" + "\t" + Password);
    }
    
    
    public static void main(String[] args) {
    	Student s = new Student();
		s.input();
		s.print();   
    }
}
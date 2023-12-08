package com.mycompany.coursemsystem;


import java.util.Scanner;

public class Cases extends Person 
{
    private  final int x;

   public  Cases(int ch) 
    {
      this.x = ch;
    }
   
    
    public  void  openchiose(int ch) throws Exception
    {
        
        switch (ch) 
        {
            case 1 ->                
            {
                    System.out.println("=================Welcom Admin=================");
                    System.out.println("Enter Your Email = ");
                    Scanner input = new Scanner (System.in);
                    String Email1 ;
                    Email1 = input.nextLine();
                    System.out.println("\nEnter Your Password= ");
                    String pass1 ;
                    pass1 = input.nextLine();
                    String Path="C:\\Users\\smart\\Documents\\NetBeansProjects\\CourseMSystem\\src\\main\\java\\AdminData";
                    CheckAdmin Admin  = new CheckAdmin();
                    Admin.chkAdmin(Email1 , pass1 );
                
            }
            case 2 ->               
            {
                System.out.println("=================Welcom Student=================");
                    System.out.println("Enter Your Email = ");
                    Scanner input = new Scanner (System.in);
                    String Email2 ;
                    Email2 = input.nextLine();
                    System.out.println("\nEnter Your Password= ");
                    String pass2 ;
                    pass2 = input.nextLine();
                    String Path="C:\\Users\\smart\\Documents\\NetBeansProjects\\CourseMSystem\\src\\main\\java\\StudentData";
                    CheckStudent Student = new CheckStudent();
                    Student.chkStudent(Email2 , pass2 );
            }
            case 3 ->                
            {
                    System.out.println("=================Welcom Instructor=================");
                    System.out.println("Enter Your Email = ");
                    Scanner input = new Scanner (System.in);
                    String Email3 ;
                    Email3 = input.nextLine();
                    System.out.println("\nEnter Your Password= ");
                    String pass3 ;
                    pass3 = input.nextLine();
                    String Path="C:\\Users\\smart\\Documents\\NetBeansProjects\\CourseMSystem\\src\\main\\java\\InstructorData";
                    CheckInstructor Instructor = new CheckInstructor();
                    Instructor.chkInstructor(Email3 , pass3 );
            }
            case 4 -> 
            {
                 System.out.println("=================System is Exist=================");
            }
            default ->
            {
                System.out.println("=================Please Enter number from 1 to 4=================");
            }
        
        }
  
  
    }



}
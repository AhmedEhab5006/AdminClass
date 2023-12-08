package com.mycompany.coursemsystem;

import java.util.Scanner;

public class ShowMenu 
{
    public void Menu ()
   {
    System.out.println("Welcom to Our Course Management System"); 
    System.out.println("Are you......?\n");   
    System.out.println("1-Admin ");
    System.out.println("2-Student ");
    System.out.println("3-instructor ");
    System.out.println("4-Exist\n");
    System.out.println("What is your choise ? ");
   
   }
    public int casenumber()
    {
      Scanner input = new Scanner(System.in);
      int choise = input.nextInt();
      return choise ;
    
    }
    //***************************************************
     public void   AdminMenu ()
   {
    System.out.println("Admin Task......? \n");
    System.out.println("1-Add ");
    System.out.println("2-Update ");
    System.out.println("3-Delete ");
    System.out.println("4-Exist  \n");
    System.out.println("What is your choise");
   
   }
    public int TaskCasenumber()
    {
      Scanner input = new Scanner(System.in);
      int choise = input.nextInt();
      return choise ;
    
    }  
    
    
   
      
//***************************************************************
//***************(((Take Email And Password )))******************
 public void  Print_What_ch()
 { 
     System.out.println("1-Student "); 
     System.out.println("2-Admin ");
     System.out.println("3-Instructor ");
    
     System.out.println("\nEnter Your Choise=  ");
     
 }
 //****************************
 public int Take_choise ()
 {
  Scanner input = new Scanner(System.in);
  int ch= input.nextInt();
  return ch;   
 }
 
 
 
 
    
}

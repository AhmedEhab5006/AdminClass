package com.mycompany.coursemsystem;

public class CourseMSystem 
{

    public static void main(String[] args) throws Exception
    {
      ShowMenu ob = new ShowMenu();
      ob.Menu();
      int ch = ob.casenumber();
      Cases c = new Cases (ch);
      c.openchiose(ch);
      
    }
}

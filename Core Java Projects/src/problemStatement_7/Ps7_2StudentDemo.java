package problemStatement_7;

import java.io.*;
public class Ps7_2StudentDemo
{
     public static void main(String args[])throws Exception
     {
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

          System.out.print("Enter roll number: ");
          int roll = Integer.parseInt(br.readLine());
          System.out.print("\nEnter name: ");
          String name = br.readLine();
          System.out.print("\nEnter age: ");
          int age = Integer.parseInt(br.readLine());
          System.out.print("\nEnter course: ");
          String course = br.readLine();
          Ps7_2Student s = new Ps7_2Student(roll,name,age,course);
          s.display();
     }
}
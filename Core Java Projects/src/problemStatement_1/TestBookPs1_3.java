
package problemStatement_1;

import java.util.Scanner;
public class TestBookPs1_3
{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the Book Title:");
        String bookTitle=sc.nextLine();
        
        System.out.println("Enter the price:");
        int price=sc.nextInt();
        sc.nextLine();
        
        System.out.println("Enter the Book Title:");
        String bookTitle2=sc.nextLine();
        
        System.out.println("Enter the price:");
        int price2=sc.nextInt();
        sc.nextLine();
        
        Book_ps1_3 obj=new Book_ps1_3();
        obj.setBookTitle(bookTitle);
        obj.setBookPrice(price);
       
       
        Book_ps1_3 obj2=new Book_ps1_3();
        obj.setBookTitle(bookTitle2);
        obj.setBookPrice(price2);
       
        System.out.println("First Book Details");
        System.out.println("Book Title :"+obj.getBookTitle());
        System.out.println("Book Price :"+obj.getBookPrice());
        
        System.out.println("Second Book Details");
        System.out.println("Book Title :"+obj.getBookTitle());
        System.out.println("Book Price :"+obj.getBookPrice());
       
    }
}
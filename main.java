import java.util.*;
public class main {    
    public static void main (String arg [])
{
    Scanner sc = new Scanner (System.in);
    library Library = new library();
    int choice;
    System.out.println("Welcome to the Library");
    while(true)
    {
        System.out.println("1. Display all Books\n2. Search book by title\n3. Borrow a Book\n4. Return a book\n5. Show library summary \n0. Exit");
        choice = sc.nextInt();
        sc.nextLine();
        if(choice == 1)
        {
            Library.displaybooks();
        }
        else if (choice == 2)
        {
            System.out.println("Enter title of book to search");
            String key = sc.nextLine();
            Library.searchbook(key);
        }
        else if (choice == 3 )
        {
            System.out.println("Enter the book id to borrow");
            int id = sc.nextInt();
            Library.borrowbook(id);
        }
        else if (choice == 4)
        {
            System.out.println("Enter id to return book");
            int key = sc.nextInt();
            Library.returnbook(key);
        }
        else if(choice == 5)
        {
            Library.summary();
        }
        else if (choice == 0){
            System.out.println("Thank you for using the Library Management System");
            break;
        }
        else{
            System.out.println("Invalid choice");
        }
        }
    }
}



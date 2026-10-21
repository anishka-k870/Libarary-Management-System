public class library {
    books [] book;
    public library()
    {
    book = new books[5]; 
    book[0]= new books(1,"The Great Gatsby","F. Scott Fitzgerald",true);
    book[1]= new books(2,"To Kill a Mockingbird","Harper Lee",true);
    book[2]= new books(3,"1984","George Orwell",true);
    book[3]= new books(4,"Pride and Prejudice","Jane Austen",true);
    book[4]= new books(5,"The Catcher in the Rye","J.D. Salinger",true);
}
    public void displaybooks()
    {
        for(books b : book)
        {
            String status ;
            if(b.isAvailable)
            {
                status = " Available";
            }
            else
            {
                status = "Borrowed";
            }
            System.out.println(b.id + "|" + b.title + "|" + b.author + "|" + status);
        }
    }
    public void searchbook(String keyword)
    {
        boolean found = false;
        for ( books b : book)
        {
            if(b.title.equalsIgnoreCase(keyword))
            {
                System.out.println(b.id + "|" + b.title + "|" + b.author + "|" + b.isAvailable);
                found = true;
            }
            
        }
        if(found == false)
        {
            System.out.println("Not found");
        }
    }
    public void borrowbook(int id)
    {
        for(books b : book)
        {
            if(b.id==id && b.isAvailable == true)
            {
                b.isAvailable = false;
                System.out.println("You have borrowed the book");

            }
            else if(b.id==id && b.isAvailable == false)
            {
                System.out.println("Book is already borrowed by someone else");
            }
        }
    }
    public void returnbook(int id)
    {
        for(books b : book)
        {
            if(b.id == id && b.isAvailable == false)
            {
                b.isAvailable = true;
                System.out.println("You have successfully returned the book");
            
            }
            else if(b.id == id && b.isAvailable == true) 
            {
                System.out.println("Book is not borrowed");
            
            }       
    }
    }
    public void summary()
    {
        int totalbook = book.length;;
        int availablebook = 0;
        int borrowedbook = 0;
        for(books b : book)
        {
            if(b.isAvailable == true){
                availablebook++;
            }
            else
            {
                borrowedbook++;
            }
        }
        System.out.println("Total Books : " + totalbook + "\nAvailable books : " + availablebook + "\nBorrowed books : " + borrowedbook);
    }
}


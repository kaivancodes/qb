class Book
{
    String author, title, publisher;
    Book(String a, String t, String p)
    {
        this.author = a;
        this.title = t;
        this.publisher = p;
    }
}
class BookInfo extends Book
{
    float price;
    int stock_position;
    BookInfo(String a, String t, String p, float amt, int s)
    {
        super(a, t, p);
        this.price = amt;
        this.stock_position = s;
    }
    void show()
    {
        System.out.println("Book Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
        System.out.println("Price: " + price);
        System.out.println("Stock Available: " + stock_position);
    }
}

public class Que3_5 {
    public static void main(String[] args) {
        BookInfo ob1 = new BookInfo("Herbert Schildt", "Complete Reference", "ABC Publication", 2359.50F, 10);
        BookInfo ob2 = new BookInfo("Ulman", "system programming", "XYZ Publication", 359.50F, 20);
        BookInfo ob3 = new BookInfo("Pressman", "Software Engg", "Pearson Publication", 879.50F, 15);
        ob1.show();
        ob2.show();
        ob3.show();
    } 
}
// Declare a class called Book having book title & author name as members.
// Create a sub- class of it, called BookDetails having price & current stock of book as members.
// Create an array for storing details of n books. Define methods to achieve following:
// - Initialization of members
// - To query availability of a book by author name / book title
// - To update stock of a book on purchase and sell
// Define method main to show usage of above methods. (Nov-2016-OLD)[NLJIET] 07
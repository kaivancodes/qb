class author{
    private String name;
    author(String nm)
    {
        this.name = nm;
    }
    void display()
    {
        System.out.println("Author: "+name);
    }
}
class book_pub extends author
{
    private String title;
    book_pub(String tt)
    {
        super("");
        title = tt;
    }
    void display()
    {
        System.out.println("Book: "+title);
    }
}
class paper_pub extends author
{
    private String title;
    paper_pub(String tt)
    {
        super("");
        title = tt;
    }
    void display()
    {
        System.out.println("Paper: "+title);
    }
}
public class Que2_5 {
    public static void main(String[] args) {
        author o1 = new author(args[0]);
        book_pub o2 = new book_pub(args[1]);
        paper_pub o3 = new paper_pub(args[2]);
        author r;
        r = o1;
        r.display();
        r = o2;
        r.display();
        r = o3;
        r.display();
    }
}

// Declare a class called book having author_name as private data member.
// Extend book class to have two sub classes called book_publication & paper_publication.
// Each of these classes have private member called title. Write a complete program to show usage
// of dynamic method dispatch (dynamic polymorphism) to display book or paper publications of given author.
// Use command line arguments for inputting data. (May-2013-OLD)(Dec-2015- OLD) [NLJIET] 07
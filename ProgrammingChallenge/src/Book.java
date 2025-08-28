//creating a book class for a library system

public class Book {

    static int totalNoOfBooks;

    String title;
    String author;
    String  isbn;

    boolean isBorrowed;


    static {
        totalNoOfBooks =0;
    }

    { // object init
        totalNoOfBooks++;
    }

    Book(String isbn, String title, String author){
        this.isbn = isbn;
        this.title =title;
        this.author = author;
    }

    Book(String isbn){
        this(isbn ,"unknown" ,"unknown");
    }

    static int getTotalBooks(){
        return  totalNoOfBooks++;
    }


     void borrowBook(){
        if (isBorrowed){
            System.out.println("Book is already borrowed");
        }else {
            this.isBorrowed = true;
            System.out.println("Enjoy "  + this.title);
        }

    }

     void returnBook(){
        if (isBorrowed){
            this.isBorrowed = false;
            System.out.println("hope you enjoyed, please leave a review ");
        }else{
            System.out.println("this book is already in the library");
        }

    }

    public static void main(String[] args) {
        Book designOfThings = new Book("1","Design","author");
        Book myBook = new Book("2");
        System.out.println(Book.getTotalBooks());
        designOfThings.borrowBook();
        myBook.borrowBook();
        designOfThings.borrowBook();
        designOfThings.returnBook();
        designOfThings.returnBook();
    }
}

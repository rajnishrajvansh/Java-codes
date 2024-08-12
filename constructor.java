 class book {
     static int book_code;
    String book_name;
    String book_author;
   static float book_price;
    book(int book_code, String book_name, String book_author, float book_price){
        this.book_code=book_code;
        this.book_name=book_name;
        this.book_author=book_author;
        this.book_price=book_price;
    }

    book(String book_name, String book_author){
        this.book_name=book_name;
        this.book_author=book_author;
    }

void show_data(){
    System.out.println("Book Code: "+book_code);
    System.out.println("Book Name: "+book_name);
    System.out.println("Book Author: "+book_author);
    System.out.println("Book Price: "+book_price);
    System.out.println();

}
}
 public class constructor{
    public static void main(String [] args){
        book b=new book(1234,"Physics", "HC Verma",512);
        book c=new book(1323,"Harry Potter","JK Rowling",4352);
        book d=new book("Maths", "Rajnish Singh");
        b.show_data();
        c.show_data();
        d.show_data();
    }
}
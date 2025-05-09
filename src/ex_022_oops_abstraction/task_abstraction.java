package ex_022_oops_abstraction;

public class task_abstraction {
    public static void main(String[] args) {
        Book myBook = new PrintMyBook("harry potter", "j.k.rowling", "120");
        myBook.getDetails();
    }
}
    abstract class Book {
        String name;
        String author;
        String price;

        public Book(String name, String author, String price) {
            this.name = name;
            this.author = author;
            this.price = price;
        }

        abstract void getDetails();
    }

    class PrintMyBook extends Book {
        public PrintMyBook(String name, String author, String price) {
            super(name, author, price);
        }

        @Override
        void getDetails() {
            System.out.println("(\"" + name + "\", \"" + author + "\", \"" + price + "\")");
        }
    }


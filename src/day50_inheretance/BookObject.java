package day50_inheretance;

public class BookObject {
    public static void main(String[] args) {
        Book book = new Book();
        book.title = "intro to java";
        book.author = "Savitch";
        book.type = "programming";
        book.price = 85.0;

        System.out.println(book.title);
        System.out.println(book.author);
        System.out.println(book.type);
        System.out.println(book.price);

        AudioBook audioBook = new AudioBook();
        audioBook.author = "Unmesh";
        audioBook.length = 60;
        audioBook.narrator = "Irena";
        audioBook.price = 44.99;
        audioBook.title = "selenium CookBook";
        audioBook.type = "Automation";
        audioBook.listen();


        Ebook eBook = new Ebook();
        eBook.title = "java";
        eBook.author = "sanj";
        eBook.type = "program";
        eBook.price = 85.0;
        eBook.size = 1000;
        eBook.pages = 100;
        eBook.readBook();




    }
}

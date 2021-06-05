package day50_inheretance;

public class Ebook extends Book{
    int size;
    int pages;

    public void readBook() {
        System.out.println("Reading book: ");
        System.out.println("Title = " + title);
        System.out.println("author =" + author);
        System.out.println("Size = " + size);

    }


}

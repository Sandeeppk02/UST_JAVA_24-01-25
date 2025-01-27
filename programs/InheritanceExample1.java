class Book {
    String title, author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

class Ebook extends Book {
    double fileSize;

    Ebook(String title, String author, double fileSize) {
        super(title, author);
        this.fileSize = fileSize;
    }

    void download() {
        System.out.println("Downloading eBook: " + title + ", File Size: " + fileSize + "MB");
    }
}

public class InheritanceExample1 {
    public static void main(String[] args) {
        Ebook ebook = new Ebook("Java Programming", "John Doe", 1.5);
        ebook.display();
        ebook.download();
    }
}

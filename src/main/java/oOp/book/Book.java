package oOp.book;

public class Book {

    private String author;
    private int year;
    private String bookTitle;
    private int pageAmount;

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public int getPageAmount() {
        return pageAmount;
    }

    public Book(String author, String bookTitle, int year, int pageAmount) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.year = year;
        this.pageAmount = pageAmount;
    }

    @Override
    public String toString() {
        return "Title: '" + this.bookTitle + "', author : " + this.author + ", year:  " + this.year + ", pages: " + this.pageAmount;
    }


    public Boolean Equals (Book book){
        if (((this.bookTitle).equals(book.bookTitle))&&((this.author).equals(book.author))
                &&(this.pageAmount==book.pageAmount)&&(this.year==book.year)){
            return true;
        }else {
            return false;
        }
    }
}
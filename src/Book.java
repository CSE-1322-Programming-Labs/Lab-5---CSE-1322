public class Book extends Item{
    private int isbnNumber;
    private String author;

    Book(){

    }

    Book(int isbnNumber,String author,String title){
        super(title);
        this.isbnNumber = isbnNumber;
        this.author = author;
    }

    public int getIsbnNumber() {
        return isbnNumber;
    }

    public String getAuthor() {
        return author;
    }

    public void setIsbnNumber(int isbnNumber) {
        this.isbnNumber = isbnNumber;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String getListing() {
        return "Book Name - "+getTitle()+"\nAuthor - "+author+"\nISBN# - "+isbnNumber;
    }
}

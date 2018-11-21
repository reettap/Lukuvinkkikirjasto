package item;

public class Book extends Base implements Item{
    private String isbn;
    private String description;
    
    public Book(String title, String author, String url) {
        super(title, author, url);
    }
    
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        if (isbn != null) {
            sb.append(" Isbn: ");
            sb.append(this.getIsbn());
        }
        if (description != null) {
            sb.append(" ");
            sb.append(this.getDescription());
        }
        return sb.toString();
    }
    
}

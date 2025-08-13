package skill4;
public class main{
	public static void main(String[] args) {
        book book = new book();

        // Set values using setters
        book.setTitle("The Alchemist");
        book.setAuthor("Paulo Coelho");
        book.setPrice(399.99);
        System.out.println(book);
    }
}
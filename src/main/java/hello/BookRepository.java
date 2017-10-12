package hello;

public interface BookRepository {

    Book getByIsbn(String isbn);
	
	Book getByIsbnNoCache(String isbn);
}
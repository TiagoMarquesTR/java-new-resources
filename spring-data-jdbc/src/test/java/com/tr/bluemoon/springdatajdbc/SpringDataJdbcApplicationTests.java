package com.tr.bluemoon.springdatajdbc;

import com.tr.bluemoon.springdatajdbc.services.author.Author;
import com.tr.bluemoon.springdatajdbc.services.author.AuthorRepository;
import com.tr.bluemoon.springdatajdbc.services.book.Book;
import com.tr.bluemoon.springdatajdbc.services.book.BookRepository;
import com.tr.bluemoon.springdatajdbc.services.movie.MovieRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringDataJdbcApplicationTests {

    @Autowired
    private MovieRepository movieRepository;

    /*@Autowired
    private ClientRepository clientRepository;*/
	/*@Autowired
	private DependentRepository dependentRepository;
	*/@Autowired
	private AuthorRepository authorRepository;
	@Autowired
	private BookRepository bookRepository;
    @Test
    public void contextLoads() {

        /*Movie movie = new Movie(null, "Lord of the Rings", "...",
                new Rental(null, Duration.ofDays(1), 5));

        movieRepository.save(movie);

        System.out.println(movieRepository.findAll());*/
//		Client client = new Client(null, "Fulano");

		/*clientRepository.save(client);

		System.out.println(client);*/
		Author author = new Author();
		author.setName("Yosef");

		authorRepository.save(author);

		Book book = new Book();
		book.setTitle("Kardunner");
		book.setIsbn("123");
		book.addAuthor(author);

		bookRepository.save(book);
    }

}

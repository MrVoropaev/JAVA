import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class BookServiceTest {
    @Mock
    private BookRepository bookRepository;

    private BookService bookService;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        bookService = new BookService(bookRepository);
    }

    @Test
    public void testFindBookById() {
        // Создаем мок-объект книги
        Book book = new Book("1", "Title", "Author");

        // Задаем поведение мок-объекта bookRepository при вызове метода findById("1")
        when(bookRepository.findById("1")).thenReturn(book);

        // Вызываем метод findBookById и проверяем, что он возвращает ожидаемую книгу
        assertEquals(book, bookService.findBookById("1"));
    }

    @Test
    public void testFindAllBooks() {
        // Создаем список мок-объектов книг
        List<Book> books = new ArrayList<>();
        books.add(new Book("1", "Title1", "Author1"));
        books.add(new Book("2", "Title2", "Author2"));

        // Задаем поведение мок-объекта bookRepository при вызове метода findAll()
        when(bookRepository.findAll()).thenReturn(books);

        // Вызываем метод findAllBooks и проверяем, что он возвращает ожидаемый список книг
        assertEquals(books, bookService.findAllBooks());
    }
}

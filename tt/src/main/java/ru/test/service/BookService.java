package ru.test.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.test.dao.BookDao;
import ru.test.domain.Book;
import ru.test.dto.BookOutDto;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Ruslan Bondar <ruslan.bondar@softline.ru>
 * @copyright Softline, 2011-2014
 * @since 2/21/14
 */
@Service
public class BookService {

    @Inject
    protected BookDao bookDao;


    @Transactional
    public List<BookOutDto> listBooks(Integer authorId) {
        List<Book> books=bookDao.listBooksByAuthor(authorId);
        List<BookOutDto> dtos=new ArrayList<BookOutDto>();
        for(Book book:books) {
            BookOutDto dto=new BookOutDto();
            dto.setTheme(book.getTheme());
            dto.setShortDescription(book.getDescription());
            dtos.add(dto);
        }
        return dtos;
    }
}

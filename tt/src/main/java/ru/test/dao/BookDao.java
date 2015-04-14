package ru.test.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import ru.test.domain.Book;

import java.util.List;

/**
 * @author Ruslan Bondar <ruslan.bondar@softline.ru>
 * @copyright Softline, 2011-2014
 * @since 2/21/14
 */
@Repository
public interface BookDao {

    public List<Book> listBooksByAuthor(@Param("authorId") Integer authorId);
}

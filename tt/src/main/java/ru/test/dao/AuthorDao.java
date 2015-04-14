package ru.test.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import ru.test.domain.Author;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: red_army
 * Date: 26.03.14
 * Time: 10:30
 * To change this template use File | Settings | File Templates.
 */

@Repository
public interface AuthorDao {

    public List<Author> authorName(@Param("authorId")Integer authorId);
}

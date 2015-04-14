package ru.test.ws.rest;

import ru.test.dto.BookOutDto;
import ru.test.service.BookService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * @author Ruslan Bondar <ruslan.bondar@softline.ru>
 * @copyright Softline, 2011-2014
 * @since 2/21/14
 */
@Path("books")
//@Path("authors")
@Produces(MediaType.APPLICATION_JSON)
public class TestRestService {

    @Inject
    BookService bookService;

    @GET
    @Path("list/{authorId}")
    public List<BookOutDto> listBooks(
            @PathParam("authorId") Integer authorId
    ) {
        return bookService.listBooks(authorId);
       // return author.getfirstname(authorId);
    }
}

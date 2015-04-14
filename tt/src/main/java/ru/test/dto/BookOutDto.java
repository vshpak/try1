package ru.test.dto;

/**
 * @author Ruslan Bondar <ruslan.bondar@softline.ru>
 * @copyright Softline, 2011-2014
 * @since 2/21/14
 */
public class BookOutDto {
    protected String theme;
    protected String authorName;
    protected String shortDescription;

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }
}

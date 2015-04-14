package ru.test.domain;

/**
 * @author Ruslan Bondar <ruslan.bondar@softline.ru>
 * @copyright Softline, 2011-2014
 * @since 2/21/14
 */
public class Author {

    protected Integer id;
    protected String firstName;
    protected String lastName;
    protected Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

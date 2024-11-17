import java.util.Objects;

public class Author {
    private String surname;
    private String name;

    public Author(String surname, String name) {
        this.surname = surname;
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getName() {
        return this.name;
    }

@Override
public String toString() {
        return name + " " + surname;
    }
@Override
public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(surname, author.surname) && Objects.equals(name, author.name);
    }

@Override
public int hashCode() {
        return Objects.hash(surname, name);
    }
}

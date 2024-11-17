public class NevMain {


    public static void main(String[] args) {
        Author king = new Author("Кинг ", "Стивен");
        Book it = new Book("Оно", king, 1986);
        System.out.println("Название Книги - " + it.getTitle());
        System.out.println("Автор книги - " + king.getSurname() + king.getName());
        System.out.println("Год выпуска книги " + it.getYear());
        System.out.println(new Book("Оно", new Author("Стивен", "Кинг"), 1986));
        System.out.println();
        Author dumas = new Author("Дюма ", "Александр");
        Book teacher = new Book("Учитель фехтования", dumas, 1840);
        System.out.println("Название Книги - " + teacher.getTitle());
        System.out.println("Автор книги - " + dumas.getSurname() + dumas.getName());
        System.out.println("Год выпуска книги " + teacher.getYear());
        System.out.println(new Book("Учитель фехтования", new Author("Александр", "Дюма"), 1840));
        teacher.setYear(1989);
        System.out.println("Год перевыпуска книги " + teacher.getYear());
        System.out.println();
        System.out.println("Сравнение книг: " + it.equals(teacher));

    }
}

public class NevMain {


    public static void main(String[] args) {
        Author author = new Author("Кинг ","Стивен" );
        Book book = new Book("Оно",author,1986);
        System.out.println("Название Книги - "+book.getTitle());
        System.out.println("Автор книги - " + author.getSurname()+ author.getName());
        System.out.println("Год выпуска книги " + book.getYear());
        Author author1 = new Author("Дюма ","Александр");
        Book book1 = new Book("Учитель фехтования",author1,1840);
        System.out.println("Название Книги - "+book1.getTitle());
        System.out.println("Автор книги - " + author1.getSurname()+author1.getName());
        System.out.println("Год выпуска книги " + book1.getYear());
        book1.setYear(1989);
        System.out.println("Год перевыпуска книги " + book1.getYear());

    }
}

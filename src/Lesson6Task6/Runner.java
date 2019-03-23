package Lesson6Task6;

public class Runner {
    public static void main(String[] args) {
//        опишите класс с методом main(), в котором ввести размерность массива
//        книг и создать объект типа Books; создать и добавить объекты типа Book в
//        объект типа Books; отобразить в консоль набор книг; использовать все
//        остальные методы класса Books.

        Books books = new Books(5);

        books.addBook(new Book("Shantaram", "David Roberts", "Azbuka", 2019, 864, 150));
        books.addBook(new Book("The Turkish Gambit", "Boris Akunin", "Azbuka", 2000, 734, 200));
        books.addBook(new Book("Fahrenheit 451", "Ray Bradberry", "Azbuka", 2016, 130, 170));
        books.addBook(new Book(" The Silence of the Lambs", "Thomas Harris", "Azbuka", 2018, 300, 120 ));
        books.addBook(new Book("Angels & Demons", "Dan Braun", "Azbuka", 2019, 100, 170));

        books.viewAllBooks();
        books.findByAuthor("Dan Braun");
        books.changePrice(0.2);
        books.findByYear(2018);

    }
}

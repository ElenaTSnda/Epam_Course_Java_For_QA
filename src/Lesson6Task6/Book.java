package Lesson6Task6;

import java.util.Objects;

public class Book {
//    опишите хорошо инкапсулированный класс Book (ID, Название, Автор,
//    Издательство, Год издания, Количество страниц, Стоимость), т.е. закрытые
//    поля с методами доступа. Добавьте в класс конструктор со всеми
//    параметрами. Добавьте в класс метод view() для отображения (вывода)
//    объекта.

    private static int nextId = 1;
    private int id;
    private String name;
    private String author;
    private String publishingHouse;
    private int yearOfEstablishment;
    private int amountOfPages;
    private int cost;
    private double percent;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public int getYearOfEstablishment() {
        return yearOfEstablishment;
    }

    public int getAmountOfPages() {
        return amountOfPages;
    }

    public int getCost() {
        return cost;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public void setYearOfEstablishment(int yearOfEstablishment) {
        this.yearOfEstablishment = yearOfEstablishment;
    }

    public void setAmountOfPages(int amountOfPages) {
        this.amountOfPages = amountOfPages;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Book(String name, String author, String publishingHouse, int yearOfEstablishment, int amountOfPages, int cost) {
        this(); // вызываем из конструктора по-умолчанию такой же метод
        this.name = name;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.yearOfEstablishment = yearOfEstablishment;
        this.amountOfPages = amountOfPages;
        this.cost = cost;
    }

    public Book(){
        this.id = nextId++;
    }

    public String viewBook() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publishingHouse='" + publishingHouse + '\'' +
                ", yearOfEstablishment=" + yearOfEstablishment +
                ", amountOfPages=" + amountOfPages +
                ", cost=" + cost +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id &&
                yearOfEstablishment == book.yearOfEstablishment &&
                amountOfPages == book.amountOfPages &&
                cost == book.cost &&
                Objects.equals(name, book.name) &&
                Objects.equals(author, book.author) &&
                Objects.equals(publishingHouse, book.publishingHouse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, author, publishingHouse, yearOfEstablishment, amountOfPages, cost);
    }
}

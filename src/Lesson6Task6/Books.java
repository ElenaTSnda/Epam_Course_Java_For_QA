package Lesson6Task6;

import java.util.Arrays;
import java.util.Objects;

public class Books {
//    опишите класс Books, который будет содержать массив объектов (поле)
//    типа Book; конструктор, принимающий размер массива и выделяющий
//    память под него; метод добавления одной книги; метод отображения всех
//    книг в массиве; метод изменения стоимости книг на указанное количество
//    процентов - вынесено в бук; метод поиска всех книг указанного автора; метод поиска всех
//    книг, изданных после указанного года.
    private double percent;
    private int sizeOfArray;
    private int countOfBooks = 0;
    private Book[] arrayOfBooks;

    public double getPercent() {
        return percent;
    }

    public int getSizeOfArray() {
        return sizeOfArray;
    }

    public int getCountOfBooks() {
        return countOfBooks;
    }

    public Book[] getArrayOfBooks() {
        return arrayOfBooks;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    public void setSizeOfArray(int sizeOfArray) {
        this.sizeOfArray = sizeOfArray;
    }

    public void setCountOfBooks(int countOfBooks) {
        this.countOfBooks = countOfBooks;
    }

    public void setArrayOfBooks(Book[] arrayOfBooks) {
        this.arrayOfBooks = arrayOfBooks;
    }

    public Books(int sizeOfArray) {
        this.sizeOfArray = sizeOfArray;
        arrayOfBooks = new Book[sizeOfArray];
    }

    public boolean addBook(Book book){

        if( countOfBooks >= arrayOfBooks.length){
            return false;
        }
        arrayOfBooks[countOfBooks++] = book;
        return true;
    }

    public void changePrice(double percent){
        Book book = new Book();
        int cost = book.getCost();
        cost = (int)(cost + cost * percent);
    }

    public String viewAllBooks(){

        if(sizeOfArray == 0){
            return "No books in the library!";
        }

        String allBooks = "";
        for(int i = 0; i < sizeOfArray; i++){
            allBooks += arrayOfBooks[i].viewBook();
            allBooks += "\n";
        }
        return allBooks;
    }

    public Books findByAuthor(String author) {

        Books newBook = new Books(sizeOfArray);
         for(int i = 0; i < sizeOfArray; i++){
             if(arrayOfBooks[i].getAuthor().equalsIgnoreCase(author)){
                 newBook.addBook(arrayOfBooks[i]);
             }
         }
         return newBook;
    }

    public Books findByYear(int year) { // do at home

        Books newBook = new Books(sizeOfArray);
        for(int i = 0; i < sizeOfArray; i++){
            if(arrayOfBooks[i].getYearOfEstablishment() >= year){
                newBook.addBook(arrayOfBooks[i]);
            }
        }
        return newBook;
    }

    @Override
    public String toString() {
        return "Books{" +
                "percent=" + percent +
                ", sizeOfArray=" + sizeOfArray +
                ", countOfBooks=" + countOfBooks +
                ", arrayOfBooks=" + Arrays.toString(arrayOfBooks) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Books books = (Books) o;
        return Double.compare(books.percent, percent) == 0 &&
                sizeOfArray == books.sizeOfArray &&
                countOfBooks == books.countOfBooks &&
                Arrays.equals(arrayOfBooks, books.arrayOfBooks);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(percent, sizeOfArray, countOfBooks);
        result = 31 * result + Arrays.hashCode(arrayOfBooks);
        return result;
    }
}

import java.util.Scanner;

public class Lesson4HomeTask4_2 {
    public static void main(String[] args) {
//        Task #2  Напишите программу на языке Java, которая вводит некоторую строку и
//        выводит в консоль все уникальные символы этой строки. Обработка строки
//        выполняется отдельным методом.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, write your string to find it's unique elements: ");
        String enteredString = scanner.nextLine();

        System.out.println("Unique symbols of your string are: " + findingUniqueElements(enteredString));
    }

    public static String findingUniqueElements(String str) {

        String uniqueElements = "";
        String processedElements = "";

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (processedElements.contains(String.valueOf(currentChar))) { //такой символ уже встречался ранее
                continue;
            }
            int matches = 0; //счетчик одинаковых символов
            for (int j = i + 1; j < str.length(); j++) {
                char comparingChar = str.charAt(j);
                if (currentChar == comparingChar) { //нашли совпадение, добавляем к счетчику
                    matches++;
                }
            }
            if (matches == 0) { //похожих символов не найдено, значит уникальный
                uniqueElements += currentChar;
            }
            processedElements += currentChar; //добавляем к обработанным
        }
        return uniqueElements;
    }
}


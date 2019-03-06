import java.util.Scanner;

public class Lesson4HomeTask4_1 {
    public static void main(String[] args) {
//        Task #1  Напишите программу на языке Java, которая вводит целое число,
//        преобразует его в двоичное представление, сохраняя как строку, и выводит в
//        консоль результат. Преобразование выполняется отдельным методом.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, enter the number: ");
        int enteredNumber = scanner.nextInt();

        System.out.println("The binary convertion of your number is: " + convertingNum(enteredNumber));
        scanner.close();
}

    public static String convertingNum(int number) {

        String result = "";
//        return result = Integer.toBinaryString(number);
        if(number == 0){
            System.out.println("0");
        } else {
            while (number > 0) {
                result += ((number % 2) == 0 ? "0" : "1");
                number = number / 2;
            }
        }
        return result;
    }
}

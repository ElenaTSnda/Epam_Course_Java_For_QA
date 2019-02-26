public class Lesson2_home_task2 {
    public static void main(String[] args) {
            /*Task1
        Напишите программу на языке Java, которая описывает две переменные
        целого типа и без объявления других переменных меняет местами их значения.
        */
        int number1 = 567;
        int number2 = 34;

        number1 += number2;
        number2 = number1 - number2;
        number1 = number1 - number2;

        System.out.println("Now number1 is " + number1 + ", " + "and number2 is " + number2 + ".");
    /*Task2
    Напишите программу на языке Java, которая:
− описывает трехзначное целое число number (например, 123);
− находит и выводит в консоль разность между числом number и числом,
составленным из цифр числа number, но взятых в обратном порядке (для
данного задания обратное число – это 321).*/
        //Variant #1
        int x = 435;

        String numberX = String.valueOf(x);
        StringBuilder sb = new StringBuilder(numberX);
        String newNumber = sb.reverse().toString();

        int newX = Integer.parseInt(newNumber);
        int result = newX - x;
        System.out.println("The difference between our number and it's reverse value is " + result + ".");
        //        Variant #1 - just with primitive types
        int y = 435;
        int firstDigit = 435 / 100; //4
        int secondDigit = 435 % 100 / 10; //3
        int thirdDigit = 435 % 10; //5

        String str1 = String.valueOf(firstDigit);
        String str2 = String.valueOf(secondDigit);
        String str3 = String.valueOf(thirdDigit);

        String stringOfNumbers = str3 + str2 + str1;
        int newResult = Integer.parseInt(stringOfNumbers) - y;

        System.out.println("The difference between our number and it's reverse value is " + newResult + ".");
        //        Task3
//        Напишите программу на языке Java, которая преобразует вес, заданный в фунтах, в килограммы,
//        но выводит раздельно количество полученных килограмм и грамм (в 1 фунте 453,6 грамм).
        double weightInPounds = 56;
        double weightInGr = weightInPounds * 453.6; //25401.6 in gr

        int kg = (int) weightInGr / 1000; //25.4016 in kg
        int gr = (int) weightInGr - kg * 1000;

        System.out.println("In 56 pounds we have " + kg + " kilograms and " + gr + " grams.");
        //        Task4
//        Напишите программу на языке Java, которая вычисляет и выводит в консоль сумму прибыли по
//        заданному депозиту (например, 10000) на заданное количество месяцев (например, 6)
//        под указанный процент годовых (например, 12%).
        int depositSum = 10000;
        int months = 6;
        int percentagePerYear = 12; // in a year

        int percentageForUsedPeriod = (percentagePerYear / 12) * months;
        int income = depositSum * percentageForUsedPeriod / 100;

        System.out.println("The income for the period of deposit is " + income + ".");
    }
}

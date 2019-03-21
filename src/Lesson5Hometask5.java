import java.lang.reflect.Array;
import java.util.Arrays;

public class Lesson5Hometask5 {
    public static void main(String[] args) {

        int[] arr = createArray(6); // вызов метода для создания массива, указанного размера
        int[] arr2 = createArray(6);

        printReverseArray(arr); // the reverse order of the array

        amountOfOddNumbers(arr); // the amount and sum of odd numbers

        arrayOfKnownLength(arr, arr2);

        arrayOfUnknownLength();
    }
    public static int[] createArray(int size){ // создание массива

        int[] array = new int[size];
        for(int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random()*30) - 15; // элементы от 0 до 30
        }
        return array;
    }

    public static void printReverseArray(int[] arr){
//         Задание 1 - Обработка без ветвлений: Напишите программу на языке Java, которая создает массив любого типа,
//         a затем выводит его в консоль в прямом и обратном порядках.

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
        for(int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }

    public static void amountOfOddNumbers(int[] arr){
//         Задание 2 - Обработка с разветвлением: Напишите программу на языке Java, которая создает массив любого типа,
//         a затем вычисляет количество и сумму нечетных элементов массива.
        int counter = 0;
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 != 0){
                counter++;
                sum += arr[i];
            }
        }
        System.out.println("We have " + counter + " odd element(s) in the array and it's sum = " + sum + ".");
    }

    public static void arrayOfKnownLength(int[] arr, int[] arr2){
//         Задание 3 – Создание третьего массива известной длины: Напишите программу на языке Java, которая создает два массива
//         одинаковой размерности, а затем создает третий такой же размерности и заполняет его попарной суммой элементов из первых двух.
        int[] newArray = new int[arr.length];

        System.out.println(Arrays.toString(arr)); // выводим первый массив, чтобы видить правильно ли вышла сумма
        System.out.println(Arrays.toString(arr2)); // выводим второй массив

        for(int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i] + arr2[i];
        }
        System.out.println("New array as sum of elements of two other arrays is: " + Arrays.toString(newArray));
    }

    public static void arrayOfUnknownLength(){
//        Задание 4 – Создание третьего массива неизвестной длины: Напишите программу на языке Java, которая создает массив любого типа,
//        а затем разделяет его на два: из положительных и отрицательных элементов.
        int oddElement = 0;
        int evenElement = 0;
        int[] array = createArray(6);
        int arrayLength = array.length;
        int[] oddElements;
        int[] evenElements;
        int index = 0;
        int index2 = 0;

        for(int i = 0; i < arrayLength; i++) {
            if (array[i] % 2 != 0) { // odd elements
                oddElement++; // кол-во нечетных элементов - которое будет размером нового массива
            }
            if (array[i] % 2 == 0) { // even elements
                evenElement++; // кол-во четных элементов - которое будет размером нового массива
            }
        }
        System.out.println("Our array: " + Arrays.toString(array));

        oddElements = new int[oddElement];
        for(int i = 0; i < arrayLength; i++){
            if(array[i] % 2 != 0){
                oddElements[index] = array[i];
                index++;
            }
        }
        System.out.println("New array of only odd elements: " + Arrays.toString(oddElements));

        evenElements = new int[evenElement];
        for(int i = 0; i < arrayLength; i++){
            if(array[i] % 2 == 0){
                evenElements[index2] = array[i];
                index2++;
            }
        }
        System.out.println("New array of only even elements: " + Arrays.toString(evenElements));
    }
}

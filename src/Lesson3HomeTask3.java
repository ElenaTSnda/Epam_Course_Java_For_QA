// 1)
public class Lesson3HomeTask3 {
    public static void main(String[] args) {
        // 1)
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        for (int i = 0; i <= 3; i++) {
            for (int j = 3; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
// 2)

        for (int i = 4; i >= 0; i--) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print("  ");
            }
            for (int j = 4 - i; j < 4; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }


// 3)
        for (int i = 0; i <= 4; i++) {
            for (int f = 3; f >= i; f--) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");


// 4)

        for (int i = 0; i <= 2; i++) {
            for (int f = 2; f >= i; f--) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        for (int i = 4; i >= 0; i--) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print("  ");
            }
            for (int j = 4 - i; j < 4; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

// 5)
        for (int i = 1; i <= 4; i++) {
            for (int j = i; j < 4; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k < (i * 2); k++) {
                System.out.print("* ");
            }
            System.out.println("  ");
        }
        for (int i = 1; i <= 4; i++) {
            for (int j = i; j < 4; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k < (i * 2); k++) {
                System.out.print("* ");
            }
            System.out.println("  ");
        }
    }
}

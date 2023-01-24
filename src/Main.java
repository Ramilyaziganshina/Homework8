import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1 () {
        System.out.println("Задача 1, 2");
        int [] pizzas = new int [3];
        pizzas [0] = 1;
        pizzas [1] = 2;
        pizzas [2] = 3;
        for (int i = 0; i < pizzas.length; i++) {
            if (i == pizzas.length - 1) {
                System.out.print(pizzas[2]);
                break;
            }
            System.out.print(pizzas[i] + ", ");
        }
        System.out.println();
        double [] diggers = {1.57, 7.654, 9.986};
        for (int i = 0; i < diggers.length; i++) {
            if (i == diggers.length - 1) {
                System.out.print(diggers[diggers.length - 1]);
                break;
            }
            System.out.print(diggers [i] + ", ");
        }
        System.out.println();
        int [] d = new int [8];
        for (int i = 0; i < d.length; i++) {
            d[i] = i + 5;
        }
        for (int i = 0; i < d.length; i++) {
            if (i == d.length - 1) {
                System.out.print(d[d.length - 1]);
                break;
            }
            System.out.print(d[i] + ", ");
        }
        System.out.println();
    }
    public static void task2 () {
        System.out.println("Задача 3");
        int [] pizzas = new int [3];
        pizzas [0] = 1;
        pizzas [1] = 2;
        pizzas [2] = 3;
        for (int i = pizzas.length-1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(pizzas[0]);
                break;
            }
            System.out.print(pizzas[i] + ", ");
        }
        System.out.println();
        double [] diggers = {1.57, 7.654, 9.986};
        for (int i = diggers.length-1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(diggers[0]);
                break;
            }
            System.out.print(diggers [i] + ", ");
        }
        System.out.println();
        int [] d = new int [8];
        for (int i = 0; i < d.length; i++) {
            d[i] = i + 5;
        }
        for (int i = d.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(d[0]);
                break;
            }
            System.out.print(d[i] + ", ");
        }
        System.out.println();
    }

    public static void task3 () {
        System.out.println("Задача 4");
        int [] pizzas = new int [3];
        pizzas [0] = 1;
        pizzas [1] = 2;
        pizzas [2] = 3;
        for (int i = 0; i <= 2; i++) {
            if (pizzas[i] % 2 != 0) {
                pizzas [i] = pizzas [i]+1;
            }
        }
        System.out.println(Arrays.toString(pizzas));
    }
}
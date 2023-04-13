import java.util.Random;

public class multithreadlab {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Thread1());
        Thread thread2 = new Thread(new Thread2());
        Thread thread3 = new Thread(new Thread3());

        thread1.start();
        thread2.start();
        thread3.start();
    }

    static class Thread1 implements Runnable {
        public void run() {
            Random rand = new Random();
            while (true) {
                int num = rand.nextInt();
                if (num % 2 == 0) {
                    Thread2.setNumber(num);
                } else {
                    Thread3.setNumber(num);
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class Thread2 implements Runnable {
        private static int number;

        public static void setNumber(int num) {
            number = num;
        }

        public void run() {
            while (true) {
                if (number % 2 == 0) {
                    int square = number * number;
                    System.out.println("Square of " + number + " is " + square);
                    setNumber(0);
                }
            }
        }
    }

    static class Thread3 implements Runnable {
        private static int number;

        public static void setNumber(int num) {
            number = num;
        }

        public void run() {
            while (true) {
                if (number % 2 != 0) {
                    int cube = number * number * number;
                    System.out.println("Cube of " + number + " is " + cube);
                    setNumber(0);
                }
            }
        }
    }
}

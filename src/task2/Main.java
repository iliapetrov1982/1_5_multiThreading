package task2;

public class Main {
    public static void main(String[] args) {
        FizzBuzz fb = new FizzBuzz(15);


        Thread threadA = new Thread(() -> {
            try {
                fb.fizz();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread threadB = new Thread(() -> {
            try {
                fb.buzz();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread threadC = new Thread(() -> {
            try {
                fb.fizzbuzz();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread threadD = new Thread(() -> {
            try {
                fb.number();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });


        threadA.start();
        threadB.start();
        threadC.start();
        threadD.start();
    }
}

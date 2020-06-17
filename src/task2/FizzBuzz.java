package task2;

import java.util.concurrent.Semaphore;

public class FizzBuzz {
    private final int n;
    private Semaphore s1 = new Semaphore(1);
    private Semaphore s2 = new Semaphore(0);
    private Semaphore s3 = new Semaphore(0);
    private Semaphore s4 = new Semaphore(0);


    public FizzBuzz(int n) {
        this.n = n;
    }

    public void fizz() throws InterruptedException {
        for (int i = 1; i < n + 1; i++) {
            s1.acquire();
            if (i % 3 == 0 & i % 5 != 0) {
                System.out.print("fizz, ");
            }
            s2.release();
        }
    }

    public void buzz() throws InterruptedException {
        for (int i = 1; i < n + 1; i++) {
            s2.acquire();
            if (i % 3 != 0 & i % 5 == 0) {
                System.out.print("buzz, ");
            }
            s3.release();
        }
    }

    public void fizzbuzz() throws InterruptedException {
        for (int i = 1; i < n + 1; i++) {
            s3.acquire();
            if (i % 3 == 0 & i % 5 == 0) {
                System.out.print("fizzbuzz, ");
            }
            s4.release();
        }
    }

    public void number() throws InterruptedException {
        for (int i = 1; i < n + 1; i++) {
            s4.acquire();
            if (i % 3 != 0 & i % 5 != 0) {
                System.out.print(i + ", ");
            }
            s1.release();
        }

    }
}

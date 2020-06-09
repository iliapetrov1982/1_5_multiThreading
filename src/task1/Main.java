package task1;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Foo foo  = new Foo();
        Object key = new Object();

        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                foo.first();
            }
        });

        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                foo.second();
            }
        });

        Thread threadC = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                foo.third();
            }
        });

        threadA.start();
        threadA.join();
        threadB.start();
        threadB.join();
        threadC.start();
    }
}

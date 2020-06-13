package task1;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Foo foo = new Foo();

        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                foo.first();
            }
        });

        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                foo.second();
            }
        });

        Thread threadC = new Thread(new Runnable() {
            @Override
            public void run() {
                foo.third();
            }
        });

        threadC.start();
        threadA.start();
        threadB.start();
    }
}

package task1;

public class Foo {
    boolean valueSet = false;
    boolean valueSet1 = false;
    private Object key = new Object();

    public synchronized void first() {
        while (valueSet)
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        valueSet = true;
        System.out.print("first");
        notifyAll();
    }

    public synchronized void second() {
        while (!valueSet)
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        valueSet = false;
        System.out.print("second");
        notify();
        valueSet = false;
        valueSet1 = true;
    }


    public synchronized void third() {
        while (!valueSet1)
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        System.out.print("third");
        valueSet1 = false;
    }
}

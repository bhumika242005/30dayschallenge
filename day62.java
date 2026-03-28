class Printer {
    private boolean isOdd = false;

    synchronized void printEven(int number) {
        while (!isOdd) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Even: " + number);
        isOdd = false;
        notify();
    }

    synchronized void printOdd(int number) {
        while (isOdd) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Odd: " + number);
        isOdd = true;
        notify();
    }
}

class EvenThread extends Thread {
    private Printer printer;
    private int max;

    EvenThread(Printer printer, int max) {
        this.printer = printer;
        this.max = max;
    }

    public void run() {
        for (int i = 2; i <= max; i += 2) {
            printer.printEven(i);
        }
    }
}

class OddThread extends Thread {
    private Printer printer;
    private int max;

    OddThread(Printer printer, int max) {
        this.printer = printer;
        this.max = max;
    }

    public void run() {
        for (int i = 1; i <= max; i += 2) {
            printer.printOdd(i);
        }
    }
}

public class day62 {
    public static void main(String[] args) {
        Printer printer = new Printer();
        int limit = 10;

        Thread t1 = new OddThread(printer, limit);
        Thread t2 = new EvenThread(printer, limit);

        t1.start();
        t2.start();
    }
}

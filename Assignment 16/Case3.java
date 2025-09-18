class Task {
    synchronized public void m1() {
        for (int i = 1; i <= 5; i++) {
            try {
                System.out.println(Thread.currentThread().getName() + " - M1 IS EXECUTING");
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    synchronized public void m2() {
        for (int i = 1; i <= 5; i++) {
            try {
                System.out.println(Thread.currentThread().getName() + " - M2 IS EXECUTING");
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void m3(){
        for (int i = 1; i <= 5; i++) {
            try {
                System.out.println(Thread.currentThread().getName() + " - M3 IS EXECUTING");
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
class Task1 extends Thread {
    private Task task;

    Task1(Task task) {
        this.task = task;
    }

    public void run() {
        this.task.m1();
    }
}


class Task2 extends Thread {
    private Task task;

    Task2(Task task) {
        this.task = task;
    }

    public void run() {
        this.task.m2();
    }
}

class Task3 extends Thread {
    private Task task;

    Task3(Task task) {   
        this.task = task;
    }

    public void run() {
        this.task.m3();
    }
}
class Main {
    public static void main(String args[]) {
        Task task = new Task();

        Thread t1 = new Task1(task);
        Thread t2 = new Task2(task);
        Thread t3 = new Task3(task);

        t1.setName("Thread-1");
        t2.setName("Thread-2");
        t3.setName("Thread-3");

        t1.start();
        t2.start();
        t3.start();
    }
}


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
    synchronized public void m2(){
        m1();
    }
}
class Task1 extends Thread {
    Task T1;

    Task1(Task T1) {
        this.T1 = T1;
    }

    public void run() {
        this.T1.m2();
    }
}
class Main {
    public static void main(String args[]) {
        Task t = new Task();

        Thread t1 = new Task1(t);
        
        t1.setName("Thread-1");
        

        t1.start();
        
    }
}
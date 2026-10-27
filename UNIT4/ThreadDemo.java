class ThreadDemo extends Thread {

    public void run() {
        System.out.println("Thread is running.");
        System.out.println("Thread Name: " + getName());
        System.out.println("Thread Priority: " + getPriority());
    }

    public static void main(String[] args) {
        ThreadDemo t1 = new ThreadDemo();

        t1.setName("MyThread");
        t1.setPriority(8);

        t1.start();
    }
}

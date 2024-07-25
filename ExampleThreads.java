public class ExampleThreads extends Thread {
    @Override
    public void run() {
        for (int y = 0; y < 5; y++) {
            System.out.println("Thread running: " + y);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        ExampleThreads thread = new ExampleThreads();
        thread.start();
    }
}


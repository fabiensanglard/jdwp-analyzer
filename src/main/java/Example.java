public class Example {

    public static void main(String[] arg) throws InterruptedException {
        while(true) {
            long now = System.nanoTime();
            System.out.println(now);
            Thread.sleep(1000);
        }
    }
}

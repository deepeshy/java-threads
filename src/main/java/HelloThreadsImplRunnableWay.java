public class HelloThreadsImplRunnableWay {
    public static void main(String[] args) {
        String countries[] = {"a", "aa"};
        for (String country : countries) {
            new Thread(new Greeter(country), country + " thread").start();
        }
    }

    public static class Greeter implements Runnable {
        private String country;

        public Greeter(String country) {
            this.country = country;
        }

        public void run() {
            System.out.println("Hello " + country + " from Thread:" + Thread.currentThread().getName());
        }
    }


}

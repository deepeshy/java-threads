public class HelloThreadsExtThreadWay {
    public static void main(String[] args) {
        String countries[] = {"a", "aa"};
        for (String country : countries) {
            new Greeter(country).start();
        }
    }

    public static class Greeter extends Thread {
        private String country;

        public Greeter(String country) {
            super(country + " thread");
            this.country = country;
        }

        @Override
        public void run(){
            System.out.println("Hello " + country + " from Thread:" + Thread.currentThread().getName());
        }
    }


}

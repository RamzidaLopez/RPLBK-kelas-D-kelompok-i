public class Main {
    public static void main(String[] args) {
        // Anda dapat menjalankan FullTimeWorker atau RobotWorker di sini
        FullTimeWorker fullTimeWorker = new FullTimeWorker();
        fullTimeWorker.work();
        fullTimeWorker.eat();

        RobotWorker robotWorker = new RobotWorker();
        robotWorker.work();
    }
}


interface IWorker {
    void work();
}

interface IEater {
    void eat();
}


interface ISleeper {
    void sleep();
}

class HumanWorker implements IWorker, IEater, ISleeper {
    @Override
    public void work() {

        System.out.println("Human is working.");
    }

    @Override
    public void eat() {

        System.out.println("Human is eating.");
    }

    @Override
    public void sleep() {

        System.out.println("Human is sleeping.");
    }
}


class RobotWorker implements IWorker {
    @Override
    public void work() {
        // Логика работы робота
        System.out.println("Robot is working.");
    }

}





public class Main3 {
    public static void main(String[] args) {
        HumanWorker humanWorker = new HumanWorker();
        humanWorker.work();
        humanWorker.eat();
        humanWorker.sleep();

        // Робот
        RobotWorker robotWorker = new RobotWorker();
        robotWorker.work();

    }
}


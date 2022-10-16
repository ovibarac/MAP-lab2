import container.Strategy;
import model.MessageTask;
import model.SortingTask;
import runner.PrinterTaskRunner;
import runner.StrategyTaskRunner;

public class Main {

    public static void test(){
        SortingTask st = new SortingTask("1", "sort bubble", "bubble");
        SortingTask st2 = new SortingTask("2", "sort quick", "quick");
        MessageTask m1 = new MessageTask("3", "msg", "masdsad");
        MessageTask m2 = new MessageTask("4", "msg", "asd");
        StrategyTaskRunner runner = new StrategyTaskRunner(new Strategy("FIFO"));
        runner.addTask(st);
        runner.addTask(st2);
        runner.addTask(m1);
        runner.addTask(m2);
//        System.out.println("Strategy:\n");
//        runner.executeAll();

//        System.out.println("Delay:\n");
//        DelayTaskRunner delayDecorator = new DelayTaskRunner(runner);
//        delayDecorator.executeAll();

        System.out.println("Printer:\n");
        PrinterTaskRunner printerDecorator = new PrinterTaskRunner(runner);
        printerDecorator.executeAll();
    }

    public static void main(String[] args) {
        test();
    }
}
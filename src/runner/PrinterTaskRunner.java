package runner;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PrinterTaskRunner extends AbstractTaskRunner{
    public PrinterTaskRunner(TaskRunner taskRunner) {
        super(taskRunner);
    }

    @Override
    public void executeOneTask() {
        taskRunner.executeOneTask();
        this.decorateExecute();
    }

    public void decorateExecute(){
        System.out.println("Time: "+ LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyy-MM-dd hh:mm")));
    }
}

package runner;

public class DelayTaskRunner extends AbstractTaskRunner{
    //decorate StrategTaskRunner
    public DelayTaskRunner(TaskRunner taskRunner) {
        super(taskRunner);
    }

    @Override
    public void executeOneTask() {
        delay(3000);
        taskRunner.executeOneTask();
    }

    public void delay(int millis){
        try{
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

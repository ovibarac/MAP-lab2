package runner;

public abstract class AbstractTaskRunner implements TaskRunner{
    private TaskRunner taskRunner;

    public AbstractTaskRunner(TaskRunner taskRunner) {
        this.taskRunner = taskRunner;
    }
}

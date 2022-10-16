package runner;

import container.Container;
import model.Task;

public class DelayTaskRunner extends AbstractTaskRunner{
    Container taskContainer;

    public DelayTaskRunner(TaskRunner taskRunner, Container container) {
        super(taskRunner);
        this.taskContainer = container;
    }

    @Override
    public void executeOneTask() {

    }

    @Override
    public void executeAll() {

    }

    @Override
    public void addTask(Task t) {
        taskContainer.add(t);
    }

    @Override
    public boolean hasTask() {
        return !taskContainer.isEmpty();
    }
}

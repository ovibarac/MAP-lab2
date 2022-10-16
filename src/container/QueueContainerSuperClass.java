package container;
import model.Task;

public abstract class QueueContainerSuperClass {
    public abstract Task remove();

    public abstract void add(Task task);

    public abstract int size();

    public abstract boolean isEmpty();

    @Override
    public abstract String toString();
}

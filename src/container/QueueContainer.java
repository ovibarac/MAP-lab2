package container;
import model.Task;
import java.util.Arrays;

public class QueueContainer extends QueueContainerSuperClass implements Container {
    public Task[] q= new Task[0];
    @Override
    public Task remove() {
        Task[] q2 = new Task[q.length];
        System.arraycopy(q, 0, q2, 0, q.length);
        Task deleted = q[0];
        q=new Task[q2.length-1];
        System.arraycopy(q2, 1, q, 0, q.length);

        return deleted;
    }

    @Override
    public void add(Task task) {
        Task[] q2 = new Task[q.length+1];
        System.arraycopy(q, 0, q2, 0, q.length);
        q=new Task[q2.length];
        System.arraycopy(q2, 0, q, 0, q2.length);
        q[q.length-1]=task;
    }

    @Override
    public int size() {
        return q.length;
    }

    @Override
    public boolean isEmpty() {
        return q.length==0;
    }

    @Override
    public String toString() {
        return "Queue: "+ Arrays.toString(q)    ;
    }
}

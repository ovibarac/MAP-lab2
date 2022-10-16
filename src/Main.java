import container.QueueContainer;
import container.QueueContainerSuperClass;
import model.SortingTask;

public class Main {
    public static void main(String[] args) {
        SortingTask st = new SortingTask("1", "sort", "bubble");
        st.execute();
        SortingTask st2 = new SortingTask("2", "sort", "quick");
        st2.execute();
        QueueContainerSuperClass q = new QueueContainer();
        q.add(st);
        q.add(st2);
        System.out.println(q);
        System.out.println("Deleted: " + q.remove());
        System.out.println(q);
    }
}
package model;
import sorter.AbstractSorter;
import sorter.BubbleSorter;
import sorter.QuickSorter;
import java.util.Arrays;
import java.util.Objects;

public class SortingTask extends Task{

    AbstractSorter sorter;
    public SortingTask(String taskID, String descriere, String strategy) {
        super(taskID, descriere);
        if(Objects.equals(strategy, "bubble")){
            sorter=new BubbleSorter();
        }else if(Objects.equals(strategy, "quick")){
            sorter=new QuickSorter();
        }
    }

    public SortingTask() {

    }

    @Override
    public void execute(){
        int[] vect = {4, 5, 3, 6, 1, 6};
        sorter.sort(vect);
        System.out.println(Arrays.toString(vect));
    }

    @Override
    public String toString() {
        return "model.SortingTask{" +
                "taskID='" + taskID + '\'' +
                ", descriere='" + descriere + '\'' +
                '}';
    }
}

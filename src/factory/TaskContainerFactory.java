package factory;

import container.Container;
import container.QueueContainer;
import container.StackContainer;
import container.Strategy;

import java.util.Objects;

public class TaskContainerFactory implements Factory{
    //singleton pattern
    private static final TaskContainerFactory instance=null;
    @Override
    public Container createContainer(Strategy strategy) {
        if(Objects.equals(strategy.str, "FIFO")){
            return new QueueContainer();
        }else{
            return new StackContainer();
        }
    }

    public TaskContainerFactory() {
    }

    public static TaskContainerFactory getInstance(){
        //create only one factory
        if(instance==null){
            return new TaskContainerFactory();
        }
        return instance;
    }
}

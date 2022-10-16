package factory;
import container.Strategy;
import container.Container;

public interface Factory {
    Container createContainer(Strategy strategy);
}
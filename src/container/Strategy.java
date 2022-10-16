package container;

public class Strategy {
    //FIFO or LIFO
    public String str;

    public Strategy(String strategy){
        this.str=strategy;
    }
    @Override
    public String toString() {
        return str;
    }
}

package sorter;

public class BubbleSorter extends AbstractSorter{
    @Override
    public int[] sort(int[] vect) {
        boolean ok=false;
        do{
            ok = false;
            for(int i = 0; i<vect.length-1; i++){
                if(vect[i] > vect[i+1]){
                    int t=vect[i];
                    vect[i]=vect[i+1];
                    vect[i+1]=t;
                    ok=true;
                }
            }
        }while(ok);
        return vect;
    }
}

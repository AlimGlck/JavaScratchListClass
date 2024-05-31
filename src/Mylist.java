import java.util.Arrays;
import java.util.Formattable;

public class Mylist <T>{

    private T[] dizi;
    private int capacity=10;

    public Mylist(){
        dizi = (T[]) new Object[this.capacity];
    }

    public Mylist(int capacity){
        this.capacity = capacity;
        dizi = (T[]) new Object[this.capacity];
    }

    public int size(){
        int x = 0;
        for (int i = 0; i<dizi.length; i++){
            if (dizi[i] != null){
                x++;
            }
        }

        return x;
    }

    public T get(int index){
        if (index>= 0 && index<dizi.length){
            return dizi[index];
        }
        else {
            return null;
        }

    }



    public T[] remove(int index){
        if (index>=0 && index< dizi.length) {
            dizi[index] = null;
            for (int i = index; i < dizi.length; i++) {
                if (i != dizi.length - 1) {
                    dizi[i] = dizi[i + 1];
                }
            }
            return dizi;
        }
        else {
            return null;
        }
    }



    public int getCapacity(){
        return dizi.length;
    }

    public T[] set(int index,T data){
        if (index>=0 && index< dizi.length) {
            dizi[index] = data;
            return dizi;
        }
        else {
            return null;
        }
    }

    public int indexOf(T data){
        int index = 0;
        for(T deger : dizi){
            if (deger == data){
                return index;
            }
            index++;
        }
        return -1;
    }

    public void add(T data){
        if (dizi[dizi.length-1] != null){
            T [] dizix = Arrays.copyOf(dizi,dizi.length);
            dizi = (T[]) new Object[dizix.length*2];
            for (int i =0; i<dizix.length; i++){
                dizi[i] = dizix[i];
            }

        }
        for (int i = 0; i< dizi.length; i++){
            if (dizi[i] == null){
                dizi[i] =data;
                break;
            }
        }
    }

    public String toString(){
        String diziString;
        int a = 0;
        for (int i = 0; i<dizi.length; i++){
            if (dizi[i]!=null){
                a++;
            }
        }
        T [] dizix = (T[]) new Object[a];
        for (int i = 0; i<dizi.length; i++){
            if (dizi[i] == null)
                continue;
            for (int y = 0; y<dizix.length; y++){
                if (dizix[y] != null)
                    continue;
                dizix[y] = dizi[i];
                break;
            }
        }

        diziString = Arrays.toString(dizix);

        return diziString;
    }

    public int lastIndexOf(T data){
        int index = -1;
        for (int i = 0; i<dizi.length; i++){
            if (dizi[i] == data){
                index = i;
            }
        }
        return index;
    }

    public T[] toArray(){
        return dizi;
    }

    public Mylist<T> sublist(int start,int finish){
        Mylist<T> subList = new Mylist<>();
        T [] dizix = (T[]) new Object[finish-start+1];
        for (int i = start,j=0; i<=finish; i++,j++){
            dizix[j] = dizi[i];
        }

        subList.dizi = dizix;

        return subList;
    }

    public boolean isEmpty(){
        for (T a : dizi){
            if (a != null){
                return false;
            }
        }
        return true;
    }

    public void clear(){
        for(T a : dizi){
            a = null;
        }
        dizi = (T[]) new Object[this.capacity];
    }

    public boolean contains(T data){
        for(T a : dizi){
            if (a == data){
                return true;
            }
        }
        return false;
    }


}

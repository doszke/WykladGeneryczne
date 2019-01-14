import java.util.ArrayList;
import java.util.NoSuchElementException;

public class  GenericStack<T> {


    private final ArrayList<T> elements;

    public GenericStack() {
        elements = new ArrayList<>();
    }

    public void push(T r){
        elements.add(r);
    }

    public T pop(){
        if(elements.isEmpty())
            throw new NoSuchElementException("Stack is empty");
        return elements.remove(elements.size()-1);
    }


}

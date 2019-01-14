import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Stack {


    private final ArrayList<Double> elements;

    public Stack() {
        elements = new ArrayList<>();
    }

    public void push(double r){
        elements.add(r);
    }

    public double pop(){
        if(elements.isEmpty())
            throw new NoSuchElementException("Stack is empty");
        return elements.remove(elements.size()-1);
    }


}

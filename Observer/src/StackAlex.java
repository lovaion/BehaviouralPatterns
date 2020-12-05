import java.util.Stack;

public class StackAlex extends Stack<String> {

    Canale canale;

    public StackAlex (Canale canale){
        this.canale = canale;
    }


    @Override
    public String push(String item) {
        canale.update("Nuovo video aggiunto! -> " + item );
        return super.push(item);
    }

    @Override
    public synchronized String pop() {
        canale.update("Ultimo video rimosso! -> " + peek());
        return super.pop();
    }
}

package deqo.apro.mysimplestack.MySimpleStack;

public class Item {

    private Object value;

    public Item(Object value) {
        this.value = value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }
}

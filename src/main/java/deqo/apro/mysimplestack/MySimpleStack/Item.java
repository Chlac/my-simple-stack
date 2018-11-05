package deqo.apro.mysimplestack.MySimpleStack;

public class Item {

    private Object value;

    /**
     * C'EST NOTRE PROJET !!
     * @param value
     */

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

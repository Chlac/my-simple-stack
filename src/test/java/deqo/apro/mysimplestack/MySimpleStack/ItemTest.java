package deqo.apro.mysimplestack.MySimpleStack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {

    private Item item;

    @Before
    public void setUp() throws Exception {
        this.item = new Item(null);
    }

    @Test
    public void testConstructor() {
        this.item = new Item(null);
        Assert.assertNotEquals(item, null);
    }

    @Test
    public void testSetValue() {
        Object o = new Object();
        this.item.setValue(o);
        Assert.assertEquals(item.getValue(), o);
    }

    @Test
    public void testGetValue() {
        Object o = new Object();
        this.item.setValue(o);
        Assert.assertEquals(item.getValue(), o);
    }
}
import de.telran.CustomLinkedList;
import de.telran.CustomList;
import org.junit.Assert;
import org.junit.Test;

public class CustomLinkedListTest {

    private CustomList<Integer> list = new CustomLinkedList<>();
    private CustomList<String> listString = new CustomLinkedList<>();


    @Test
    public void testSizeZero(){
        Assert.assertEquals(0, list.size());
    }

    @Test
    public void testSizeNotZero(){
        //int[] arr = {1,2,3};
        for (int i = 0; i <10 ; i++) {
            list.add(i);
        }
        Assert.assertEquals(10, list.size());
    }

    @Test
    public void testAddElementValue(){
        listString.add("test");
        String str = listString.get(0);
        Assert.assertEquals("test",str);
    }
}

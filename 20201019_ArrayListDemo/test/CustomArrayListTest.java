import de.telran.CustomArrayList;
import org.junit.Assert;
import org.junit.Test;

public class CustomArrayListTest {

    @Test
    public void testSizeZero(){
        CustomArrayList al = new CustomArrayList();
        Assert.assertEquals(0, al.size());
    }

    @Test
    public void testSizeNotZero(){
        int[] arr = {1,2,3,4};
        CustomArrayList<Integer> nums = new CustomArrayList<>();
        for (int a:arr) {
            nums.add(a);
        }
        Assert.assertEquals(4,nums.size());
    }

    @Test
    public void testCorrectSizeChanged(){
        int[] arr = {1,2,3,4,5,6,7};
        CustomArrayList<Integer> nums = new CustomArrayList<>();
        for (int a:arr) {
            nums.add(a);
        }
        Assert.assertEquals(7,nums.size());
    }

    @Test
    public void testAddCorrectOrder(){
        int[] arr = {1,4,3,2};
        CustomArrayList<Integer> nums = new CustomArrayList<>();
        for (int a:arr) {
            nums.add(a);
        }
        for (int i = 0; i <arr.length ; i++) {
            Assert.assertEquals(arr[i], nums.get(i).intValue());
        }
    }

    @Test
    public void testRemoveByIndex(){
        int[] arr = {1,2,3,4,5};
        CustomArrayList<Integer> nums = new CustomArrayList<>();
        for (int a:arr) {
            nums.add(a);
        }
        int actualDeletedNumber = nums.removeById(2); //3
        int[] expected = {1,2,4,5};
        Assert.assertEquals(3,actualDeletedNumber);
        for (int i = 0; i <expected.length ; i++) {
            Assert.assertEquals(expected[i], nums.get(i).intValue());
        }
        Assert.assertEquals(4, nums.size());
    }

    // write test with String

    @Test
    public void testRemoveByElement(){
        String[] input = {"aa","bb", "cc", "dd"};
        CustomArrayList<String>  listString = new CustomArrayList<>();
        for (String s: input) {
            listString.add(s);
        }

        boolean isRemoved = listString.remove("aa");
        boolean isNotRemoved = listString.remove("ff");
        Assert.assertTrue(isRemoved);
        Assert.assertFalse(isNotRemoved);

        String[] expected = {"bb", "cc", "dd"};
        for (int i = 0; i <expected.length ; i++) {
            Assert.assertEquals(expected[i], listString.get(i));
        }
        Assert.assertEquals(3, listString.size());
    }

}

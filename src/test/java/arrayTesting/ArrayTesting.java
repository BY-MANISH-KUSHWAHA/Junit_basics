package arrayTesting;

import org.example.Arrays.ArrayMethods;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ArrayTesting {
    int[] arr = {0,1,2,3,4,5,6,7,8,9};
    ArrayMethods obj = new ArrayMethods();

    @Test
    public void findIndexTest(){

        int num = 3;
        int result = obj.findIndex(arr,num);
        assertEquals(3,result);
        assertEquals(-1,obj.findIndex(arr,45));

    }

    @Test
    public void isNumberExistTest(){
        assertEquals(false,obj.isExist(arr,45));
        //assertEquals(true,obj.isExist(arr,9));
        assertTrue(obj.isExist(arr,9));
        assertTrue(false==obj.isExist(arr,45));

    }

    @Test
    public void findIndexEmpty(){
        assertEquals(-1,obj.findIndex(new int[]{} , 2));
    }

    // test asserts (assertTrue, assertNull, assertNotNull, assertNotEquals) & fail() --> method (if feature not completed)
    @Test
    public void testAsserts(){
        boolean result = true;
        assertEquals(true,result);
        assertTrue(true);

        String str = null;
        assertNull(str);

        assertNotNull(result);

        assertNotEquals(-1,3);

        assertFalse(false);

        assertArrayEquals(new int[]{1,2,3},new int[]{1,2,3});



    }

    @Test
    public void unCompleteFeature(){
        fail("Unfinished method");
    }

    @Test
    public void findIndexOutofBound(){
        // inside the method, particular call throw the specific expection
        assertThrows(ArrayIndexOutOfBoundsException.class,() ->obj.printElementAt(arr,101));

    }


    @Test
    public void MultipleAssetsAtOnce(){
        assertAll(
                () -> assertEquals(1,1),
                () -> assertEquals(1,obj.findIndex(arr,1)),
                () -> assertEquals(-1,obj.findIndex(arr,1))
                );
    }


}

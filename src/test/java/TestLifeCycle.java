import org.example.Arrays.ArrayMethods;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestLifeCycle {
    private int[] arr = {0,1,2,3,4,5,6,7,8,9};
    private ArrayMethods obj ;

    @Test
    public void findIndexTest(){
        System.out.println("Test 1");
        int num = 3;
        int result = obj.findIndex(arr,num);
        assertEquals(3,result);
        assertEquals(-1,obj.findIndex(arr,45));

    }

    @Test
    public void isNumberExistTest(){
        System.out.println("Test 2");
        assertEquals(false,obj.isExist(arr,45));
        //assertEquals(true,obj.isExist(arr,9));
        assertTrue(obj.isExist(arr,9));
        assertTrue(false==obj.isExist(arr,45));

    }


    @BeforeEach
    public void beforeEachTest(){
        System.out.println("2. before each test case");
        this.obj = new ArrayMethods();
    }

    @AfterEach
    public void afterEachTest(){
        System.out.println("3. Cleanup after the rest { reset variables for next test.}");
    }

    @BeforeAll
    public static void beforeAllTest(){
        System.out.println("1, Before running all the test");
    }

    @AfterAll
    public static void afterAllTest(){
        System.out.println("4. After All test.");
    }




}

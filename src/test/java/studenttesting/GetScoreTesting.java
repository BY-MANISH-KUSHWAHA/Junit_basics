
package studenttesting;

import org.example.Student.StudentDAO;
import org.example.Student.StudentService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class GetScoreTesting {

    @Test
    public void testFindTotal(){
        StudentService service = new StudentService(new StudentDAOStub());
        int sum = service.findTotalScore();
        System.out.println("Total Sum:"+sum);
        assertEquals(52,sum);



    }
}

// Using stub as imitation dao instead of StudentDAO
// and using it for testing
class StudentDAOStub extends StudentDAO {
    @Override
    public int[] getScore() {
        return new int[]{3,4,5,6,7,8,9,10};
    }
}


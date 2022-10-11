package Mockito.Mock;

import org.example.Student.StudentDAO;
import org.example.Student.StudentService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class StudentServiceMockTest {

    @Test
    public void findTotal(){
        StudentDAO daoMock = mock(StudentDAO.class);
        System.out.println(daoMock.getClass().getSimpleName());


        // if we call getScore in daoMock then we return our custom array for testing {new int[]{1,2,3,4,5,6,7,8,9,10}) instead of int[]{}}
        when(daoMock.getScore()).thenReturn(new int[]{1,2,3,4,5,6,7,8,9,10});// 10*11/2 => 5*11 => 55

        StudentService service = new StudentService(daoMock);

        int result = service.findTotalScore(); // inside this we call getScore()
        System.out.println(result);

        assertEquals(55,result);


    }

}

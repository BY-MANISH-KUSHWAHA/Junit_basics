package Mockito.Mock;

import org.example.Student.StudentDAO;
import org.example.Student.StudentService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class StudentServiceMockitoAnnotationsTest {
    @Mock
    StudentDAO daoMock;

    @InjectMocks
    StudentService service;


    @Test
    public void testTotalScores(){
        when(daoMock.getScore()).thenReturn(new int[]{1,2,3,4,5,6,7,8,9,10});
        // make mock of StudentDao class using @Mock for override its functionality using when and then result.
        // Inject the mode to StudentService using @InjectMocks

        assertEquals(55,service.findTotalScore());
    }

}

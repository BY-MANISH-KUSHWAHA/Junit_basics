package org.example.Student;


import org.springframework.beans.factory.annotation.Autowired;

public class StudentService {

    private StudentDAO repo;

    public StudentService(StudentDAO repo){
        super();
        this.repo = repo;
    }

    public int findTotalScore(){
        int[] arr = repo.getScore();
        int sum = 0;
        for (int value:
             arr) {
            sum = sum + value;
        }

        return sum;

    }

}

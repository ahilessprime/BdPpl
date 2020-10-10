package BdPpl;

import java.util.ArrayList;
import java.util.Map;

public class FindStudetByFaculty {

    private Map<Integer, Student> studentsTable;

    public FindStudetByFaculty(Map<Integer, Student> studentsTable){
        this.studentsTable = studentsTable;
    }

    public ArrayList<Student> studentsOfAGivenFaculty(Faculty faculty){

        ArrayList<Student> studentsList = new ArrayList<Student>();

        for (Integer IdStudent : studentsTable.keySet() ){
            Student student = studentsTable.get(IdStudent);
            if(faculty == student.getFaculty()){
                studentsList.add(student);
            }
        }

        return studentsList;
    }

    //доделать
    public void studentsOfEachFaculty(){

    }

}

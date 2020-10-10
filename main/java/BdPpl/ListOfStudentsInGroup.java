package BdPpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ListOfStudentsInGroup {
    Map<Integer, Student> listStudents;
    public ListOfStudentsInGroup(Map<Integer, Student> listStudents){
        this.listStudents = listStudents;
    }

    public ArrayList<HashMap> sortStudentsInGroup(){
        for (Integer key: listStudents.keySet()){
            Student student = listStudents.get(key);

        }
        return null;
    }
}

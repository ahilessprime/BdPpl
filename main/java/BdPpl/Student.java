package BdPpl;

import java.util.Date;
import java.util.HashMap;
import java.util.Random;

public class Student {

    private static HashMap<Integer, Student> studentsTable = new HashMap<Integer, Student>();

    private final int ID;
    private String surname;
    private String name;
    private String patronymic;
    private Date dateOfBirth;
    private String address;
    private int phoneNumber;
    private Faculty faculty;
    private Course course;
    private int group;

    public Student(){
        ID = initializationID();
    }
    public Student(String name){
        this();
        this.name = name;
    }
    public Student(String surname, String name){
        this(name);
        this.surname = surname;
    }


    private int initializationID(){

        int id = 0;
        boolean findValueForID = true;

        while (findValueForID){
            id = new Random().nextInt();
            if (!studentsTable.containsKey(id)){
                findValueForID = false;
            }
        }
        return id;
    }

    @Override
    public String toString() {
        return surname +" "+ name + " Факультет: " + faculty + " номер телефона: " + phoneNumber;
    }


    //setters and getters variables


    public static HashMap<Integer, Student> getStudentsTable() {
        return studentsTable;
    }

    public int getID() {
        return ID;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }
    public String getPatronymic() {
        return patronymic;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }
    public Faculty getFaculty() {
        return faculty;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
    public Course getCourse() {
        return course;
    }

    public void setGroup(int group) {
        this.group = group;
    }
    public int getGroup() {
        return group;
    }
}

enum Faculty{
    ECONOMIC,
    LEGAL,
    HISTORICAL,
    MATHEMATICAL,
    BIOLOGIC,
}

enum Course{
    COURSE1,
    COURSE2,
    COURSE3,
    COURSE4,
    COURSE5,
}

enum Group{
    GROUP1,
    GROUP2,
    GROUP3,
    GROUP4,
    GROUP5,
}
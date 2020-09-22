package by.epam.learnjava;

public class Student {

    public Student() {}

    public Student(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public Student (int id) {
        this.id = id;
    }

    public void setId (int id) {
        this.id= id;
    }

    public int getId() {
        return this.id;
    }

    public void toString() {
        System.out.println();
    }

    private int id;
    private String lastName;
    private String firstName;
    private String patronymic;
    private int dateOfBirth;
    private String address;
    private int phoneNumber;
    private String faculty;
    private int course;
    private int class;
}

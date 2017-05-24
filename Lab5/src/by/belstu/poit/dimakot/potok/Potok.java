package by.belstu.poit.dimakot.potok;

import by.belstu.poit.dimakot.student.Student;

import java.util.ArrayList;

public class Potok {
    ArrayList<Student> myPotok = new ArrayList<>();

    public void setMyPotok(ArrayList<Student> pMyPotok) {
        if (pMyPotok == null)
            throw new NullPointerException("Null pointer");
        this.myPotok = pMyPotok;
    }

    public ArrayList<Student> getMyPotok() {
        return myPotok;
    }

    public void AddStudent(Student pStud) {
        if (pStud == null)
            throw new NullPointerException("Null pointer");
        this.myPotok.add(pStud);
    }

    public Student GetStudByID(int id) {
        if(id>myPotok.size())
            throw new ArrayIndexOutOfBoundsException("Error in ID");
        return this.myPotok.get(id);
    }

    String name;

    public Potok(String val) {
        this.name = val;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Student> GetMyPotok() {
        return this.myPotok;
    }

}
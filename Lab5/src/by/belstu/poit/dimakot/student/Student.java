package by.belstu.poit.dimakot.student;

import by.belstu.poit.dimakot.enums.Spec;
import by.belstu.poit.dimakot.enums.Form;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

import java.net.SocketPermission;

public class Student implements Actions, ErrorHandler {
    public Student(String pName, int pCourse, Form pForm, Spec pSpec, double pMark) {
        this.name = pName;
        this.course = pCourse;
        this.form = pForm;
        this.spec = pSpec;
    }

    private int numOfZach;

    public void setNumOfZach(int val) {
        this.numOfZach = val;
    }

    String surname;

    public void setSurname(String val) {
        this.surname = val;
    }

    public String getSurname() {
        return this.surname;
    }

    String name;

    public Student() {
    }

    public Student(String logname) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    int course;

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    Form form;

    public Form getForm() {
        return form;
    }

    public void setForm(Form form) {
        this.form = form;
    }

    Spec spec;

    public Spec getSpec() {
        return spec;
    }

    public void setSpec(Spec spec) {
        this.spec = spec;
    }

    @Override
    public void GoWalk() {
        System.out.println("Ушёл гулять");
    }

    @Override
    public void MissLesson() {
        System.out.println("Прогулял");
    }

    @Override
    public void PlayGames() {
        System.out.println("Играет");
    }

    @Override
    public void warning(SAXParseException exception) throws SAXException {

    }

    @Override
    public void error(SAXParseException exception) throws SAXException {

    }

    @Override
    public void fatalError(SAXParseException exception) throws SAXException {

    }
}
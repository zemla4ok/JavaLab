package by.belstu.poit.dimakot.student;

import by.belstu.poit.dimakot.enums.Spec;
import by.belstu.poit.dimakot.enums.Form;
import com.sun.javaws.exceptions.InvalidArgumentException;

import java.net.SocketPermission;

public class Student implements Actions {
    public Student(String pName, int pCourse, Form pForm, Spec pSpec, double pMark) {
        this.name = pName;
        this.course = pCourse;
        this.form = pForm;
        this.spec = pSpec;
        zch = new Zach(pMark);
    }

    public void mk42(){
        this.zch.mk4();
    }

    public Zach getZch(){
        return this.zch;
    }

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private Zach zch;
    int course;

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) throws InvalidArgumentException {
        if (course > 0 && course < 5)
            this.course = course;
        else
            throw new InvalidArgumentException(new String[]{"asd"});
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

    public class Zach {
        Zach(double pAver_mark) {
            aver_mark = pAver_mark;
        }

        double aver_mark;

        public void setAver_mark(double aver_mark) {
            this.aver_mark = aver_mark;
        }

        public double getAver_mark() {
            return aver_mark;
        }

        public void mk4() {
            this.aver_mark *= 2;
        }
    }
}
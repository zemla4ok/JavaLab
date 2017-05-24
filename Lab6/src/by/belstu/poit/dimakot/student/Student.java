package by.belstu.poit.dimakot.student;

import by.belstu.poit.dimakot.enums.Spec;
import by.belstu.poit.dimakot.enums.Form;

import java.net.SocketPermission;

public class Student implements Actions {
    public Student(String pName, int pCourse, Form pForm, Spec pSpec, double pMark) {
        this.name = pName;
        this.course = pCourse;
        this.form = pForm;
        this.spec = pSpec;
        zch = new Zach(pMark);
    }

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Zach zch;
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
    }
}
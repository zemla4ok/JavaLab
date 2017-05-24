package by.belstu.poit.dimakot.decan;

import by.belstu.poit.dimakot.human.Creator;
import by.belstu.poit.dimakot.potok.Potok;
import by.belstu.poit.dimakot.student.Student;

import java.util.Comparator;

public class Decan extends Creator {
    private static Decan ourInstance;

    public static Decan getInstance() {
        if (ourInstance == null)
            ourInstance = new Decan();
        return ourInstance;
    }

    private Decan() {
    }

    @Override
    public Potok FactoryMethod(String val) {
        return new Potok(val);
    }

    public void CounntCourses(Potok val) {
        int firstCourse = 0;
        int secindCourse = 0;
        int thirdCourse = 0;
        int fourthCourse = 0;
        for (int i = 1; i < val.GetMyPotok().size(); i++) {
            if (val.GetStudByID(i).getCourse() == 1)
                firstCourse++;
            if (val.GetStudByID(i).getCourse() == 2)
                secindCourse++;
            if (val.GetStudByID(i).getCourse() == 3)
                thirdCourse++;
            if (val.GetStudByID(i).getCourse() == 4)
                fourthCourse++;
        }
        System.out.println("Stud on first coutse: " + firstCourse);
        System.out.println("Stud on second coutse: " + secindCourse);
        System.out.println("Stud on third coutse: " + thirdCourse);
        System.out.println("Stud on fourth coutse: " + fourthCourse);
    }

    public void CreatePotokByCourse(Potok potok, Potok newPotok, int course) {
        if (potok == null || newPotok == null)
            throw new NullPointerException("Null pointer");
        for (int i = 0; i < potok.GetMyPotok().size(); i++) {
            if (potok.GetStudByID(i).getCourse() == course)
                newPotok.GetMyPotok().add(potok.GetStudByID(i));
        }
    }

    public void SortByName(Potok val) {
        if (val == null)
            throw new NullPointerException("Null pointer");
        val.GetMyPotok().sort(new Comparator<Student>() {
            @Override
            public int compare(Student a, Student b) {
                return a.getName().compareTo(b.getName());
            }
        });
    }
}
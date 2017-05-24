package by.belstu.poit.dimakot.main;

import by.belstu.poit.dimakot.decan.Decan;
import by.belstu.poit.dimakot.enums.Form;
import by.belstu.poit.dimakot.enums.Spec;
import by.belstu.poit.dimakot.potok.Potok;
import by.belstu.poit.dimakot.student.Student;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;
import org.apache.log4j.xml.DOMConfigurator;

public class Main {
    static {
        new DOMConfigurator().doConfigure("log/log4j.xml",
                LogManager.getLoggerRepository());
    }

    private static final Logger LOG = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        try {
            LOG.info("Starting program_______________________");
            LOG.info("Create Decan(singleton)");
            Decan john = Decan.getInstance();
            LOG.info("Create first(Potok) by FactoryMethod");
            Potok first = john.FactoryMethod("First");
            LOG.info("create and Add students to potok");
            Student dima   = new Student("Dmitry", 2, Form.DAY, Spec.POIT, 7.7);
            Student nick   = new Student("Nick",   2, Form.DAY, Spec.ISIT, 8.2);
            Student alex   = new Student("Alex",   2, Form.DAY, Spec.POIT, 7.5);
            Student eugene = new Student("Eugene", 1, Form.DAY, Spec.POIT, 6.2);
            Student nikita = new Student("Nikita", 1, Form.DAY, Spec.ISIT, 9.3);

            first.AddStudent(nick);
            first.AddStudent(alex);
            first.AddStudent(eugene);
            first.AddStudent(nikita);
            first.AddStudent(dima);
            LOG.info("Counter of courses");
            john.CounntCourses(first);

            Potok firstCourses = john.FactoryMethod("First Course");
            john.CreatePotokByCourse(first, firstCourses, 1);
            for (int i = 0; i < firstCourses.GetMyPotok().size(); i++) {
                System.out.println(i + ") " + firstCourses.GetStudByID(i).getName());
            }
            LOG.info("Sorting by name");
            System.out.println();
            for (int i = 0; i < first.GetMyPotok().size(); i++) {
                System.out.println(i + ") " + first.GetStudByID(i).getName());
            }
            john.SortByName(first);
            System.out.println();
            for (int i = 0; i < first.GetMyPotok().size(); i++) {
                System.out.println(i + ") " + first.GetStudByID(i).getName());
            }

            //firstCourses.GetStudByID(0).zch.getAver_mark();

            john.SortByMark(first);
            System.out.println();
            for (int i = 0; i < first.GetMyPotok().size(); i++) {
                System.out.println(i + ") " + first.GetStudByID(i).getName());
            }
            LOG.info("End Program___________");
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
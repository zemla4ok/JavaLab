package testBean;

import java.io.Serializable;
import java.util.Calendar;

public class JavaBeanDate implements Serializable {

    public JavaBeanDate(){}
    public String getDate(){

        return Calendar.getInstance().getTime().toString();
    }
}

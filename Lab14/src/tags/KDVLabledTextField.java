package tags;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;
import java.io.IOException;

public class KDVLabledTextField extends TagSupport {
    public String value = "";
    public String label = "";
    public String name = "";

    public void setLable(String _label) {
        this.label = _label;
    }

    public void setName(String _name) {
        this.name = _name;
    }

    public void setValue(String _value) {
        this.value = _value;
    }

    public String getValue() {
        return this.value;
    }

    public String getLabel() {
        return this.label;
    }

    public String getName() {
        return this.name;
    }

    public int doStartTag() {
        JspWriter out = pageContext.getOut();
        try {
            out.print("<label>" + label + "</label>"
                    + "<input name =\"" + name + "\" type = \"text\" width = \"150\""
                    + " maxlength= \"30\" value =\"" + this.value + "\" />");
        } catch (IOException e) {
            System.out.println("KDVLable" + e);
        }
        return SKIP_BODY;
    }
}

package tags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;
import java.io.IOException;

public class KDVSubmit extends TagSupport{
    public int doStartTag() throws JspException {
        String in = "<input type=\"submit\" value=\"OK\"><br/>"
                + "<input type=\"reset\" value=\"Cancel\"><br/>";

        JspWriter out = pageContext.getOut();
        try {
            out.print(in);
        } catch (IOException e) {
            System.out.println("KDVSubmit: " + e);
        }
        return EVAL_BODY_INCLUDE;
    }
}

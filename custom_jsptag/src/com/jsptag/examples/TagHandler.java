package com.jsptag.examples;
import java.util.Calendar;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

//Step 1: Create a TagHandler that extends TagSupport
public class TagHandler extends TagSupport {
    public int doStartTag() throws JspException {
        JspWriter out=pageContext.getOut();
        try{
            //Local time
            out.print("Local time is: "+ Calendar.getInstance().getTime()+"\n");
        }catch(Exception e){System.out.println(e);}
        return SKIP_BODY;
    }
}

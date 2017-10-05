/*
 *==================================================================================
 *== COPYRIGHT HYPERTECH COBRA TEAM. ALL RIGHT RESERVED.							==
 *== HYPERTECH PROPRIETARY/CONFIDENTIAL. USE THIS SUBJECT TO LICENSE TERMS.		==
 *==																				==
 *== VISIT HTTP://COBRAFW.IO FOR MORE INFORMATION									==
 *==================================================================================
 *
 *== File Name: HelloTag.java
 *== Created at: Oct 6, 2017 12:53:07 AM
 *== Created by: duongnguyen
 *== Project: lesson06-hellotag
 *== Package: io.cobrafw.javaweb.taglib
 */
package io.cobrafw.javaweb.taglib;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 * Hello Tag - Custom Tag Lib Demo
 *
 * @author duongnguyen
 */
public class HelloTag extends SimpleTagSupport {

	/**
	 * @see SimpleTagSupport#doTag()
	 */
	@Override
	public void doTag() throws JspException, IOException {

		// Get JSP Writer
		JspWriter jspWriter = this.getJspContext().getOut();

		jspWriter.println("<p class='hello-tag'>Hello World! This is my first custom tag.<p>");
		jspWriter.println("<p class='hello-tag'>Nice to meet all of you.<p>");
	}
}

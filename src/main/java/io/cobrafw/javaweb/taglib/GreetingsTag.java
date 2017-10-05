/*
 *==================================================================================
 *== COPYRIGHT HYPERTECH COBRA TEAM. ALL RIGHT RESERVED.							==
 *== HYPERTECH PROPRIETARY/CONFIDENTIAL. USE THIS SUBJECT TO LICENSE TERMS.		==
 *==																				==
 *== VISIT HTTP://COBRAFW.IO FOR MORE INFORMATION									==
 *==================================================================================
 *
 *== File Name: GreetingsTag.java
 *== Created at: Oct 6, 2017 1:36:23 AM
 *== Created by: duongnguyen
 *== Project: lesson06-hellotag
 *== Package: io.cobrafw.javaweb.taglib
 */
package io.cobrafw.javaweb.taglib;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 * @author duongnguyen
 *
 */
public class GreetingsTag extends SimpleTagSupport {

	/** Attribute: name */
	private String name;

	/** Attribute: date */
	private String dateFormat;

	/**
	 * @see SimpleTagSupport#doTag()
	 */
	@Override
	public void doTag() throws JspException, IOException {

		// Get JSP Writer
		JspWriter jspWriter = this.getJspContext().getOut();

		// Check date format & Set default value
		this.dateFormat = this.dateFormat == null || this.dateFormat.isEmpty()
																		? "yyyy/MM/dd" : this.dateFormat;

		// Get system date
		Date date = new Date();

		// Format date
		String printDate = new SimpleDateFormat(this.dateFormat).format(date);

		jspWriter.println("<p class='hello-tag'>Welcome: " + this.name + ".<p>");
		jspWriter.println("<p class='hello-tag'>Please remember that we meet togother on: "+printDate+".<p>");
	}

	/**
	 * @param date the date to set
	 */
	public void setDateFormat(String dateFormat) {
		this.dateFormat = dateFormat;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
}

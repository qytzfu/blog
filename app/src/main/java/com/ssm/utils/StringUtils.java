package com.ssm.utils;

public class StringUtils {
	public static String replace_html_tags(String str_input) {
		str_input = str_input.replaceAll("<", "&lt;");
		str_input = str_input.replaceAll(">", "&gt;");
		return str_input;
	}
}

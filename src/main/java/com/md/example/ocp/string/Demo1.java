package com.md.example.ocp.string;

import org.apache.commons.lang3.StringUtils;

public class Demo1 {

	public static void main(String[] args) {
		StringUtils.isBlank(null);  // true
		StringUtils.isBlank(""); // true
		StringUtils.isBlank(" "); // true
		StringUtils.isBlank("bob"); // false
		StringUtils.isBlank("  bob  "); // false


		StringUtils.isEmpty(null);  // true
		StringUtils.isEmpty(""); // true
		StringUtils.isEmpty(" "); // false
		StringUtils.isEmpty("bob"); // false
		StringUtils.isEmpty("  bob  "); // false


		System.out.println(StringUtils.isNotBlank(" "));
		System.out.println(StringUtils.isNotBlank("not "));
		System.out.println(StringUtils.isNotBlank(" not"));
		System.out.println(StringUtils.isNotBlank(" not "));
		System.out.println(StringUtils.isNotBlank("not"));


	}
}

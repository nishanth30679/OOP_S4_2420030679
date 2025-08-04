package Mystrings;

public class StringMethods {

	public static void main(String[] args) {
	//program to work with multiple string methods.
		
		String str = "Hello";
		String str1 = "hello";
		System.out.println(str1.length());
		System.out.println(str.charAt(2));
		System.out.println(str.substring(0));
		System.out.println(str.equals(str1));
		System.out.println(str.equalsIgnoreCase(str1));
		System.out.println(str.compareTo(str1));
		System.out.println(str.compareToIgnoreCase(str1));
		System.out.println(str.contains("lo"));
		System.out.println(str.startsWith("h"));
		System.out.println(str1.endsWith("o"));
		System.out.println(str1.indexOf("l"));
		System.out.println(str.lastIndexOf("l"));
		System.out.println(str1.trim());
		System.out.println(str1.replace("h","o"));
		System.out.println(str.replaceAll(str, str1));
		System.out.println(str1.toCharArray());
		System.out.println(str.valueOf(str));
		System.out.println(str.replaceFirst(str, str1));
		System.out.println(str.toLowerCase());
		System.out.println(str1.toUpperCase());
		System.out.println(str1.isEmpty());

	}

}

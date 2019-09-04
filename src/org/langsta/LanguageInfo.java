package org.langsta;

public class LanguageInfo extends StateDetails {
public void tamil() {
System.out.println("tamil");
}
public void english() {
System.out.println("english");
}
public void hindi() {
System.out.println("hindi");
}
public static void main(String[] args) {
	LanguageInfo l = new LanguageInfo ();
	l.tamil();
	l.english();
	l.hindi();
	l.south();
	l.north();
}
}

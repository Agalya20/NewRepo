package org.lang;

public class StateDetails {
public void southIndia() {
System.out.println("Southindia");
}
public void northIndia() {
System.out.println("northindia");
}
public static void main(String[] args) {
	StateDetails s = new StateDetails();
	s.southIndia();
	s.northIndia();
	LanguageInfo l=new LanguageInfo();
	l.tamilLang();
	l.englishlang();
	l.hindiLang();
}
}

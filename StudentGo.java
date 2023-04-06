package java_Class;

public class StudentGo {

	public static void main(String[] args) {
		StudentMng sm = new StudentMng();
		for (int i = 0; i < 3; i++) {
			Student s = new Student();
			s.setInfo();
			sm.makeClass(s);
		}
		sm.showClass();
	}
}

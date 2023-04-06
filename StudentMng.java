package java_Class;

public class StudentMng {

	Student[] students = new Student[3];

	int maxClass = 15;
	int currentPos = 0;

	void makeClass(Student s) 
	{
		if (currentPos + 1 > maxClass) {
			System.out.println("클래스의 정원을 넘어섰습니다(15명).");
			return;
		}
		students[currentPos++] = s;
	}

	void showClass() { 
		System.out.printf("이름\t국어\t영어\t수학\t평균\t학점\n");
		for (int i = 0; i < students.length; i++) {
			if (i > currentPos - 1) {
				return;
			}
			students[i].studentInfo();
		}
	}
}

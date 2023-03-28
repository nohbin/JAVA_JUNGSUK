package demo06;

class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	int sum;
	float avg;

	public String info() {
		return name + ban + no + kor  + eng  + math;
	}

	public int getTotal() {
		sum = kor + eng + math;
		return sum;
	}

	public float getAverage() {
		avg = (float) (sum / 3.0);
		return avg;
	}

	public Student() {
	}

	public Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

}

public class Demo6_3_5 {
	public static void main(String[] args) {

		Student s = new Student();
		Student s1 = new Student("홍길동", 1, 1, 100, 60, 76);
		s.name = "홍길동";
		s.ban = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;

		System.out.println("이름 : " + s.name);
		System.out.println("총점 : " + s.getTotal());
		System.out.println("평균 : " + s.getAverage());

		System.out.println(s1.info());
	}

}

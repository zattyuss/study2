package section.exam02;

public class Student {
	int id;        //학번
	int age ;      //나이
	String name;   //이름
	String grade;  //학년
	String major;  //전공
	
	void study() {
		System.out.println(name + " 공부합니다.");
	}
	
	void goToSchool() {
		System.out.println(name + " 학교에 갑니다.");
	}
}

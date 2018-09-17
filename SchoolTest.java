package test;

import model.Student;
import model.Subject;

public class SchoolTest {

	public static void main(String[] args) {
		//测试Subject
		Subject sub1=new Subject("计算机科学与应用","J0001",4);
		System.out.println(sub1.info());
		System.out.println("-----------------------------");
		//测试学生
		Student stu1=new Student("S01","张三","男",20,sub1);
		System.out.println(stu1.introduction());
		System.out.println("-----------------------------");
		Student stu2=new Student("S02","李四","女",17);
		System.out.println(stu2.introduction("计算机科学应用",4));
		System.out.println("-----------------------------");
		Student stu3=new Student("S03","王五	","男",18);
		System.out.println(stu3.introduction(sub1));
		System.out.println("------------------------------");
		//测试有多少学生报名
		sub1.addStudnet(stu1);
		sub1.addStudnet(stu2);
		sub1.addStudnet(stu3);
		System.out.println(sub1.getSubjectName()+"中，已报名"+"学生个数为："+sub1.getStudentNum());
		
	}

}

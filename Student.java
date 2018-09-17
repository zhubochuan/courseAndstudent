package model;

public class Student {
	// 成员特征:学号，姓名，性别，年龄
	private String studentNo;
	private String studentName;
	private String studentSex;
	private int StudentAge;
	private Subject studentSubject;

	public Student() {
		super();
	}

	public Student(String studentNo, String studentName, String studentSex, int studentAge, Subject stuSubject) {
		super();
		this.setStudentNo(studentNo);
		this.setStudentAge(studentAge);
		this.setStudentName(studentName);
		this.setStudentSex(studentSex);
		this.setStudentSubject(stuSubject);
	}
	public Student(String studentNo, String studentName, String studentSex, int studentAge) {
		super();
		this.setStudentNo(studentNo);
		this.setStudentAge(studentAge);
		this.setStudentName(studentName);
		this.setStudentSex(studentSex);
	}
	/**
	 * 
	 * @return
	 */
	public Subject getStudentSubject() {
		if (this.studentSubject == null)
			this.studentSubject = new Subject();
		return studentSubject;
	}

	public void setStudentSubject(Subject studentSubject) {
		this.studentSubject = studentSubject;
	}

	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentSex() {
		return studentSex;
	}

	// 限制性别只可以是男或女
	/**
	 * 
	 * @param studentSex
	 */
	public void setStudentSex(String studentSex) {
		if (studentSex.equals("男") || studentSex.equals("女"))
			this.studentSex = studentSex;
		else
			return;
	}

	public int getStudentAge() {
		return StudentAge;
	}

	/**
	 * 设置年龄限制
	 * 
	 * @param studentAge
	 */
	public void setStudentAge(int studentAge) {
		if (studentAge < 10 || studentAge > 100)
			this.StudentAge = 18;
		else
			this.StudentAge = studentAge;
	}

	/**
	 * 学生介绍的方法
	 * 
	 * @return 姓名，学号，年龄......
	 */
	public String introduction() {
		String str = "学生信息如下:\n姓名:" + this.getStudentName() + "\n性别:" + this.getStudentSex() + "\n年龄:"
				+ this.getStudentAge() + "\n学号:" + this.getStudentNo()+"\n所报专业名称:" + this.getStudentSubject().getSubjectName()
				+ "\n所报专业学制:" + this.getStudentSubject().getSubjectLife();
		return str;
	}

	/**
	 * 所学专业名称和学制
	 * 
	 * @param subjectName
	 * @param subjectLife
	 * @return
	 */
	public String introduction(String subjectName, int subjectLife) {
		String str = "学生信息如下:\n姓名:" + this.getStudentName() + "\n性别:" + this.getStudentSex() + "\n年龄:"
				+ this.getStudentAge() + "\n学号:" + this.getStudentNo() + "\n所报专业名称:" + subjectName + "\n所报专业学制:"
				+ subjectLife;
		return str;
	}

	/**
	 * 学生自我介绍的方法
	 * 
	 * @param mySubject
	 *            所选专业的对象
	 * @return
	 */
	public String introduction(Subject mySubject) {
		String str = "学生信息如下:\n姓名:" + this.getStudentName() + "\n性别:" + this.getStudentSex() + "\n年龄:"
				+ this.getStudentAge() + "\n学号:" + this.getStudentNo() + "\n所报专业名称:" + mySubject.getSubjectName()
				+ "\n所报专业学制:" + mySubject.getSubjectLife();
		return str;

	}
}

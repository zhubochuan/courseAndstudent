package model;

public class Student {
	// ��Ա����:ѧ�ţ��������Ա�����
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

	// �����Ա�ֻ�������л�Ů
	/**
	 * 
	 * @param studentSex
	 */
	public void setStudentSex(String studentSex) {
		if (studentSex.equals("��") || studentSex.equals("Ů"))
			this.studentSex = studentSex;
		else
			return;
	}

	public int getStudentAge() {
		return StudentAge;
	}

	/**
	 * ������������
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
	 * ѧ�����ܵķ���
	 * 
	 * @return ������ѧ�ţ�����......
	 */
	public String introduction() {
		String str = "ѧ����Ϣ����:\n����:" + this.getStudentName() + "\n�Ա�:" + this.getStudentSex() + "\n����:"
				+ this.getStudentAge() + "\nѧ��:" + this.getStudentNo()+"\n����רҵ����:" + this.getStudentSubject().getSubjectName()
				+ "\n����רҵѧ��:" + this.getStudentSubject().getSubjectLife();
		return str;
	}

	/**
	 * ��ѧרҵ���ƺ�ѧ��
	 * 
	 * @param subjectName
	 * @param subjectLife
	 * @return
	 */
	public String introduction(String subjectName, int subjectLife) {
		String str = "ѧ����Ϣ����:\n����:" + this.getStudentName() + "\n�Ա�:" + this.getStudentSex() + "\n����:"
				+ this.getStudentAge() + "\nѧ��:" + this.getStudentNo() + "\n����רҵ����:" + subjectName + "\n����רҵѧ��:"
				+ subjectLife;
		return str;
	}

	/**
	 * ѧ�����ҽ��ܵķ���
	 * 
	 * @param mySubject
	 *            ��ѡרҵ�Ķ���
	 * @return
	 */
	public String introduction(Subject mySubject) {
		String str = "ѧ����Ϣ����:\n����:" + this.getStudentName() + "\n�Ա�:" + this.getStudentSex() + "\n����:"
				+ this.getStudentAge() + "\nѧ��:" + this.getStudentNo() + "\n����רҵ����:" + mySubject.getSubjectName()
				+ "\n����רҵѧ��:" + mySubject.getSubjectLife();
		return str;

	}
}

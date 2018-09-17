package model;

/**
 * @author bochuan zhu
 */
public class Subject {
	// 成员属性:学科名称，学科编号，学制, 报名选修的学生个数
	private String subjectName;
	private String subjectNo;
	private int subjectLife;
	private Student[] mystudents;
	private int studentNum;

	// 无参构造
	public Subject() {

	}

	// 带参构造，实现对属性的全部赋值
	public Subject(String subjectName, String subjectNo, int subjectLife) {
		this.setSubjectName(subjectName);
		this.setSubjectNo(subjectNo);
		this.setSubjectLife(subjectLife);
	}

	public Subject(String subjectName, String subjectNo, int subjectLife, Student[] mystudents) {
		this.setSubjectName(subjectName);
		this.setSubjectNo(subjectNo);
		this.setSubjectLife(subjectLife);
		this.setMystudents(mystudents);
	}

	/**
	 * 获取选修专业信息，未初始化则初始化长度为200
	 * 
	 * @return
	 */
	
	public Student[] getMystudents() { // 引用类型初始化
		if (mystudents == null)
			this.mystudents = new Student[200];
		return mystudents;
	}

	public int getStudentNum() {
		return studentNum;
	}

	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}

	public void setMystudents(Student[] mystudents) {
		this.mystudents = mystudents;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getSubjectName() {
		return this.subjectName;
	}

	public String getSubjectNo() {
		return subjectNo;
	}

	public void setSubjectNo(String subjectNo) {
		this.subjectNo = subjectNo;
	}

	public int getSubjectLife() {
		return subjectLife;
	}

	// 限制年限
	public void setSubjectLife(int subjectLife) {
		if (subjectLife <= 0)
			return;
		this.subjectLife = subjectLife;
	}

	/**
	 * 单一复用性
	 * 
	 * @return 信息
	 */
	public String info() {
		String str = "专业信息如下:\n专业名称:" + this.getSubjectName() + "\n专业编号:" + this.getSubjectNo() + "\n专业学制年限:"
				+ this.getSubjectLife();
		return str;
	}
	public void addStudnet(Student stu)
	{
		/**
		 * 1.将学生保存到数组中
		 * 2.将学生个数保存到studentNum中
		 */
		//1. 保存到数组中
		for(int i=0;i<this.getMystudents().length;i++)
		{
			if(this.getMystudents()[i]==null)
			{
				this.getMystudents()[i]=stu;
				this.studentNum=i+1;
				return;
			}
		}
		//2. 个数存到studentNum中
		
	}
}

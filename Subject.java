package model;

/**
 * @author bochuan zhu
 */
public class Subject {
	// ��Ա����:ѧ�����ƣ�ѧ�Ʊ�ţ�ѧ��, ����ѡ�޵�ѧ������
	private String subjectName;
	private String subjectNo;
	private int subjectLife;
	private Student[] mystudents;
	private int studentNum;

	// �޲ι���
	public Subject() {

	}

	// ���ι��죬ʵ�ֶ����Ե�ȫ����ֵ
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
	 * ��ȡѡ��רҵ��Ϣ��δ��ʼ�����ʼ������Ϊ200
	 * 
	 * @return
	 */
	
	public Student[] getMystudents() { // �������ͳ�ʼ��
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

	// ��������
	public void setSubjectLife(int subjectLife) {
		if (subjectLife <= 0)
			return;
		this.subjectLife = subjectLife;
	}

	/**
	 * ��һ������
	 * 
	 * @return ��Ϣ
	 */
	public String info() {
		String str = "רҵ��Ϣ����:\nרҵ����:" + this.getSubjectName() + "\nרҵ���:" + this.getSubjectNo() + "\nרҵѧ������:"
				+ this.getSubjectLife();
		return str;
	}
	public void addStudnet(Student stu)
	{
		/**
		 * 1.��ѧ�����浽������
		 * 2.��ѧ���������浽studentNum��
		 */
		//1. ���浽������
		for(int i=0;i<this.getMystudents().length;i++)
		{
			if(this.getMystudents()[i]==null)
			{
				this.getMystudents()[i]=stu;
				this.studentNum=i+1;
				return;
			}
		}
		//2. �����浽studentNum��
		
	}
}

package user_homework_for_interface;

public class UserVO{
    private String ename; //���� �̸�
    private String dname; //�μ� �̸�
    private int sal;  //�޿�
    public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public int getLv() {
		return lv;
	}

	public void setLv(int lv) {
		this.lv = lv;
	}

	private int lv; //���� ����
    
    public UserVO(String ename, String dname, int sal){
        this.ename = ename;
        this.dname = dname;
        this.sal = sal;
    }
    //0. getter,setter �Լ��� �����Ͻÿ�. 
}
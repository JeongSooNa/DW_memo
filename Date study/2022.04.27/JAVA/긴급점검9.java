package test;

import java.util.ArrayList;
import java.util.List;

class MemberVO{
	private String memberNo;// 맴버 번호
	private int sal;		// 급여

	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public String getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(String memberNo) {
		this.memberNo = memberNo;
	}
}

class MemberCode{
	public static final double BONUS = 0.1;
}

class MemberService{
	public List<MemberVO> getMemberList(List<MemberVO> list){
		for(int i=0;i<list.size();i++) {
			int upSal = (int)(list.get(i).getSal()*(MemberCode.BONUS+1));
			if(list.get(i).getMemberNo().equals("200")) {
				list.get(i).setSal(upSal);
			}
		}
		return list;
	}
}

public class 긴급점검9 {
	public static void main(String[] args) {
		// member 번호 100, 200, 300 추가
		MemberService m = new MemberService();
		List<MemberVO> list = new ArrayList<MemberVO>();
		MemberVO m1 = new MemberVO();
		MemberVO m2 = new MemberVO();
		MemberVO m3 = new MemberVO();
		m1.setMemberNo("100");
		m1.setSal(100);
		m2.setMemberNo("200");
		m2.setSal(200);
		m3.setMemberNo("300");
		m3.setSal(300);
		list.add(m1);
		list.add(m2);
		list.add(m3);
		// member 번호가 200인 member 급여 10% 인상된 list return하는 로직 구현
		list = m.getMemberList(list);
		// member 100, 200, 300 번호, 급여 출력
		for(MemberVO vo : list) System.out.println("memberNo : "+vo.getMemberNo()+", sal : "+vo.getSal());
	}
}



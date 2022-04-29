package test;

import java.util.List;

public interface MemberServiceImpl {
	/**
	 * @param list
	 * @return List<MemberVO>
	 * @date : 2022. 4. 27.
	 * @author : njs
	 */
	public List<MemberVO> getMemberList(List<MemberVO> list);
	/**
	 * @param list
	 * @return String
	 * @date : 2022. 4. 27.
	 * @author : njs
	 */
	public String getMemberNo(List<MemberVO> list);
}

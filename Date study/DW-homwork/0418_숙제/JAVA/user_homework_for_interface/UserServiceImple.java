package user_homework_for_interface;

import java.util.List;

public interface UserServiceImple {
	/**
	 * @param list
	 * @param dname
	 * @return : List
	 * @date : 2022. 4. 20.
	 * @author : njs
	 */
	public List<UserVO> updateSal(List<UserVO> list, String dname);
	/**
	 * @param list
	 * @return : List
	 * @date : 2022. 4. 20.
	 * @author : njs
	 */
	public List<UserVO> updateLv(List<UserVO> list);
	/**
	 * @param list
	 * @param lv
	 * @return : List
	 * @date : 2022. 4. 20.
	 * @author : njs
	 */
	public List<UserVO> deleteUser(List<UserVO> list, int lv);
	/**
	 * @param list
	 * @param ename
	 * @return : UserVO
	 * @date : 2022. 4. 20.
	 * @author : njs
	 */
	public UserVO selectUserByEname(List<UserVO> list, String ename);
}

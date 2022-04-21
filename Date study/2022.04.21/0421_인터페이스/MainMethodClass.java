package shopping;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;


public class ShoppingService implements ShoppingServiceImpl{
	
	//2. 회원 중 앞글자에 S가 들어간 회원 정보 조회.
	@Override
	public List<UserVO> getFindByName(List<UserVO> list, String word) {
		// TODO Auto-generated method stub
		List<UserVO> result = new ArrayList<UserVO>();
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getUserName().startsWith(word)) {
				result.add(list.get(i));
			}
		}
		return result;
	}
	//3. 현재날짜 기준으로 90일동안 방문 없었던 회원 휴먼 계정으로 수정.
	@Override
	public List<UserVO> updateNotSleeperToSleeper(List<UserVO> list, int days) {
		// TODO Auto-generated method stub

		LocalDate now = LocalDate.now();
		Calendar cal1 = Calendar.getInstance();
		cal1.add(Calendar.DATE, -days); // 빼고 싶다면 음수 입력
		Date sleepDate = new Date(cal1.getTimeInMillis());
		
		for(int i=0;i<list.size();i++) {
			try {
				String str = list.get(i).getVisitAt();
				SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss",Locale.KOREA);
				Date date = format.parse(str);
				if(date.before(sleepDate)) {
					list.get(i).setSleeper(true);
				}
			} catch(Exception e){
				  System.out.println(e.getMessage());
			}
		}
		return list;
	}
	//4. 휴먼계정 인원 수 조회.
	@Override
	public int getSleeperUserCount(List<UserVO> list) {
		// TODO Auto-generated method stub
		int count = 0;
		for(UserVO vo : list) {
			if(vo.isSleeper()) count++;
		}
		return count;
	}
	//5. 휴먼계정이 아닌 회원에게 100포인트 추가 지급.
	@Override
	public List<UserVO> updatePoint(List<UserVO> list, int point) {
		// TODO Auto-generated method stub
		for(int i=0;i<list.size();i++) {
			int userPoint = list.get(i).getPoint();
			if(!list.get(i).isSleeper()) {
				list.get(i).setPoint(userPoint+point);
			}
		}
		return list;
	}
	//6. 포인트가 가장 높은 회원 조회.(단, 중복데이터는 없다고 가정)
	@Override
	public UserVO getPointRankerUser(List<UserVO> list) {
		// TODO Auto-generated method stub
		int maxPoint = 0;
		UserVO result = null;
		for(int i=0;i<list.size();i++) {
			int userPoint = list.get(i).getPoint();
			if(maxPoint < userPoint) maxPoint = userPoint; 
		}
		for(int i=0;i<list.size();i++) {
			int userPoint = list.get(i).getPoint();
			if(userPoint == maxPoint) result = list.get(i);
		}
		return result;
	}
	//7. 특정 회원에게 상품구매 발생. 구매한 상품의 가격 5%가 포인트로 지급. 
	@Override
	public List<UserVO> getPurchaseRankerUser(List<UserVO> list, ProductVO vo, int userNo) {
		// TODO Auto-generated method stub
		List<ProductVO> pro = new ArrayList<ProductVO>();
		// 이게 아닌데...
		int addPoint = (int)(vo.getPrice()*0.05);
		for(int i=0;i<list.size();i++) {
			int point = list.get(i).getPoint();
			if(list.get(i).getUserNo()==userNo) {
				list.get(i).setPoint(point+addPoint);
				pro.add(vo);
				list.get(i).setList(pro);
			}
		}
		return list;
	}

	//8. 구매이력이 있는 회원만 조회.
	@Override
	public List<UserVO> getUserList(List<UserVO> list) {
		// TODO Auto-generated method stub
		List<UserVO> result = new ArrayList<UserVO>();
		for(UserVO vo : list) {
//			if(vo.getList().size()>=1) result.add(vo);
		}
		return result;
	}
}

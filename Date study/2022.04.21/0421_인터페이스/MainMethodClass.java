package shopping;

import java.util.ArrayList;
import java.util.List;

public class MainMethodClass {
	
	
	public static void main(String[] args) {
		
		List<UserVO> userList = new ArrayList<UserVO>();
		userList.add(new UserVO(110,500,"BRIAN","2019-07-01 08:14:31"));
		userList.add(new UserVO(1000,500,"ALLEN","2020-03-01 14:30:31"));
		userList.add(new UserVO(120,800,"SANGWON","2021-05-11 18:20:31"));
		userList.add(new UserVO(130,1100,"KING","2022-04-21 09:10:31"));
		userList.add(new UserVO(140,300,"SMITH","2022-04-21 09:00:31"));
		userList.add(new UserVO(150,200,"SCOTT","2022-04-21 09:20:31"));
		userList.add(new UserVO(160,900,"WILLSON","2022-04-21 09:17:31"));
		userList.add(new UserVO(50,770,"SAM","2022-04-21 10:57:00"));
		
		
		
		
		ShoppingServiceImpl shop = new ShoppingService();
		
		// 모든 유저 조회
		System.out.println("***모든 유저 조회***");
		for(UserVO vo : userList) {
			System.out.println("사용자 번호 : "+vo.getUserNo()+" / 사용자 포인트 : "+vo.getPoint()+" / 사용자 이름 : "+vo.getUserName()+" / 최근 방문 날짜 : "+vo.getVisitAt()+" / 휴면계정 여부 : "+vo.isSleeper());
		}
		
		//1. 회원 중 포인트가 가장 많은 회원 정보 조회.(단, 중복데이터는 없다고 가정)
		System.out.println("***1. 회원 중 포인트가 가장 많은 회원 정보 조회.(단, 중복데이터는 없다고 가정)");
		UserVO maxPointUser = shop.getPointRankerUser(userList);
		System.out.println("사용자 번호 : "+maxPointUser.getUserNo()+" / 사용자 포인트 : "+maxPointUser.getPoint()+" / 사용자 이름 : "+maxPointUser.getUserName()+" / 최근 방문 날짜 : "+maxPointUser.getVisitAt()+" / 휴면계정 여부 : "+maxPointUser.isSleeper());
		
		//2. 회원 중 앞글자에 S가 들어간 회원 정보 조회.
		System.out.println("***2. 회원 중 앞글자에 S가 들어간 회원 정보 조회.");
		List<UserVO> findSUser = shop.getFindByName(userList, "S");
		shop.getFindByName(userList, "S");
		for(UserVO vo : findSUser) {
			System.out.println("사용자 번호 : "+vo.getUserNo()+" / 사용자 포인트 : "+vo.getPoint()+" / 사용자 이름 : "+vo.getUserName()+" / 최근 방문 날짜 : "+vo.getVisitAt()+" / 휴면계정 여부 : "+vo.isSleeper());
		}
		//3. 현재날짜 기준으로 90일동안 방문 없었던 회원 휴먼 계정으로 수정.
		System.out.println("***3. 현재날짜 기준으로 90일동안 방문 없었던 회원 휴먼 계정으로 수정.");
		shop.updateNotSleeperToSleeper(userList,90);
		for(UserVO vo : userList) {
			System.out.println("사용자 번호 : "+vo.getUserNo()+" / 사용자 포인트 : "+vo.getPoint()+" / 사용자 이름 : "+vo.getUserName()+" / 최근 방문 날짜 : "+vo.getVisitAt()+" / 휴면계정 여부 : "+vo.isSleeper());
		}
		//4. 휴먼계정 인원 수 조회.
		System.out.println("***4. 휴먼계정 인원 수 조회.");
		int count = shop.getSleeperUserCount(userList);
		System.out.println(count+"명");
		//5. 휴먼계정이 아닌 회원에게 100포인트 추가 지급.
		System.out.println("***5. 휴먼계정이 아닌 회원에게 100포인트 추가 지급.");
		shop.updatePoint(userList,100);
		for(UserVO vo : userList) {
			System.out.println("사용자 번호 : "+vo.getUserNo()+" / 사용자 포인트 : "+vo.getPoint()+" / 사용자 이름 : "+vo.getUserName()+" / 최근 방문 날짜 : "+vo.getVisitAt()+" / 휴면계정 여부 : "+vo.isSleeper());
		}
		//6. 포인트가 가장 높은 회원 조회.(단, 중복데이터는 없다고 가정)
		System.out.println("***6. 포인트가 가장 높은 회원 조회.(단, 중복데이터는 없다고 가정)");
		System.out.println("사용자 번호 : "+maxPointUser.getUserNo()+" / 사용자 포인트 : "+maxPointUser.getPoint()+" / 사용자 이름 : "+maxPointUser.getUserName()+" / 최근 방문 날짜 : "+maxPointUser.getVisitAt()+" / 휴면계정 여부 : "+maxPointUser.isSleeper());
		//7. 특정 회원에게 상품구매 발생.
	    //   구매한 상품의 가격 5%가 포인트로 지급.
		System.out.println("***7. 특정 회원에게 상품구매 발생.");
		ProductVO sales = new ProductVO();
		sales.setPrice(1000);
		sales.setProductName("김밥");
		shop.getPurchaseRankerUser(userList, sales, 50);
		for(UserVO vo : userList) {
			System.out.println("사용자 번호 : "+vo.getUserNo()+" / 사용자 포인트 : "+vo.getPoint()+" / 사용자 이름 : "+vo.getUserName()+" / 최근 방문 날짜 : "+vo.getVisitAt()+" / 휴면계정 여부 : "+vo.isSleeper());
		}
		//8. 구매이력이 있는 회원만 조회.
		System.out.println("***8. 구매이력이 있는 회원만 조회.");
		List<UserVO> isProductUser = shop.getUserList(userList);
		for(UserVO vo : isProductUser) {
			System.out.println("사용자 번호 : "+vo.getUserNo()+" / 사용자 포인트 : "+vo.getPoint()+" / 사용자 이름 : "+vo.getUserName()+" / 최근 방문 날짜 : "+vo.getVisitAt()+" / 휴면계정 여부 : "+vo.isSleeper());
		}
	}
}

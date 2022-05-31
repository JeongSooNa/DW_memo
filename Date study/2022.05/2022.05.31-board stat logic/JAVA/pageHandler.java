package 페이징;

public class PageHandler {
	
	public static void main(String[] args) {
		// 여신강림 페이징
		// 야옹이 작가는 210화 까지 연재함.
		
		// *** step 1. 페이지 수 알아내기 (총 카운트와 한페이지에 몇 개를 보여줄지가 중요.)
		int total = 219; // sql에서 count
		/* select count(*) from board */
		// 네이버 웹툰 기준으로 한 페이지에 10개의 게시물을 보여줄 수 있다.
		// 몇 개의 페이지가 나올까?
		int pages = 0;
		int pageSize = 10; // 1페이지에 보여줄 수 있는 게시물 수
		pages = total/pageSize;
		if(total%pageSize > 0) pages++;
		System.out.println("총 페이지 수 : "+pages);
		
		
		// *** step 2. 블록 알아내기
		int navigatePages = 10;
		int blocks = pages/navigatePages;
		if(pages/navigatePages > 0) blocks++;
		System.out.println("총 블록 수 : "+blocks); // 블록 수
		
		// *** step 3. 현재 블록 알아내기
		int pageNum = 13; // 현재 페이지
		int nowBlock = pageNum/navigatePages;
		if(pageNum%navigatePages > 0) nowBlock++;
		System.out.println("현재 페이지는 : "+pageNum);
		System.out.println("현재 블록 : "+nowBlock);
		
		// *** step 4. 마지막 블록 알아내기
		int lastBlock = 0;
		// total, navigatePages, pageSize 사용
		lastBlock = total / (navigatePages * pageSize);
		if(total % (navigatePages * pageSize) > 0) lastBlock++;
		System.out.println("마지막 블록 : "+lastBlock);
		
		// *** step 5. 현재 내가 위치한 블록의 처음 페이지와 마지막 페이지 구현
		// ex) 	1블록에 있으면 1~10
		//		2블록에 있으면 11~20
		//		3블록에 있으면 21~22 (여신강림 기준)
		int startPage = 0;
		int endPage = 0;
		startPage = (nowBlock-1)*navigatePages+1;
		endPage = nowBlock*navigatePages;
		if(nowBlock==lastBlock) endPage = pages;
		System.out.println("시작 페이지는 : "+startPage);
		System.out.println("마지막 페이지는 : "+endPage);
		
		// *** step 6. 이전버튼, 다음버튼 유무 판단
		boolean hasPreviousPage = true; // 이전 버튼
		boolean hasNextPage = true; // 다음 버튼
		if(lastBlock == 1) { // 블록이 1개이므로 이전, 다음 버튼 존재x
			hasPreviousPage = false;
			hasNextPage = false;
		}
		if(lastBlock > 1 && lastBlock == nowBlock) { // 마지막 블록이면 이전버튼만 존재
			hasPreviousPage = true;
			hasNextPage = false;
		}
		if(lastBlock > 1 && pageNum <= navigatePages) { // 첫번째 블록인데 블록이 1이상일 경우 다음 버튼 존재
			hasPreviousPage = false;
			hasNextPage = true;
		}
		System.out.println("이전 버튼이 있습니까? "+hasPreviousPage);
		System.out.println("다음 버튼이 있습니까? "+hasNextPage);
		
		// 위의 로직은 spring에서 method로 분리 및 구현
	}
}

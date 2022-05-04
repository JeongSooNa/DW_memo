package test;

import java.util.ArrayList;
import java.util.List;

class Singer{
	public String SingerName; //가수 이름
	public Singer() {
		
	}
	public Singer(String singerName) {
		this.SingerName = singerName;
	}
}


public class 긴급점검3 {
	
	public static List<Singer> getListSinger(){
		List<Singer> list = new ArrayList<Singer>();
		list.add(new Singer("김종국"));
		list.add(new Singer("서인국"));
		list.add(new Singer("방용국"));
		return list;
	}
	public static List<Singer> getListSinger(List<Singer> list){
		list.add(new Singer("김종국"));
		list.add(new Singer("서인국"));
		list.add(new Singer("방용국"));
		return list;
	}
	
	public static Singer getSinger(){
		return new Singer("김종국");
	}
	public static Singer getSinger(Singer s){
		s.SingerName = "김종국";
		return s;
	}
	
	public static void main(String[] args) {
		//1. getListSinger()이용해서 김종국, 서인국, 방용국 list 출력!
		for(Singer i : getListSinger()) {
			System.out.println(i.SingerName);
		}
		//2. getSinger()이용해서 김종국만 출력!
		System.out.println(getSinger().SingerName);
		
		//
		List<Singer> list = new ArrayList<Singer>();
		for(Singer i : getListSinger(list)) {
			System.out.println(i.SingerName);
		}
		//
		Singer s = new Singer();
		System.out.println(getSinger(s).SingerName);
	}
}

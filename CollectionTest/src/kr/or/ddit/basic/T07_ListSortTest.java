package kr.or.ddit.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class T07_ListSortTest {

	public static void main(String[] args) {
		List<Member> memlist = new ArrayList<>();
		memlist.add(new Member(1,"홍길동","010-1111-1111"));
		memlist.add(new Member(5,"변학도","010-2222-1111"));
		memlist.add(new Member(7,"성춘향","010-3333-1111"));
		memlist.add(new Member(3,"이순신","010-4444-1111"));
		memlist.add(new Member(9,"강감찬","010-5555-1111"));
		memlist.add(new Member(6,"일지매","010-6666-1111"));
		
		System.out.println("정렬 전");
		for(Member mem : memlist) {
			System.out.println(mem);
		}
		System.out.println("================================================");
		
		Collections.sort(memlist);
		System.out.println("이름 정렬 후");
		
		for(Member mem : memlist) {
			System.out.println(mem);
		}
		System.out.println("================================================");
		
		
		//외부 정렬 기준을 이용한 정렬하기
		Collections.sort(memlist, new SortNumDesc());
		System.out.println("번호로 정렬 후");
		
		for(Member mem : memlist) {
			System.out.println(mem);
		}
		System.out.println("================================================");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

class Member implements Comparable<Member>{

	private int num; //번호
	private String name; //이름
	private String tel; //전화번호
	
	
	public Member(int num, String name, String tel) {
		super();
		this.num = num;
		this.name = name;
		this.tel = tel;
	}


	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "Member [num=" + num + ", name=" + name + ", tel=" + tel + "]";
	}
	
	//이름을 기준으로 오름차순 정렬이 되도록 설정한다.
	@Override
	public int compareTo(Member mem) {
		
		
		return getName().compareTo(mem.getName());
	}		
}

   /*정렬 기준의 외부선언을 위해서 Comparator인터페이스를 구현하면 된다.
	Member의 번호(num)의 내림차순으로 정렬하기*/

class SortNumDesc implements Comparator<Member>{

	@Override
	public int compare(Member mem1, Member mem2) {
		/*if(mem1.getNum() > mem2.getNum()) {
			return -1;
		}
		else if(mem1.getNum() == mem2.getNum()){
			return 0;
		}
		else {
			return 1;
		}*/
		
		/*Wrapper 클래스에서 제공하는 메서드를 이용하는 방법1
		내림차순일 경우에는 -1을 곱해준다.
		return Integer.compare(mem1.getNum(), mem2.getNum()) * -1;*/
		
		/*Wrapper 클래스에서 제공하는 메서드를 이용하는 방법2
		내림차순일 경우에는 -1을 곱해준다.*/
		return new Integer(mem1.getNum()).compareTo(mem2.getNum()) * -1;
		
	}
}
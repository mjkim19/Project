package JavaAssignment;

import java.util.*;

public class Country extends Information implements Guide { // Information 클래스 상속, Guide 인터페이스 구현 (상속, 인터페이스)
	int k_pop;
	int drama;
	int food;
	
	Country(String name, int population, int k_pop, int drama, int food) {
		super.name = name;
		super.population = population;
		this.k_pop = k_pop;
		this.drama = drama;
		this.food = food;
	}
	
	public void printInfo() { // list를 활용하여 국가별 한류의 비중 출력 (컬렉션 프레임워크)
		List<String> list = new ArrayList<String>();
		
		list.add("k pop이 차지하는 비중: ");
		list.add("드라마가 차지하는 비중: ");
		list.add("음식이 차지하는 비중: ");
		System.out.println(list.get(0) + k_pop);
		System.out.println(list.get(1) + drama);
		System.out.println(list.get(2) + food);
	}
	
	public void start() {
		System.out.println("---------------------");
	}
	
	public void finish() {
		System.out.println("---------------------");
	}
}
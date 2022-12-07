package JavaAssignment;

import java.io.*;
import java.util.*;

public class HallyuMain {
	public static void ranking(int j) { // 한류 분야별 순위를 확인하는 함수. 배열에 분야의 이름을 저장한 후 순위를 벗어나는 값을 입력하면 catch문 실행 (배열, 예외처리)
		try {
			String[] i = {"k_pop", "drama", "food"}; 
			System.out.println(j + "위: " + i[j-1]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("순위에 맞는 값을 입력하세요!");
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader( // txt파일을 읽어온다. "한류 프로그램을 실행합니다" 출력. (파일 입출력)
				new FileReader("C:\\Users\\MJKIM\\Desktop\\programming\\java\\Program start.txt")
				);
		
		String str;
		while ((str = reader.readLine()) != null) {
			System.out.println(str);
		}
		
		reader.close();
		
		Country Japan = new Country("Japan", 12570, 40, 40, 20); // 국가별로 국가명, 인구 수, 각 한류 분야의 비중 저장
		Japan.start();
		Japan.printMyself();
		Japan.printInfo();
		Japan.finish();
		
		Country China = new Country("China", 140000, 45, 45, 10);
		China.start();
		China.printMyself();
		China.printInfo();
		China.finish();
		
		Country USA = new Country("USA", 33190, 50, 30, 20);
		USA.start();
		USA.printMyself();
		USA.printInfo();
		USA.finish();
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("한류 분야 순위확인: 확인하고 싶은 순위를 입력하세요");
		int j = s.nextInt();
		ranking(j);
		
		Field k = new Kpop(); // 부모 클래스(Field)의 참조 변수로 자식 클래스(Kpop, Drama, Food) 타입의 인스턴스 참조 (다형성)
		Field d = new Drama();
		Field f = new Food();
		
		HallyuMain h = new HallyuMain();
		h.printField(k); // 각각의 한류 분야에 맞는 문구 출력.
		h.printField(d);
		h.printField(f);
			
	}
	
	public void printField(Field field) {
		field.print();
	}
}

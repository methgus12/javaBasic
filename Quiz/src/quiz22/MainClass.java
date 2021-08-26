package quiz22;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MainClass {

	public static void main(String[] args) {
		
		/* 
		 * 1. BufferedReader를 이용해서 파일을 읽어들이세요. readLine()
		 * 2. , 기준으로 잘라서 Data클래스에 멤버변수에 한줄 단위로 저장
		 *     (Data클래스는 getter, setter를 갖는 은닉클래스)
		 * 
		 * 	   변수명: region, size, year, month, price
		 * 
		 * 3. List<Data>에 추가
		 * 4. 람다식을 이용해서 Null이 아닌 데이터, 지역:서울, (1분기)6월 이하의, 분양가격 4000이상만
		 *    뽑아서 새로운 리스트로 정리.
		 */
		//저장할 리스트 선언
		List<Data> list = new ArrayList<>();
		
		
		BufferedReader bf = null;
		String path = "C:\\Users\\user\\Desktop\\course\\java\\workspace\\Quiz\\src\\quiz22\\주택도시보증공사_전국 평균 분양가격(2020년 2월).csv";
		
		try {
			
			bf = new BufferedReader(new InputStreamReader( new FileInputStream(path), "EUC-KR"));
			bf.readLine();
			
			String str;
			while( (str = bf.readLine()) != null ) {
				System.out.println(str);
				String[] arr = str.split(",", 5);

				String region = arr[0];
				String size = arr[1];
				String year = arr[2];
				String month = arr[3];
				
				//특수문자제거
				arr[4] = arr[4].replace(",", "").replace(" ", "").replace("\"" , "").replace("-", "");
				String price;
				if(arr[4].equals("")) { //공백이라면 0저장
					price = "0";
				} else { //그대로 저장
					price = arr[4];
				}
				
				Data data = new Data(region, size, year, month, price);
				list.add(data); 
			}
			
			
			System.out.println("------------------------------------------------------");
			//람다식(지역:서울, (1분기)6월 이하의, 분양가격 4000이상만)
			List<Data> newList = list.stream()
				.filter( (data) -> data.getRegion().equals("서울")) //지역 서울
				.filter( (data) -> Integer.parseInt(data.getMonth() ) <= 6  ) //6월 이하
				.filter( (data) -> Integer.parseInt(data.getPrice() ) >= 4000  )
				.collect( Collectors.toList() ); //리스트로 생성
				
			newList.forEach( (data) -> System.out.println(data.toString())  );

			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bf.close();
			} catch (Exception e2) {
				
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

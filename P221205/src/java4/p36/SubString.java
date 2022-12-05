package java4.p36;

public class SubString {

	public static void main(String[] args) {
		String ssn = "870913-1234567";

		String firstNum = ssn.substring(0, 6); // 0번 인덱스 부터 6개 추출 -- 0,1,2,3,4,5 인덱스
		String secondNum = ssn.substring(7); // 7번 인덱스부터 추출

		System.out.println("firstNum : " + firstNum);
		System.out.println("secondNum : " + secondNum);
	}

}

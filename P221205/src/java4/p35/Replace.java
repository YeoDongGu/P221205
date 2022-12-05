package java4.p35;

public class Replace {

	public static void main(String[] args) {
		String oldStr = "Java 의 가장 큰 특징은 플랫폼에 독립적이라는 것입니다.\n" + "소스코드를 기계어로 컴파일하여 링크하는 C/C++은, 아주 빠르다는 강한 장점이 있지만,\n"
				+ "리눅스 등 다른 실행 환경을 가진 시스템에 프로그램을 옮겨 실행할 수 없다는\n" + " '이식성이 낮다' 라는 단점도 존재하죠. Java 는 이와 다르게 바이트코드인 \n"
				+ " 클래스파일(.class)을 생성하고, 이 파일을 일종의 에물레이터인 Java 가상 머신(JVM)이\n"
				+ " 해석해서 실행합니다. 이 특성으로 인해 Java는 태생적인 강한 장점과\n" + " 심각한 약점을 모두 가지게 되었죠.\r\n";

		System.out.println("oldStr : " + oldStr);

		String newStr = oldStr.replace("Java", "자바");

		System.out.println("newStr : " + newStr);

		newStr = newStr.replace(".", "?");

		System.out.println("newStr : " + newStr);

	}

}

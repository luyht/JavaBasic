package day2;

public class EightTest {

	public static boolean hasEight(int number) {
		boolean result = true;
		//Convert a int number to string
		String numberStr = String.valueOf(number);
		//Duyệt qua từng kí tự trong String
		for (int i =0; i <numberStr.length(); i++) {
			//So sánh từng ký tự trong String, nếu chứa kí tự 8 thì gán result = true, thoát khỏi vòng lặp
			if (numberStr.charAt(i)=='8') {
				//result = true;
				return result;
			} else {
				result = false;
			}
		}
		
		return result;
	}
}

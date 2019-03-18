package main;

public class Application {
	public static void main(String[] args) {
		Application app = new Application();
		String bin = app.convertBin(40000);
		System.out.println(bin);
		int i = app.paserIntBin(bin);
		System.out.println(i);
	}

	public String convertBin(int number) {
		StringBuilder bin = new StringBuilder();
		char[] binArr = {};
		for (; number != 0; number = number / 2) {
			bin.append(number % 2);
		}
		binArr = bin.toString().toCharArray();
		bin.delete(0,bin.length());
		for (int i = binArr.length - 1; i >= 0; i--) {
			bin.append(binArr[i]);
		}
		return bin.toString();
	}

	public int paserIntBin(String bin) {
		char[] num = bin.trim().toCharArray();
		int count = num.length - 1;
		int number = 0;
		for (int i = 0; i < num.length; i++) { // 长度4 i = 0;count = 4
			number += Integer.parseInt(String.valueOf(num[i])) * Math.pow(2, count);//
			count = count - 1;
			if (count < 0)
				break;
		}
		return number;
	}
}

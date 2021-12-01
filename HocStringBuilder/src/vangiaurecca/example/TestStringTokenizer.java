package vangiaurecca.example;

import java.util.StringTokenizer;

public class TestStringTokenizer {
	public static void main(String[] args) {
		String str = "Kevin De Bruyne";
		StringTokenizer st = new StringTokenizer(str);
		while(st.hasMoreTokens()){
			String value = st.nextToken();
			System.out.println(value);
		}
		System.out.println("------------------------");
		StringTokenizer st2 = new StringTokenizer(str, "n"); //tách theo chữ n
		while(st2.hasMoreTokens()){
			System.out.println(st2.nextToken());
		}

	}

}

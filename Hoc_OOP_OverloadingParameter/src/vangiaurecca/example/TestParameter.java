package vangiaurecca.example;

public class TestParameter {
	public static int sum(int ...arr){
		int s = 0;
		for(int i = 0; i<arr.length; i++){
			s+=arr[i];
		}
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s= sum(1, 5, 9);
		System.out.println(s);
		int s2= sum(7, 8, 9, 10, 11);
		System.out.println(s2);
		int s3= sum(9, 10);
		System.out.println(s3);
	}

}

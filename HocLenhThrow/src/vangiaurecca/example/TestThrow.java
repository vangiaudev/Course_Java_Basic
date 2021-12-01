package vangiaurecca.example;

public class TestThrow {

	public static void GiaiPTB1(int a, int b) throws Exception{
		try 
		{
			System.out.println("x = " + (-b/a));
		} catch (Exception e) {
			throw e;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
			GiaiPTB1(0, 5);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

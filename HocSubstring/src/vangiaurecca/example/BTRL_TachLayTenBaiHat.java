package vangiaurecca.example;

public class BTRL_TachLayTenBaiHat {

	public static String tenBaiHatMp3(String bh){
		int pos_end = bh.lastIndexOf("/");
		String ten = bh.substring(pos_end+1);
		return ten;
	}
	public static String tenBaiHatKhongMp3(String bh){
		int pos_end1 = bh.lastIndexOf("/");
		int pos_end2 = bh.lastIndexOf(".");
		String ten = bh.substring(pos_end1 + 1, pos_end2);
		return ten;
	}
	public static void BaiTapGiaiThuat(String s, String p){
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String baihat = "D:/music/bolero/TinhCha.mp3";
		String kq = tenBaiHatMp3(baihat);
		System.out.println(kq);
		String kq2 = tenBaiHatKhongMp3(baihat);
		System.out.println(kq2);

	}

}

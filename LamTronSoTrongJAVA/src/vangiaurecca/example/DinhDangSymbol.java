package vangiaurecca.example;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class DinhDangSymbol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 1121293939;
		DecimalFormat dcf = new DecimalFormat("#,###");
		DecimalFormatSymbols dcfs = 
				new DecimalFormatSymbols(Locale.getDefault());
		dcfs.setGroupingSeparator(',');
		dcf.setDecimalFormatSymbols(dcfs);
		
		System.out.println(dcf.format(x));
	}

}

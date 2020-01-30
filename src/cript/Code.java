package cript;

public class Code {
	
	private String valueForCode;

	public Code(String valueForCode) {
		this.valueForCode = valueForCode;
	}

	public String getValueForCode() {
		return valueForCode;
	}


	public String transformForCode() {
		String s1 = valueForCode.substring(0, 1);
		String s2 = valueForCode.substring(1, 2);
		String s3 = valueForCode.substring(2, 3);
		String s4 = valueForCode.substring(3);
		
		int n1  = Integer.parseInt(s1);
		int n2  = Integer.parseInt(s2);
		int n3  = Integer.parseInt(s3);
		int n4  = Integer.parseInt(s4);
		
		int c1 = n1 + 7;
		int c2 = n2 + 7;
		int c3 = n3 + 7;
		int c4 = n4 + 7;
		
		int d1 = c1 % 10;
		int d2 = c2 % 10;
		int d3 = c3 % 10;
		int d4 = c4 % 10;
		
		String code = Integer.toString(d3);
		String code1 = Integer.toString(d4);
		String code2 = Integer.toString(d1);
		String code3 = Integer.toString(d2);
		return "" + code + "" + code1 + "" + code2 + "" + code3;
	}
	
	

}

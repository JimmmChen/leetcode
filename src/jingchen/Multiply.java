package jingchen;

public class Multiply {
	 public String multiply(String num1, String num2) {    
		    String longnum = num1.length() > num2.length() ? num1 : num2;
		    String shortnum = num1.length() > num2.length() ? num2 : num1;
		    StringBuffer shortstr = new StringBuffer(shortnum);
		    shortstr.reverse();
		    String result = "0";
		    for(int i = 0; i < shortnum.length();i++){
		      String temp = "0";  
		      for(int j = 0;j < Integer.parseInt(shortstr.charAt(i)+"");j++)
		        temp = add(temp,longnum);
		      StringBuffer sb = new StringBuffer(temp);
		      for(int j = 0;j < i;j++)
		        sb.append(0);
		      result = add(result,sb.toString());
		    }
		    return result;
		  }
		  
		  private String add(String num1, String num2){
		    StringBuffer sb1 = new StringBuffer(num1);
		    StringBuffer sb2 = new StringBuffer(num2);
		    sb1.reverse();
		    sb2.reverse();
		    int max = sb1.length() > sb2.length() ? sb1.length() : sb2.length();
		    for(int i = sb1.length();i < max;i++)
		      sb1.append(0);  
		    for(int i = sb2.length();i < max;i++)
		      sb2.append(0);  
		    StringBuffer result = new StringBuffer();
		    int carry = 0;
		    for(int i = 0;i < max;i++){
		      int sum = (sb1.charAt(i)-'0') + (sb2.charAt(i)-'0');
		      sum += carry;
		      carry = sum >= 10 ? 1 : 0;
		      result.append(sum % 10);
		    }
		    if(carry == 1)
		      result.append(1);
		    return result.reverse().toString();
		  }
}

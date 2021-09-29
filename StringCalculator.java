package stringcalculator;

import java.util.Scanner;

public class StringCalculator {

	public static int add(String numbers) throws Exception{
		int n;
		int sum=0;
	
		
	
		if(numbers.equals("")){
			return 0;
		}
		else{
		String []s= numbers.split(",");
		
		for(int i=0;i<s.length;i++){
			n=Integer.parseInt(s[i]);
			if(n<0){
				throw new Exception("Negative is not allowed");
			}
			sum+=n;
		}
		
		}
		return sum;
	}
	
	public static void main(String[] args) throws Exception {
		String num="";
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two number with separtion by comma , ");
		System.out.println("for exaple \"1,2\" ");
		 num=sc.next();
		 
		sum= add(num);
		
		System.out.println("the resulting sum is = "+sum);
		
		
		
		

	}

}

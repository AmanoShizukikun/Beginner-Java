import java.util.*;
//input a=1 b=2 c=8 output a=4 b=5 c=6

public class dateand_2 {
	public static void main(String[] args){
		int a=1;int b=2;int c=8;	
			//start
			a = (++a) + (b++);
			// a = (2) + (2) = 4     a=4,b=3,c=8
			b = (c--) - (b--);
			// b = (8) - (3) = 5     a=4,b=5,c=7
			c = (--c);
			// c = (6)               a=4,b=5,c=6
			
			sop("a="+a+" b="+b+" c="+c);
	}    
		static void sop(Object o){
			System.out.print(o);
		}
}
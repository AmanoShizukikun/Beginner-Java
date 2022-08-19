import java.util.*;
public class number {
        public static void split(long n){
        	if (n >= 10000000) {
        		split(n / 10000000);
        		System.out.print(" kuti");
        		n %= 10000000;
    		}
    		if (n >= 100000) {
        		split(n / 100000);
        		System.out.print(" lakh");
        		n %= 100000;
    		}
    		if (n >= 1000) {
        		split(n / 1000);
        		System.out.print(" hajar");
        		n %= 1000;
    		}
    		if (n >= 100) {
        		split(n / 100);
        		System.out.print(" shata");
        		n %= 100;
    		}
    		if (n>0)
        		System.out.print(" "+n);
			}
        

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=1;
        
        while(sc.hasNext()){
        	System.out.printf("%4d.",count);
        	long n = sc.nextInt();
        	
        	if(n==0){
        		System.out.print(" 0");
        	}else{
        		split(n);
        	}
        	count++;
        	System.out.println("");
        }
    }
}

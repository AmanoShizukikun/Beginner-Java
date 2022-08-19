import java.util.*;
//    
//       /＼ 　　　 ∠＿/
//      /　│　　 ／　／
//     │　 / ＿,＜　／　　 /|\
//     │　　　　　 }) 　 ///\\\　　
//     (　　　　　`　}　　\\//
//     (●　﹑　●　　 )〈   / /
//     ()　 ㄟ　　　　|  ㄑ〈
//     >ㄐ ﹑_　ㄔ　 │   ／／
//     / /　　 /　)＜| ＼＼
//     (_/　　(_／　 │／／
//     ㄥ　　　　　　　|／
//     ＞─ㄩ￣￣`\─＿ㄎ

public class dateand_1 {
        
    public static void main(String[] args) {
    	Scanner date = new Scanner ( System.in );
    	int year = date.nextInt();
    	int mounth = date.nextInt();
    	int day = date.nextInt();
    	int total = (year-1)*365 + (year-1)/4 - (year-1)/100 + (year-1)/400 ;
    	System.out.print("中華民國"+(year-1911)+"年"+mounth+"月"+day+"日 ");
    	switch( mounth-1 ){
    		case 1 : total += 31 ;
    		case 2 : total += (year%400 == 0) | ( (year%4 == 0)&(year%100 != 0)) ? 29 : 28 ;
    		case 3 : total += 31 ;
    		case 4 : total += 30 ;
    		case 5 : total += 31 ;
    		case 6 : total += 30 ;
    		case 7 : total += 31 ;
    		case 8 : total += 31 ;
    		case 9 : total += 30 ;
    		case 10 : total += 31 ;
    		case 11 : total += 30 ;   		
    	}
    	total += day ;    	
    	switch( total%7 ){
    		case 0 : System.out.print("星期日");break;
    		case 1 : System.out.print("星期一");break;
    		case 2 : System.out.print("星期二");break;
    		case 3 : System.out.print("星期三");break;
    		case 4 : System.out.print("星期四");break;
    		case 5 : System.out.print("星期五");break;
    		case 6 : System.out.print("星期六");break;
    	}
        
    }
}

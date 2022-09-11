//switch語法
import java.util.Scanner;

public class switch_case {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int day= sc.nextInt();
		if(day == 1){
			System.out.println("星期一");
		}else if(day == 2){
			System.out.println("星期二");
		}else if(day == 3){
			System.out.println("星期三");
		}else if(day == 4){
			System.out.println("星期四");
		}else if(day == 5){
			System.out.println("星期五");
		}else if(day == 6){
			System.out.println("星期六");
		}

		System.out.println("_____________________________________________________________________"); //分割線一;
		//你會發現用if寫一堆的狀況很麻煩，且對電腦檢查程式的時候很站用資源，所以我們可以用switch來簡化程式
		//switch簡化
		switch(day){
			case 1:System.out.println("星期一");
			case 2:System.out.println("星期二");
			case 3:System.out.println("星期三");
			case 4:System.out.println("星期四");
			case 5:System.out.println("星期五");
			case 6:System.out.println("星期六");
		}

		System.out.println("_____________________________________________________________________"); //分割線二;
		//你會發現switch會將輸入數字以後的所有數字都輸出假設輸入4 -> switch會執行case 4 case 5 case 4
		//那該怎麼辦呢?用break跳出switch就行了
		switch(day){
			case 1:System.out.println("星期一");break;
			case 2:System.out.println("星期二");break;
			case 3:System.out.println("星期三");break;
			case 4:System.out.println("星期四");break;
			case 5:System.out.println("星期五");break;
			case 6:System.out.println("星期六");break;
		}
    }
}

//猜數字遊戲
//1.數字範圍0~99
//2.每一次都會給大一點或小一點的提示
//3.猜錯三次就輸了
//4.要用到while迴圈
import java.util.Scanner;

public class guessing_game {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int secret_num = (int)(Math.random()*100);  //0~99
        int guess = 100;
        int guess_count = 0;
        int guess_limit = 3;
        boolean out_of_limit = false;

        while(secret_num != guess && !out_of_limit){
            guess_count += 1;
            if (guess_count <= guess_limit){
                System.out.println("請輸入數字: ");
                guess = sc.nextInt();
                if (guess > secret_num){
                    System.out.println("小一點");
                }else if (guess < secret_num){
                    System.out.println("大一點");
                }
            }else{
                out_of_limit = true;
            }
        }
        if (out_of_limit){
            System.out.println("你輸了");
        }else{
            System.out.println("你贏了");
        }
    }
}

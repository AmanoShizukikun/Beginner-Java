//讀取輸入
import java.util.Scanner;

public class scanner {
    public static void main(String[] args){
        //1.使用者輸入字串
        Scanner sc = new Scanner(System.in);   //建立一個Scanner Scanner名稱為sc
        String word = sc.next();   //建立一個字串 word word的內容是sc偵測到的下一次輸入(遇到空白鍵和enter就中斷)
        System.out.print(word);   //假設輸入 : hello java 因為遇到空白鍵所以輸出為 : hello

        //2.解決輸入字串遇到空格就中斷
        word = sc.nextLine();   //為了解決輸入句子時被中斷所以打nextLine()
        System.out.print(word);

        //3.輸入整數
        Scanner num = new Scanner(System.in);
        int num1 = num.nextInt();
        System.out.print(num1);

        //4.輸入小數
        float num2 = num.nextInt();
        System.out.print(num2);
    }
}

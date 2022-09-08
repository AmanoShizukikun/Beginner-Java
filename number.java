//基本資料型態二:數字
public class number {
    public static void main(String[] args){
        //1.基本數字
        System.out.println(92);
        System.out.println(-1.14);

        //2.加減乘除
        System.out.println(9+2);
        System.out.println(1-14);
        System.out.println(4*8);
        System.out.println(6/9);  //輸出為0 ，因為6與9皆為整數java會認為答案也是整數，所以就只取整數

        //3.解決上面的除法錯誤
        System.out.println((float)6/(float)9);

        //4.Java有先乘除後加減也可以用括號優先加減
        System.out.println(4+8+6*9);
        System.out.println(4+(8+6)*9);

        //5.變數用法
        //整數變數
        int num1 = 8;   //設定一個整數物件int 物件名稱為num1 存放8
        System.out.println(num1);
        //小數變數
        float num2 = 6.9f;   //設定一個浮點物件float 物件名稱為num2 存放6.9  要打f表明是小數
        System.out.println(num2);

        //6.取餘數 : %
        int num3 = 8;
        System.out.println(num3%5);

        System.out.println("_____________________________________________________________________"); //分割線一;
        //Java數字
        int num4 = 1;
        num4 = num4 + 1;
        System.out.println(num4);

        System.out.println("_____________________________________________________________________"); //分割線一;
        //Java延伸用法
        //1.輸出後+1
        System.out.println("輸出後+1");
        num4 = 1;
        System.out.println(num4++); //1
        System.out.println(num4);   //2

        //2.輸出前+1
        System.out.println("輸出前+1");
        num4 = 1;
        System.out.println(++num4); //2
        System.out.println(num4);   //2

        //3.輸出後-1
        System.out.println("輸出後-1");
        num4 = 1;
        System.out.println(num4--); //1
        System.out.println(num4);   //0

        //4.輸出前-1
        System.out.println("輸出前-1");
        num4 = 1;
        System.out.println(--num4); //0
        System.out.println(num4);   //0
        
    }
}

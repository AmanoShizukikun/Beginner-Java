//if判斷句
public class if_statements {
    public static void main(String[] args){
        //第一種情況:如果A就a
        //如果肚子餓就去吃飯
        boolean hungry = true;
        if (hungry){
            System.out.println("吃飯");
        }

        //第二種情況:如果A就a，否則B就b
        //#如果肚子餓就去吃飯，否則就不吃
        hungry = false;
        if (hungry){
            System.out.println("吃飯");
        }else{
            System.out.println("不吃");
        }

        //第三種情況:如果A就a，或是如果B就b，否則C就c
        //如果你考100分就給獎勵，或是如果你考60分以上就不懲罰，否則就懲罰
        int score = 90;
        if(score == 100){
            System.out.println("給獎勵");
        }else if(score >= 60){
            System.out.println("不懲罰");
        }else{
            System.out.println("懲罰");
        }

        //第四種情況:如果A「且」B就ab，否則C就c
        //如果你考100分「且」我心情好就給獎勵，否則就懲罰
        score = 90;
        boolean happy = true;
        if(score == 100 && happy){   //Java的and是 : &&
            System.out.println("給獎勵");
        }else{
            System.out.println("懲罰");
        }

        //第五種情況:如果A「或」B就ab，否則C就c
        //如果你考100分「或」我心情好就給獎勵，否則就懲罰
        score = 90;
        happy = true;
        if(score == 100 || happy){   //Java的or是 : ||
            System.out.println("給獎勵");
        }else{
            System.out.println("懲罰");
        }

        //第六種情況:如果A「或沒有」B就ab，否則C就c
        //如果你考100分「或沒有」生氣就給獎勵，否則就懲罰
        score = 90;
        boolean angry = true;
        if(score == 100 || !angry){   //Java or not -> or(||) + not(!)
            System.out.println("給獎勵");
        }else{
            System.out.println("懲罰");
        }

        //第七種情況:如果沒有A「或沒有」B就ab，否則C就c
        //如果沒有考100分「或沒有」生氣就懲罰，否則就給獎勵
        score = 90;
        angry = false;
        if(score != 100 || !angry){   //Java or not -> or(||) + not(!)
            System.out.println("懲罰");
        }else{
            System.out.println("給獎勵");

            System.out.println("_____________________________________________________________________"); //分割線一;
        }
    }
}

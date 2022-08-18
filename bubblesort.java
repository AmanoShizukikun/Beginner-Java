import java.util.*;

public class bubblesort {

    public static void main(String[] args) {
    	Scanner time = new Scanner(System.in);
    	System.out.println("請輸入排序方式(小到大請輸入1、大到小請輸入0)：");
    	int s = time.nextInt();
    	if( s == 1 ){
    	System.out.println("請輸入陣列數量：");
    	int arraylength = time.nextInt();
    	int arr[] =new int[arraylength];
    	System.out.println("請輸入陣列內數字：");
    	for(int i = 0; i < arr.length; i++){
            arr[i] = time.nextInt();
        }           
           System.out.println("原來的次序");  
          	for(int i=0; i < arr.length; i++){  
            	System.out.print(arr[i] + " ");  
                }
                System.out.println("");  
                System.out.println("");
                System.out.println("次序排列步驟");
        int n = arr.length;  
        int temp = 0;
        for(int i=0; i < arr.length; i++){  
        						System.out.print(arr[i] + " ");   
       								}
       							System.out.println();    
        	for(int x=0; x < n; x++){  
            	for(int j=1; j < (n-x); j++){    
                	if(arr[j-1] > arr[j]){                 		
                    	temp = arr[j-1];  
                        arr[j-1] = arr[j];  
                        arr[j] = temp;
                        	for(int i=0; i < arr.length; i++){  
        						System.out.print(arr[i] + " ");   
       								}
       							System.out.println();  
                         	}                   
                 		}    
         			}
        System.out.println();
        System.out.println("使用泡沫排序後");  
        	for(int i=0; i < arr.length; i++){  
        		System.out.print(arr[i] + " ");  
       		}  
    	}else if (s == 0){
    		    	System.out.println("請輸入陣列數量：");
    	int arraylength = time.nextInt();
    	int arr[] =new int[arraylength];
    	System.out.println("請輸入陣列內數字：");
    	for(int i = 0; i < arr.length; i++){
            arr[i] = time.nextInt();
        }           
           System.out.println("原來的次序");  
          	for(int i=0; i < arr.length; i++){  
            	System.out.print(arr[i] + " ");  
                }
                System.out.println("");  
                System.out.println("");
                System.out.println("次序排列步驟");
        int n = arr.length;  
        int temp = 0;  
        	for(int i=0; i < arr.length; i++){  
            	System.out.print(arr[i] + " ");  
                }
                System.out.println("");
        	for(int x=0; x < n; x++){  
            	for(int j=1; j < (n-x); j++){    
                	if(arr[j-1] < arr[j]){                 		
                    	temp = arr[j-1];  
                        arr[j-1] = arr[j];  
                        arr[j] = temp;
                        	for(int i=0; i < arr.length; i++){  
        						System.out.print(arr[i] + " ");   
       								}
       							System.out.println();  
                         	}                   
                 		}    
         			}
        System.out.println();
        System.out.println("使用泡沫排序後");  
        	for(int i=0; i < arr.length; i++){  
        		System.out.print(arr[i] + " ");  
       		}  
    	}else{
    		System.out.println("輸入錯誤中斷程式");
    	}
	}
}

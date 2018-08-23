package algorithm;

import java.util.Random;
import java.util.Scanner;

public class gugudan {
    
    


    public static void main(String[] args) {
        boolean success = true;
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        
        System.out.println("구구단을 시작합니다.");
        
        do
        {
            int first = rd.nextInt(9) + 1;
            int second = rd.nextInt(9) + 1;
            
            System.out.print(first + " X " + second + " = ");
            
           
            int answer = sc.nextInt();
            
            if(answer == (first*second)) {
                System.out.println("정답입니다! 그만하시려면 숫자  0버튼을 눌러주세요");
            } else {
                System.out.println("틀렸습니다ㅠ 그만하시려면 숫자 0버튼을 눌러주세요");
            }
            
               if( answer == 0 ) {
                   success = false;
               }
            
        }while(success);
        
        
        
        
        
    }

}

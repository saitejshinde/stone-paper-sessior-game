import java.util.Random;

import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
class sessiorgame{
    public static void main(String[]args)
    {
        System.out.println("Enter your choice :\n 1.paper\n 2.sessior\n 3.stone ");
        int c=3;
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        Random ra= new Random();
        int b=ra.nextInt(c);
        System.out.println(b);
        
        if(a==b){
            System.out.println("Match draw");
        }
        else if (a==1&&b==2){                                          //(1,2) 
            System.out.println("Sorry! Computer is a Winner");
        }
        else if(a==2&&b==1){                                          //(2,1)
            System.out.println("Congratulations! You are the Winner");
        }
        else if(a==1&&b==3){                                          //(1,3)
            System.out.println("Congratulations! You are the Winner");
        }
        else if(a==2&&b==3){                                           //(2,3)
            System.out.println("Sorry! Computer is a Winner ");
        }
        else if(a==3&&b==2){                                          //(3,2)
            System.out.println("Congratulations! You are the Winner");
        }
        else if(a==3&&b==1){                                          //(3,1)
            System.out.println("Sorry! Computer is a Winner");
        }
        else
        {
            System.out.println("Enter the correct choice");
        }
    }
    
}
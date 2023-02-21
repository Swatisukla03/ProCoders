package daz1;

import java.util.Scanner;

public class fact_num {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int tf=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                tf++;


            }
        }


        if(tf==2){
            System.out.println("prime");
        }

        else{
            System.out.println("not prime");
        }
    }
    
}

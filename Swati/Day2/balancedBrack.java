package Day2;

import java.util.Scanner;
import java.util.Stack;

public class balancedBrack {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String exp=sc.nextLine();
        boolean isBal=balanced(exp);
        System.out.println(isBal);
    }



    public static boolean balanced(String exp){
        Stack<Character>st=new Stack<>();


        for(int i=0;i<exp.length();i++){
            char ch=exp.charAt(i);



            if(ch=='(' || ch=='{' ||ch=='['){
                st.push(ch);
            }

            else if(ch==')' || ch=='}' ||ch==']'){
                if(st.size()==0){
                    return false;
                }
                char cop=corrDB(ch);

                if(st.peek()!=cop){
                    return false;
                }

                st.pop();
            }
        }



        if(st.size()>0){
            return false;
        }
        else{
            return true;
        }
    }


    public static char corrDB(char cb){
        if(cb==')'){
            return '(';
        }


        else if(cb=='}'){
            return '{';
        }
        else{
            return '[';
        }
    }
    
}

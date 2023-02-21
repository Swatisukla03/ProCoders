import java.util.Scanner;
import java.util.Stack;

public class DuplicateBracket {



    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        boolean isDB=duplicateBrackets(str);
        System.out.println(isDB);
        
    }
    public static boolean duplicateBrackets(String str){

        Stack<Character>st=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='('){
                st.push(ch);
            }

            else if(ch==')'){
                int pc=0;


                while(st.peek()!='('){
                    pc++;
                    st.pop();
                }
                st.pop();

                if(pc==0){
                    return true;
                }
            }

            else if(ch!=' '){
                st.push(ch);
            }
        }
        return false;
    }
    
}

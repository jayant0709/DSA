import java.util.Stack;

public class Evaluate_Reverse_Polish_Notation {
    static public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        int n=tokens.length;
        for(int i=0;i<n;i++){
            int a,b;
            if(tokens[i].equals("+")){
                a=st.pop();
                b=st.pop();
                st.push(a+b);
            }
            else if(tokens[i].equals("-")){
                a=st.pop();
                b=st.pop();
                st.push(b-a);
            }
            else if(tokens[i].equals("*")){
                a=st.pop();
                b=st.pop();
                st.push(a*b);
            }
            else if(tokens[i].equals("/")){
                a=st.pop();
                b=st.pop();
                st.push(b/a);
            }
            else{
                st.push(Integer.valueOf(tokens[i]));
            }
        }
        return st.peek();
    }

    public static void main(String[] args) {
        String[] tokens={"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        int sol=evalRPN(tokens);
        System.out.println(sol);
    }
}
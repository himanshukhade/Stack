
import java.util.Stack;
public class BasicOfStack{
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        //push opearation (add value in stack)
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        st.push(54);

        //print stack element 
        System.out.println(st);

        //peek element(top  element of stack)
        System.out.println(st.peek());

        //pop element(remove top element of stack)
        System.out.println(st.pop());

        //to check size of stack
        System.out.println(st.size());

        //isEmpty (give boolean value true/false)
        System.out.println(st.isEmpty());
    }
}
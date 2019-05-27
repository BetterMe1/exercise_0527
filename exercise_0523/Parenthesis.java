package exercise.exercise_0523;

import java.util.*;
/*
括号配对
 */
public class Parenthesis {
    public boolean chkParenthesis(String A, int n) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<n; i++){
            char a = A.charAt(i);
            if(a == '('){
                stack.push(a);
            }else if(a == ')'){
                if(stack.empty()){
                    return false;
                }else if(stack.peek() == '('){
                    stack.pop();
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }
        return stack.empty();
    }
}
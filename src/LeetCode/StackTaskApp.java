package LeetCode;

import java.util.Stack;

public class StackTaskApp {

    public static void main(String[] args) {

        String target="({})";
        System.out.println(clean(target));
    }


    public static boolean clean(String s){
        Stack<Character> stack = new Stack<>();

        for(char c:s.toCharArray()){

            if(c=='(' || c=='{' || c=='['){
                stack.push(c);
            }
            else{
                if(stack.isEmpty())return false;

                char pop = stack.pop();

              if(pop=='(' && c!=')'){
                  return false;
              }
              if(pop=='{' && c!='}'){
                  return false;
              }
              if(pop=='[' && c!=']'){
                  return false;
              }

            }

        }
        return stack.isEmpty();
    }
}

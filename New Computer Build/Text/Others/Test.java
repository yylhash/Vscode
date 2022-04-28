package Others;

import java.util.Stack;

public class Test {

    public boolean isValid(String str) {
        Stack<Character> left = new Stack<>();

        for(char c :str.toCharArray()){
            if (c == '(' || c == '{' || c == '['){ //如果是左括号就入栈
                left.push(c);
            } else { // 如果是右括号
                //首先判断栈是否为空
                if(left.empty()){
                    return false;
                } else if (left.peek() == leftOf(c)){
                    left.pop();
                } else {
                    return false;
                }
            }
        }
        return left.empty();
    }

    char leftOf(char c) {
        if (c == '}') return '{';
        if (c == ')') return '(';
        return '[';
    }

    public static void main(String[] args) {
        String strs ="()";
        Test test = new Test();
        System.out.println(test.isValid(strs));
    }
}

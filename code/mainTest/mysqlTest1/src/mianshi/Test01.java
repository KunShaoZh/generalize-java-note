package mianshi;

import java.util.Stack;

public class Test01 {
    public static void main(String[] args) {
        String num1 = "123";
        String num2 = "456";
        String s = addNum(num1, num2);
        System.out.println(s);

    }

    /**
     * 不使用包装类计算字符串数值
     */
    public static String addNum(String num1, String num2) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        // 将字符串的每一位字符转换为数字，并压入栈中
        for (int i = num1.length() - 1; i >= 0; i--) {
            System.out.println(Character.getNumericValue(num1.charAt(i)));
            stack1.push(Character.getNumericValue(num1.charAt(i)));
        }
        for (int i = num2.length() - 1; i >= 0; i--) {
            System.out.println(Character.getNumericValue(num2.charAt(i)));
            stack2.push(Character.getNumericValue(num2.charAt(i)));
        }

        StringBuilder result = new StringBuilder();
        int carry = 0; // 进位

        while (!stack1.isEmpty() || !stack2.isEmpty() || carry != 0) {
            int sum = carry; // 当前位的和加上进位
            if (!stack1.isEmpty()) {
                sum += stack1.pop();
            }
            System.out.println("num1:" + sum);
            if (!stack2.isEmpty()) {
                sum += stack2.pop();
            }
            System.out.println("num2:" + sum);
            result.append(sum % 10); // 取当前位的值，添加到结果中
            carry = sum / 10; // 计算新的进位值
        }

        return result.toString(); // 返回结果，注意要反转回来得到正确的顺序
    }
}

package me.unc.designpattern.behavior.interpreter.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * 解释器模式
 * 实现四则运算，只有加减法
 */
public class Client {
    public static void main(String[] args) throws IOException {
        String expStr = getExpStr();
        Map<String, Integer> var = getValue(expStr);
        Calculator calculator = new Calculator(expStr);
        System.out.println("运算结果：" + expStr + " = " + calculator.run(var));
    }

    //获取表达式
    public static String getExpStr() throws IOException {
        System.out.println("请输入表达式");
        return (new BufferedReader(new InputStreamReader(System.in))).readLine();
    }

    public static Map<String, Integer> getValue(String expStr) throws IOException {
        Map<String, Integer> map = new HashMap<>();

        for (char c : expStr.toCharArray()) {
            if (c != '+' && c != '-') {
                if (!map.containsKey(String.valueOf(c))) {
                    System.out.print("请输入" + String.valueOf(c) + "的值：");
                    String in = (new BufferedReader(new InputStreamReader(System.in))).readLine();
                    map.put(String.valueOf(c), Integer.valueOf(in));
                }
            }
        }
        return map;
    }

}

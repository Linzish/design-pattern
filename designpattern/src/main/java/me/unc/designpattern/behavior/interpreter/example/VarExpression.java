package me.unc.designpattern.behavior.interpreter.example;

import java.util.Map;

/**
 * 变量的解析器
 */
public class VarExpression extends Expression {

    // a + b + c
    //key=a, key=b, key=c
    //变量名称
    private String key;

    public VarExpression(String key) {
        this.key = key;
    }

    //var 就是{a=10,b=20}
    // interpreter方法 根据变量名称，返回对应值
    @Override
    public int interpreter(Map<String, Integer> var) {
        return var.get(this.key);
    }
}

package me.unc.designpattern.behavior.interpreter.example;

import java.util.Map;

/**
 * 抽象类表达式，通过HashMap键值对，可以获取到变量的值
 */
public abstract class Expression {

    // a + b - c
    //解释公式和键值, key 就是公式（表达式） 参数[a, b, c], value就是具体的值
    // HashMap {a=10,b=20}
    public abstract int interpreter(Map<String, Integer> var);

}

package me.unc.designpattern.behavior.interpreter.example;

import java.util.Map;

public class SubExpression extends SymbolExpression {

    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    //求出left和right 表达式相减后的结果
    @Override
    public int interpreter(Map<String, Integer> var) {
        return super.left.interpreter(var) - super.right.interpreter(var);
    }
}

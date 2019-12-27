package me.unc.designpattern.behavior.interpreter.example;

import java.util.Map;

/**
 * 抽象运算符号解析器，每个运算符都只和自己 左右 两个数字 有关联
 * 但左右两个数字有可能也是一个解析的结果，无论何种类型，都是Expression类的实现类
 */
public class SymbolExpression extends Expression {

    protected Expression left;
    protected Expression right;

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    //因为 SymbolExpression 是让其子类来实现， 因此interpreter 是一个默认实现
    @Override
    public int interpreter(Map<String, Integer> var) {
        return 0;
    }
}

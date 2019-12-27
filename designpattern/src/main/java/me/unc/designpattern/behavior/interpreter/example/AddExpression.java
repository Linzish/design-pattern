package me.unc.designpattern.behavior.interpreter.example;

import java.util.Map;

/**
 * 加法解释器
 */
public class AddExpression extends SymbolExpression {

    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    //处理相加
    //var 仍然是{a=10,b=20}
    @Override
    public int interpreter(Map<String, Integer> var) {
        /*
        super.left.interpreter(var) : 返回left表达式对应的值 a = 10
        super.right.interpreter(var) : 返回right表达式对应的值 b = 20
        实际调用 VarExpression类 返回对应的值（用VarExpression类创建a, b）
         */
        return super.left.interpreter(var) + super.right.interpreter(var);
    }
}

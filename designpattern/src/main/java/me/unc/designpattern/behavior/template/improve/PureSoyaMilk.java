package me.unc.designpattern.behavior.template.improve;

public class PureSoyaMilk extends SoyaMilk {
    @Override
    public void addCondiments() {
        System.out.println("纯豆浆不添加配料");
    }

    @Override
    boolean customerWantCondiments() {
        return false;
    }
}

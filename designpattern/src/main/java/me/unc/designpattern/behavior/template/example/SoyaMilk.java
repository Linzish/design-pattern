package me.unc.designpattern.behavior.template.example;

public abstract class SoyaMilk {

    //模板方法, make , 模板方法可以做成 final , 不让子类 去覆盖
    final void make() {
        select();
        addCondiments( );
        soak();
        beat();
    }

    //选材料
    public void select() {
        System.out.println("第一步：选择好的新鲜黄豆 ");
    }

    //添加不同的配料， 抽象方法, 子类具体实现
    public abstract void addCondiments();

    //浸泡
    public void soak() {
        System.out.println("第三步， 黄豆和配料开始浸泡， 需要 3 小时 ");
    }

    public void beat() {
        System.out.println("第四步：黄豆和配料放到豆浆机去打碎 ");
    }

}

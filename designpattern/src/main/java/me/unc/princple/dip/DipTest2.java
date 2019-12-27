package me.unc.princple.dip;

/**
 * 依赖倒置 三种方式 示例
 * 1.接口传递
 * 2.构造器传递
 * 3.setter方式传递
 */
public class DipTest2 {

    public static void main(String[] args) {
        //方式1
//        ChangHong changHong = new ChangHong();
//        OpenAndClose openAndClose = new OpenAndClose();
//        openAndClose.open(changHong);

        //方式2
//        ChangHong changHong = new ChangHong();
//        OpenAndClose openAndClose = new OpenAndClose(changHong);
//        openAndClose.open();

        //方式3
        ChangHong changHong = new ChangHong();
        OpenAndClose openAndClose = new OpenAndClose();
        openAndClose.setTv(changHong);
        openAndClose.open();

    }

}

//写一个tv实现类
class ChangHong implements ITV {
    @Override
    public void play() {
        System.out.println("长虹电视机open");
    }
}

//方式1：通过接口传递实现依赖
//开关的接口
/*interface IOpenAndClose {
    void open(ITV tv);   //抽象方法，接收接口
}

interface ITV { //ITV接口
    void play();
}
//实现接口
class OpenAndClose implements IOpenAndClose {
    @Override
    public void open(ITV tv) {
        tv.play();
    }
}*/

//方式2：通过构造方法依赖传递
/*interface IOpenAndClose {
    void open();   //抽象方法，接收接口
}

interface ITV { //ITV接口
    void play();
}
//实现接口
class OpenAndClose implements IOpenAndClose {
    private ITV tv;
    public OpenAndClose(ITV tv) {
        this.tv = tv;
    }
    @Override
    public void open() {
        this.tv.play();
    }
}*/

//方式3：通过Setter方法传递依赖
interface IOpenAndClose {
    void open();   //抽象方法，接收接口
    void setTv(ITV tv);
}

interface ITV { //ITV接口
    void play();
}
//实现接口
class OpenAndClose implements IOpenAndClose {
    private ITV tv;
    @Override
    public void open() {
        this.tv.play();
    }
    @Override
    public void setTv(ITV tv) {
        this.tv = tv;
    }
}

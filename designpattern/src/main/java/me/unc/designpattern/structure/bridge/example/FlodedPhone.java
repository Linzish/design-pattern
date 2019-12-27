package me.unc.designpattern.structure.bridge.example;

public class FlodedPhone extends Phone {

    public FlodedPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void open() {
        super.open();
        System.out.println(" 折叠样式手机 ");
    }

    @Override
    public void close() {
        super.close();
        System.out.println(" 折叠样式手机 ");
    }

    @Override
    public void call() {
        super.call();
        System.out.println(" 折叠样式手机 ");
    }
}

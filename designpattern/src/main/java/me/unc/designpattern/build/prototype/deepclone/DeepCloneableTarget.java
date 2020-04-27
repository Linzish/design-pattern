package me.unc.designpattern.build.prototype.deepclone;

import java.io.Serializable;

//深拷贝实例对象
public class DeepCloneableTarget implements Serializable, Cloneable {

    private static final long serialVersionUID = 1L;

    private String name;

    private String cloneClass;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCloneClass() {
        return cloneClass;
    }

    public void setCloneClass(String cloneClass) {
        this.cloneClass = cloneClass;
    }

    //构造器
    public DeepCloneableTarget(String name, String cloneClass) {
        this.name = name;
        this.cloneClass = cloneClass;
    }

    //因为该类的属性都是String，因此我们这里使用默认的clone来完成即可
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

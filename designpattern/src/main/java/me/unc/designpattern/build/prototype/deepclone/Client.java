package me.unc.designpattern.build.prototype.deepclone;

/**
 * 深拷贝
 * 1) 复制对象的所有基本数据类型的成员变量值
 * 2) 为所有引用数据类型的成员变量申请存储空间，并复制每个引用数据类型成员变量所引用的对象，
 *  直到该对象 可达的所有对象。也就是说，对象进行深拷贝要对整个对象(包括对象的引用类型)进行拷贝
 *
 * 3) 深拷贝实现方式 1：重写 clone 方法来实现深拷贝
 * 4) 深拷贝实现方式 2：通过对象序列化实现深拷贝(推荐)
 *  @see DeepProtoType
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        DeepProtoType deepProtoType = new DeepProtoType();
        deepProtoType.name = "篮球实习生";
        deepProtoType.deepCloneableTarget = new DeepCloneableTarget("cxk", "唱跳rap篮球");

        //方式1 进行深拷贝
        DeepProtoType clone = (DeepProtoType) deepProtoType.clone();
        System.out.println("deepProtoType.name = " + deepProtoType.name
                + " deepProtoType.deepCloneableTarget = " + deepProtoType.deepCloneableTarget.hashCode());
        System.out.println("clone.name = " + clone.name + " clone.deepCloneableTarget = " +
                clone.deepCloneableTarget.hashCode());

        //方式2 进行深拷贝
        DeepProtoType clone2 = (DeepProtoType) deepProtoType.deepClone();
        System.out.println("clone2.name = " + clone2.name + " clone2.deepCloneableTarget = " +
                clone2.deepCloneableTarget.hashCode());
    }
}

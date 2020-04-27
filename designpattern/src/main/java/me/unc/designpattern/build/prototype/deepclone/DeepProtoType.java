package me.unc.designpattern.build.prototype.deepclone;

import java.io.*;

public class DeepProtoType implements Serializable, Cloneable {

    public String name;

    public DeepCloneableTarget deepCloneableTarget; //引用类型的属性

    public DeepProtoType() {
    }

    //深拷贝实现
    //方法1- 重写clone方法
    //如果使用这种方法，要对引用属性一一这样克隆，一层套一层
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = null;
        //这里对完成对基本数据类型的克隆（字符串等）
        deep =  super.clone();
        //对引用类型属性进行单独处理
        DeepProtoType deepProtoType = (DeepProtoType) deep;
        //调用引用属性的clone方法
        deepProtoType.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();
        //返回
        return deepProtoType;
    }

    //方法2- 通过对象的序列化实现深拷贝（推荐）
    public Object deepClone() {
        //创建流对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        //以对象流番薯读出，再以对象流方式读入，实现深拷贝
        //对象在序列化时会重新在内存区建立一个对象
        try {
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            //把当前这个对象以对象流方式输出
            oos.writeObject(this);

            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());  //相当于克隆
            ois = new ObjectInputStream(bis);  //读取
            DeepProtoType copyObj = (DeepProtoType) ois.readObject();
            return copyObj;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}

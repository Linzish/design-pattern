package me.unc.designpattern.structure.proxy.cglibproxy;

public class TeacherDao {
    public String teach() {
        System.out.println(" 老师授课中 ， 我是 cglib 代理，不需要实现 接口 ");
        return "下课";
    }
}

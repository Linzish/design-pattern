package me.unc.designpattern.structure.proxy.staticproxy;

public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("老师正在授课...");
    }
}

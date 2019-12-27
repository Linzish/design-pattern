package me.unc.princple.ocp.improve;

public class OcpTest_improve {

    public static void main(String[] args) {
        //使用看看存在问题
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        //但增加一个图形时，需要修改代码比较多，不符合开闭原则
        graphicEditor.drawShape(new Triangle());

        //这样无需修改GraphicEditor的drawShape方法，只需要增加继承基类的图形即可
        graphicEditor.drawShape(new OtherGraphic());
    }

}

//这是一个用于绘图的类
class GraphicEditor {
    public void drawShape(Shape s) {
        s.draw();
    }
}

//图形基类
//修改图形基类为抽象基类
abstract class Shape {
    int m_type;

    public abstract void draw();
}

//矩形
class Rectangle extends Shape {
    public Rectangle() {
        super.m_type = 1;
    }

    @Override
    public void draw() {
        System.out.println(" 绘制矩形 ");
    }
}
//圆形
class Circle extends Shape {
    public Circle() {
        super.m_type = 2;
    }

    @Override
    public void draw() {
        System.out.println(" 绘制圆形 ");
    }
}

//新增一个三角形
class Triangle extends Shape {
    public Triangle() {
        super.m_type = 3;
    }

    @Override
    public void draw() {
        System.out.println(" 绘制三角形 ");
    }
}

//新增其他图形
class OtherGraphic extends Shape {
    public OtherGraphic() {
        super.m_type = 4;
    }

    @Override
    public void draw() {
        System.out.println(" 绘制其他图形 ");
    }
}

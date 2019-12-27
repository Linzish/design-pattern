package me.unc.designpattern.structure.adapter.myspringmvc;

//Controller类型
public interface Controller {
}

class HttpController implements Controller {
    public void doHttpHandler() {
        System.out.println("http...");
    }
}

class SimpleController implements Controller {
    public void doSimpleHandler() {
        System.out.println("simple...");
    }
}

class AnnotationController implements Controller {
    public void doAnnotationHandler() {
        System.out.println("annotation...");
    }
}
package me.unc.designpattern.structure.adapter.myspringmvc;

import java.util.ArrayList;
import java.util.List;

/**
 * 模拟 Spring MVC
 *
 * 适配器模式在 SpringMVC 框架应用
 * 1) SpringMvc 中的 HandlerAdapter, 就使用了适配器模式
 * 2) SpringMVC 处理请求的流程回顾
 * 3) 使用 HandlerAdapter 的原因分析:
 *   可以看到处理器的类型不同，有多重实现方式，那么调用方式就不是确定的，如果需要直接调用 Controller 方法，
 *   需要调用的时候就得不断是使用 if else 来进行判断是哪一种子类然后执行。那么如果后面要扩展 Controller，
 *   就得修改原来的代码，这样违背了 OCP 原则。
 *
 * 说明：
 * Spring定义了一个适配接口，使得每一种Controller由一种对应的适配器实现类
 * 适配器代替controller执行相应的方法
 * 拓展Controller时，只需要增加一个适配器类就完成了SpringMVC的拓展了
 * 这就是设计模式的力量
 *
 */
public class DispatchServlet {

    public static List<HandlerAdapter> handlerAdapters = new ArrayList<>();

    public DispatchServlet() {
        //初始化
        handlerAdapters.add(new AnnotationHandlerAdapter());
        handlerAdapters.add(new HttpHandlerAdapter());
        handlerAdapters.add(new SimpleHandlerAdapter());
    }

    //模拟 SpringMVC DispatchServlet 核心方法doDispatch处理请求
    public void doDispatch() {
        // 此处模拟SpringMVC从request取handler的对象，
        // 适配器可以获取到希望的Controller
        HttpController httpController = new HttpController();
//        AnnotationController annotationController = new AnnotationController();
//        SimpleController simpleController = new SimpleController();
        // 得到对应的适配器
        HandlerAdapter handler = getHandler(httpController);
        // 通过适配器执行对应的Controller对应的方法
        handler.handle(httpController);
    }

    public HandlerAdapter getHandler(Controller controller) {
        //遍历，获取匹配的适配器
        for (HandlerAdapter handlerAdapter : handlerAdapters) {
            if (handlerAdapter.support(controller)) {
                return handlerAdapter;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        //测试
        DispatchServlet dispatchServlet = new DispatchServlet();
        dispatchServlet.doDispatch();
    }

}

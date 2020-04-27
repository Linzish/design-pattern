package me.unc.designpattern.build.builder;


/**
 * 建造者模式
 *
 * 引入示例：盖房项目需求
 * 1) 需要建房子：这一过程为打桩、砌墙、封顶
 * 2) 房子有各种各样的，比如普通房，高楼，别墅，各种房子的过程虽然一样，但是要求不要相同的.
 * 3) 请编写程序，完成需求.
 *
 * 传统方式：
 * @see me.unc.designpattern.build.builder.base.Client
 *
 * 建造者模式：
 * @see me.unc.designpattern.build.builder.improve.Client
 *
 * JDK中的 StringBuilder 类使用了建造者模式
 *
 * 建造者模式的注意事项和细节
 * 1) 客户端(使用程序)不必知道产品内部组成的细节，将产品本身与产品的创建过程解耦，使得相同的创建过程可以创建不同的产品对象
 * 2) 每一个具体建造者都相对独立，而与其他的具体建造者无关，因此可以很方便地替换具体建造者或增加新的具体建造者，
 *  用户使用不同的具体建造者即可得到不同的产品对象
 * 3) 可以更加精细地控制产品的创建过程 。将复杂产品的创建步骤分解在不同的方法中，使得创建过程更加清晰，
 *  也更方便使用程序来控制创建过程
 * 4) 增加新的具体建造者无须修改原有类库的代码，指挥者类针对抽象建造者类编程，系统扩展方便，符合 “开闭原则”
 * 5) 建造者模式所创建的产品一般具有较多的共同点，其组成部分相似，如果产品之间的差异性很大，则不适合使用建造者模式，因此其使用范围受到一定的限制。
 * 6) 如果产品的内部变化复杂，可能会导致需要定义很多具体建造者类来实现这种变化，导致系统变得很庞大，因此在这种情况下，要考虑是否选择建造者模式.
 * 7) 抽象工厂模式 VS 建造者模式
 *   抽象工厂模式实现对产品家族的创建，一个产品家族是这样的一系列产品：具有不同分类维度的产品组合，
 *   采用抽象工厂模式不需要关心构建过程，只关心什么产品由什么工厂生产即可。而建造者模式则是要求按
 *   照指定的蓝图建造产品，它的主要目的是通过组装零配件而产生一个新产品
 *   （建造模式所有函数加到一起才能生成一个对象，抽象工厂一个函数生成一个对象）
 *
 */
public class BuilderMain {
}

package com.haojing.springboot.time.singleton;

/**
 * 静态内部类实现单例模式（更好一点）-> 改进懒汉式
 * @author haoj
 * @date 2019/12/4
 */
public class Holder {
    private Holder() {}
    public static Holder getInstance() {
        return InnerClass.HOLDER;
    }

    /**
     * 调用的时候才加载
     */
    private static class InnerClass{
        private static final Holder HOLDER = new Holder();

    }
}

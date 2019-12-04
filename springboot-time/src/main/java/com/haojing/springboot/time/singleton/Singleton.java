package com.haojing.springboot.time.singleton;

/**
 * 枚举单例模式- 推荐的单例模式 - 枚举不能通过反射来获取枚举对象。所以枚举是线程安全又唯一性
 * 枚举本质还是一个类
 * 单例模式为什么不能反射破解
 * @author haoj
 * @date 2019/12/4
 */
public enum Singleton {
    INSTANCE;
    public static Singleton getInstance() {
        return Singleton.INSTANCE;
    }
}

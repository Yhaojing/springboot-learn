package com.haojing.springboot.time.singleton;

import java.lang.reflect.Constructor;

/**
 * 懒汉模式
 *
 * 1:私有的构造器
 * 2：拥有自己类型属性
 * 3：对外提供获取实例的静态方法
 * @author haoj
 * @date 2019/12/4
 */
public class LazySingleton {
    /**
     * 保证原子性保证A全部执行完，B才会拿到这个值。
     */
    private volatile static LazySingleton instance;
    /**
     *  避免new
      */
    private LazySingleton() {
        synchronized (LazySingleton.class) {
            // 如果都通过反射那样也是不安全的。
            if(instance != null) {
                throw new RuntimeException("不要试图破坏单例模式");
            }
        }
    }
    /**
     *  如果两个线程同时进来，会导致实例不唯一（线程不安全）
      */

    public static LazySingleton getInstance() {
        if (instance == null) {
            /**
             * 对象加锁
             */
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }

            }

        }
        return instance;
    }

}

/**
 * 指令JVM重排
 * 1：分配内存
 * 2：执行构造方法
 * 3：指向地址
 * A->new 懒加载时。先执行第三步， B->有instance时直接返回，导致B拿到是不完整的对象
 */
class Demo {
    public static void main(String[] args) throws Exception {
        LazySingleton instance = LazySingleton.getInstance();
        /**
         * 通过反射
         */
        Constructor<LazySingleton> lazySingletonConstructor = LazySingleton.class.getDeclaredAnnotation(null);
        lazySingletonConstructor.setAccessible(true);
        LazySingleton instance2 = lazySingletonConstructor.newInstance();
    }
}

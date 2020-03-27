package com.ant.patterns.singleton;

import java.util.concurrent.atomic.AtomicLong;

/**
 * <p>
 * 单例（静态内部类）
 * 优点：既保证了线程安全，又能做到延迟加载
 *
 * 大佬观点:
 * SingletonHolder 是一个静态内部类，当外部类 IdGenerator 被加载的时候，
 * 并不会创建 SingletonHolder 实例对象。只有当调用 getInstance() 方法时，
 * SingletonHolder 才会被加载，这个时候才会创建 instance。instance 的唯一性、创建过程的线程安全性，
 * 都由 JVM 来保证。所以，这种实现方法既保证了线程安全，又能做到延迟加载。
 * </p>
 *
 * @author Ant
 * @since 2020/02/09 7:46 下午
 */
public class IdGeneratorByStaticInnerClass {
    private AtomicLong id = new AtomicLong(0);

    private static IdGeneratorByStaticInnerClass instance;
    /**
     * 构造函数私有，避免外部实例化
     */
    private IdGeneratorByStaticInnerClass(){}

    /**
     * 当需要的事后调用的时候才会被创建
     */
    private static class SingletonHolder {
        private static IdGeneratorByStaticInnerClass instance = new IdGeneratorByStaticInnerClass();
    }

    public static IdGeneratorByStaticInnerClass getInstance() {
        return SingletonHolder.instance;
    }

    public long getId() {
        return id.incrementAndGet();
    }

}

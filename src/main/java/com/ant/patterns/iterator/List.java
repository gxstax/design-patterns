package com.ant.patterns.iterator;

/**
 * <p>
 * 容器抽象
 * </p>
 *
 * @author GaoXin
 * @since 2020/4/1 8:33 上午
 */
public interface List<E> {

    /**
     * 组合迭代
     */
    Iterator iterator();

    /**
     * 容器大小
     */
    int size();

    /**
     * 新增元素
     */
    boolean add(E e);

    E get(int cursor);

}

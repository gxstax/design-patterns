package com.ant.patterns.iterator;

/**
 * <p>
 * 功能描述
 * </p>
 *
 * @author GaoXin
 * @since 2020/4/1 8:54 上午
 */
public class Demo {

    public static void main(String[] args) {
        ArrayList names = new ArrayList<>();
        names.add("Ant");
        names.add("马以");
        names.add("mayi");
        Iterator iterator = new ArrayIterator(names);
        while (iterator.hasNext()) {
            System.out.println(iterator.currentItem());
            iterator.next();
        }
    }
}

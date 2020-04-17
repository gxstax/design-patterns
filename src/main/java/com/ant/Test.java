package com.ant;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 功能描述
 * </p>
 *
 * @author GaoXin
 * @since 2020/3/24 4:59 下午
 */
public class Test {

    public static void main(String[] args) {
        Integer i1 = 12;
        Integer i2 = 12;
        Integer i3 = 233;
        Integer i4 = 233;

        System.out.println(i1 == i2);
        System.out.println(i3 == i4);



        List<String> names = new ArrayList<>();
        names.add("a");
        names.add("b");
        names.add("c");
        names.add("d");

        java.util.Iterator<String> iterator1 = names.iterator();
        java.util.Iterator<String> iterator2 = names.iterator();
        iterator1.next();
        iterator1.remove();
        iterator1.next(); // 运行结果？

    }
}

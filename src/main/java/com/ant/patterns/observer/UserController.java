package com.ant.patterns.observer;

import com.google.common.eventbus.AsyncEventBus;
import com.google.common.eventbus.EventBus;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;

/**
 * <p>
 * 功能描述
 * </p>
 *
 * @author GaoXin
 * @since 2020/3/24 8:42 上午
 */
public class UserController {

    private List<RegObserver> regObservers = new ArrayList<>();

    public UserController(List<RegObserver> regObservers) {
        this.regObservers = regObservers;
    }

    public void register(long userId) {
        // 1. 省略注册逻辑

        // 2. 注册后的动作
        for (RegObserver regObserver : regObservers) {
            regObserver.handleRegSuccess(userId);
        }
    }
}

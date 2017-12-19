package com.wpt.mvxdemo.mvp.model;

/**
 * Created by wpt on 17/12/19.
 */

public class UserImpl implements IUser {
    @Override
    public User loadData() {
        User user = new User();
        user.name = "MVP";
        user.id = 0x002;
        return user;
    }

}

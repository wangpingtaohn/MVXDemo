package com.wpt.mvxdemo.mvvm.viewmodel;

import android.databinding.BaseObservable;
import android.view.View;

import com.wpt.mvxdemo.mvvm.model.User;

/**
 * Created by wpt on 17/12/20.
 */

public class UserViewModel extends BaseObservable {

    private User user;

    public UserViewModel(){
        User user = new User(0x003, "MVVM");
        setUser(user);
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void onClickBtn(View view){
        user.setId(0x005);
        user.setName("MVVX" + "_onClickBtn");
    }
}

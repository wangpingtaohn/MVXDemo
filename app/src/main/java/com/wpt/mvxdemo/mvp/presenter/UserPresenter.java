package com.wpt.mvxdemo.mvp.presenter;

import com.wpt.mvxdemo.mvp.model.IUser;
import com.wpt.mvxdemo.mvp.model.User;
import com.wpt.mvxdemo.mvp.model.UserImpl;
import com.wpt.mvxdemo.mvp.view.IUserView;

/**
 * Created by wpt on 17/12/19.
 */

public class UserPresenter {

    private IUser user;
    private IUserView userView;

    public UserPresenter(IUserView view){
        user = new UserImpl();
        userView = view;
    }

    public void loadData(){
        User userInfo = user.loadData();
        userView.updateUI(userInfo);
    }
}

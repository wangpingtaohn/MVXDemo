package com.wpt.mvxdemo.mvc.ctrl;

import com.wpt.mvxdemo.mvc.model.User;
import com.wpt.mvxdemo.mvc.view.MVCActivity;

/**
 * Created by wpt on 17/12/18.
 */

public class UserCtrl {

    public void LoadData(MVCActivity activity){
        User user = new User();
        user.load(activity);
    }
}

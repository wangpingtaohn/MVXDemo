package mvx.wpt.com.mvxdemo.mvp.presenter;

import mvx.wpt.com.mvxdemo.mvp.model.IUser;
import mvx.wpt.com.mvxdemo.mvp.model.User;
import mvx.wpt.com.mvxdemo.mvp.model.UserImpl;
import mvx.wpt.com.mvxdemo.mvp.view.IUserView;

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

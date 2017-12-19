package mvx.wpt.com.mvxdemo.mvc.ctrl;

import mvx.wpt.com.mvxdemo.mvc.model.User;
import mvx.wpt.com.mvxdemo.mvc.view.MVCActivity;

/**
 * Created by wpt on 17/12/18.
 */

public class UserCtrl {

    public void LoadData(MVCActivity activity){
        User user = new User();
        user.load(activity);
    }
}

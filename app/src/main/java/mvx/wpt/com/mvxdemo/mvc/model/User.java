package mvx.wpt.com.mvxdemo.mvc.model;

import mvx.wpt.com.mvxdemo.mvc.view.MVCActivity;

/**
 * Created by wpt on 17/12/18.
 */

public class User {
    public int id;
    public String name;

    public void load(MVCActivity activity){
        User user = new User();
        user.id = 0x11;
        user.name = "user";
        activity.updateUI(user);
    }
}

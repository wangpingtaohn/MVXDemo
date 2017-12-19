package mvx.wpt.com.mvxdemo.mvc.view;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import mvx.wpt.com.mvxdemo.R;
import mvx.wpt.com.mvxdemo.mvc.ctrl.UserCtrl;
import mvx.wpt.com.mvxdemo.mvc.model.User;

public class MVCActivity extends Activity {

    public TextView mTextView;

    public Button mBtn;

    public UserCtrl mCtrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mvx_layout);

        mTextView = (TextView) findViewById(R.id.mvx_textView);
        mBtn = (Button) findViewById(R.id.mvx_btn);
        mCtrl = new UserCtrl();

        mBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCtrl.LoadData(MVCActivity.this);

            }
        });
    }

    public void updateUI(User user){
        mTextView.setText("id=" + user.id + ",name=" + user.name);
    }
}

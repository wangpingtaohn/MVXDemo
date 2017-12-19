package com.wpt.mvxdemo.mvc.view;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.wpt.mvxdemo.R;
import com.wpt.mvxdemo.mvc.ctrl.UserCtrl;
import com.wpt.mvxdemo.mvc.model.User;

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

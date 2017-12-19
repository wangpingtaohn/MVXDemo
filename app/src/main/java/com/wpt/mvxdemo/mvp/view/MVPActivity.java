package com.wpt.mvxdemo.mvp.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.wpt.mvxdemo.R;
import com.wpt.mvxdemo.mvp.model.User;


import com.wpt.mvxdemo.mvp.presenter.UserPresenter;

public class MVPActivity extends AppCompatActivity implements IUserView{

    public TextView mTextView;

    public Button mBtn;

    private UserPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mvx_layout);

        mTextView = (TextView) findViewById(R.id.mvx_textView);
        mBtn = (Button) findViewById(R.id.mvx_btn);
        mPresenter = new UserPresenter(this);

        mBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPresenter.loadData();

            }
        });
    }

    @Override
    public void updateUI(User user) {
        mTextView.setText("id=" + user.id + ",name=" + user.name);
    }
}

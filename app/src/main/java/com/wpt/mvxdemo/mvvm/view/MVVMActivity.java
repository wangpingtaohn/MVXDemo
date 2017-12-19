package com.wpt.mvxdemo.mvvm.view;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.wpt.mvxdemo.R;
import com.wpt.mvxdemo.databinding.MvvmLayoutBinding;
import com.wpt.mvxdemo.mvvm.model.User;


public class MVVMActivity extends AppCompatActivity {

    private MvvmLayoutBinding mBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.mvvm_layout);
        mBinding = DataBindingUtil.setContentView(MVVMActivity.this, R.layout.mvvm_layout);
        User user = new User("0x003", "MVVM");
        mBinding.setUser(user);

        findViewById(R.id.mvvm_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User user = new User("MVVM_ID", "MVVM");
                mBinding.setUser(user);
            }
        });



    }
}

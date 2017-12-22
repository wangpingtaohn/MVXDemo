package com.wpt.mvxdemo.mvvm.view;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.wpt.mvxdemo.R;
import com.wpt.mvxdemo.databinding.MvvmLayoutBinding;
import com.wpt.mvxdemo.mvvm.viewmodel.UserViewModel;


public class MVVMActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.mvvm_layout);
        MvvmLayoutBinding mBinding = DataBindingUtil.setContentView(MVVMActivity.this, R.layout.mvvm_layout);
        UserViewModel viewModel = new UserViewModel();
        mBinding.setUserViewModel(viewModel);



    }
}

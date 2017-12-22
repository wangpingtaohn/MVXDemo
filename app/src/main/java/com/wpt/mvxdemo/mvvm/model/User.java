package com.wpt.mvxdemo.mvvm.model;


import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.wpt.mvxdemo.BR;

/**
 * Created by wpt on 17/12/18.
 */

public class User extends BaseObservable{

    //编译时会在BR中生产BR.id，BR作用就是相当于一个观察者
    @Bindable
    public int id;

    //编译时会在BR中生产BR.name，BR作用就是相当于一个观察者
    @Bindable
    public String name;

    public User(int _id, String _name){
        this.id = _id;
        this.name = _name;
    }

    public void setId(int id) {
        this.id = id;
        notifyPropertyChanged(BR.id);
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

package com.example.android.testing.unittesting.basicunitandroidtest;

import android.app.Activity;
import android.util.Log;

public class Test<T extends Activity> {

    private final Class<T> mActivityClass;

    public Test(Class<T> s){
        this.mActivityClass = s;
    }

    public T getActivity() {
        return null;
    }
}

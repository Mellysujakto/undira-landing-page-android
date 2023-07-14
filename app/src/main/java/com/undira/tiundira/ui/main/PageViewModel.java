package com.undira.tiundira.ui.main;

import android.arch.core.util.Function;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.Transformations;
import android.arch.lifecycle.ViewModel;
import android.util.Log;

import com.undira.tiundira.DBHandler;
import com.undira.tiundira.MainActivity;
import com.undira.tiundira.Undira;

public class PageViewModel extends ViewModel {
    private String txt;
    private MutableLiveData<Integer> mIndex = new MutableLiveData<>();
    private LiveData<String> mText = Transformations.map(mIndex, new Function<Integer, String>() {
        @Override
        public String apply(Integer input) {
            return getTxt();
        }
    });

    public void setIndex(int index) {
        mIndex.setValue(index);
    }

    public LiveData<String> getText() {
        return mText;
    }

    public void setText(String txt) {
        this.txt = txt;
    }

    public String getTxt() {
        return this.txt;
    }
}
package com.sharpcj.projects.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.sharpcj.projects.R;
import com.sharpcj.projects.base.BaseActivity;
import com.sharpcj.projects.contract.StudentContract;
import com.sharpcj.projects.model.Student;
import com.sharpcj.projects.presenter.StudentPresenter;

import java.util.List;
import java.util.Random;

public class MainActivity extends BaseActivity<StudentPresenter> implements StudentContract.View {

    private TextView mTvTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        mTvTest = findViewById(R.id.tv_test);
    }

    @Override
    protected void initListener() {
        mTvTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mPresenter.getStudentsInfo();
            }
        });
    }

    @Override
    protected void initData() {

    }

    @Override
    protected StudentPresenter createPresenter() {
        return new StudentPresenter(this);
    }

    @Override
    public void updateUI(List<Student> lsStudents) {
        int random = new Random(System.currentTimeMillis()).nextInt(3);
        mTvTest.setText(lsStudents.get(random).getName());
    }
}

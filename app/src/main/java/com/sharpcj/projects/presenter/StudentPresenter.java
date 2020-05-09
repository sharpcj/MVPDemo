package com.sharpcj.projects.presenter;

import com.sharpcj.projects.base.BasePresenter;
import com.sharpcj.projects.contract.StudentContract;
import com.sharpcj.projects.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentPresenter extends BasePresenter<StudentContract.View> implements StudentContract.Presenter{

    public StudentPresenter(StudentContract.View view) {
        super(view);
    }

    @Override
    public void getStudentsInfo() {
        // run on IO thread
        List<Student> students = new ArrayList<>();
        students.add(new Student(0001, "Jim", 15));
        students.add(new Student(0002, "Lily", 14));
        students.add(new Student(0003, "Wey", 16));

        // run on main thread
        mView.updateUI(students);
    }
}

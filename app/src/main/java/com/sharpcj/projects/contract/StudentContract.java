package com.sharpcj.projects.contract;

import com.sharpcj.projects.base.IPresenter;
import com.sharpcj.projects.base.IView;
import com.sharpcj.projects.model.Student;

import java.util.List;

public class StudentContract {
    public interface View extends IView {
        void updateUI(List<Student> lsStudents);
    }

    public interface Presenter extends IPresenter {
        void getStudentsInfo();
    }

}

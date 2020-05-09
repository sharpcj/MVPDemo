package com.sharpcj.projects.base;

public interface IPresenter<T extends IView> {

    void attachView(T view);

    void detachView();
}

package com.sharpcj.projects.base;

public class BasePresenter<T extends IView> implements IPresenter{

    protected T mView;

    public BasePresenter() {
        this(null);
    }

    public BasePresenter(T view) {
        attachView(view);
    }

    @Override
    public void attachView(IView view) {
        mView = (T) view;
    }

    @Override
    public void detachView() {
        if (mView != null) {
            mView = null;
        }
    }
}

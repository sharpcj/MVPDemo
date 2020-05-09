package com.sharpcj.projects.common.net;

/**
 * 网络访问线程的回调接口,用于通知主线程处理结果
 */
public interface INetCallback {

    /**
     * 网络访问成功
     *
     * @param strResult 返回的结果
     */
    public void success(String strResult);

    /**
     * 网络访问失败
     *
     * @param strMsg 失败的信息
     */
    public void fail(String strMsg);
}
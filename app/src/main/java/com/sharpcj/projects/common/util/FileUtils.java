package com.sharpcj.projects.common.util;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

import java.io.File;

public class FileUtils {

    /**
     * 安装apk文件的方法
     *
     * @param context 上下文
     * @param file    apk文件所在的路径和文件名
     */
    public static void installApk(Context context, File file) {
        Intent intent = new Intent();
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.setAction(Intent.ACTION_VIEW);
        String type = "application/vnd.android.package-archive";
        intent.setDataAndType(Uri.fromFile(file), type);
        context.startActivity(intent);
    }
}

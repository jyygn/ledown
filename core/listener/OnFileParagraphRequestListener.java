package com.mobile.ledown.core.listener;

import java.io.IOException;

public interface OnFileParagraphRequestListener {
    /**
     * 下载完成
     */
    void onDownloadComplete();

    void onDownloadNetError();

    /**
     * 暂停下载
     */
    void onDownloadPause();

    /**
     * @param addLen
     *            新增加长度
     * @param completeSize
     *            已下载位置
     */
    void onProgress(int addedSize, long completeSize);

    /**
     * 下载缓冲数据
     * @param buffer
     * @param len
     */
    void onReadBuffer(byte[] buffer, int len) throws IOException;
}

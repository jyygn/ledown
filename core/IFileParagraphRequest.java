package com.mobile.ledown.core;

import ledown.core.listener.OnFileParagraphRequestListener;

public interface IFileParagraphRequest {

    /**
     * 获取网络上资源 fileParagraph 描述的位置
     * @param url
     * @param startPosition
     *            开始位置
     * @param endPosition
     *            结束位置
     * @param onFileParagraphRequestListener
     */
    void get(String url, long lastProgress, long endPosition,
            OnFileParagraphRequestListener onFileParagraphRequestListener);

    /**
     * 暂停
     */
    void pause();

}

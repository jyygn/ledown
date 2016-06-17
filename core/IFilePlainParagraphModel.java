package com.mobile.ledown.core;

import com.mobile.common.ICallback;
import com.mobile.ledown.core.file.IFileParagraph;

public interface IFilePlainParagraphModel {
    /**
     * 获取文件段
     * @return
     */
    IFileParagraph getFileParagraph();

    /**
     * 是否下载完成
     * @return
     */
    boolean isDownloadComplete();

    /**
     * 文件段进度改变
     * @param fileParagraph
     */
    void onFileParagraphChangeProgress(int riseSize,
            IFileParagraph fileParagraph);

    /**
     * 执行结束下载
     * @param onStopDownloadListener
     */
    void pauseDownload();

    /**
     * 读取网络文件
     * @param onReadingListener
     *            读取回调
     */
    void read(ICallback<Boolean> onReadingListener);

    /**
     * 读取网络文件
     * @param onReadingListener
     *            读取回调
     */
    void read(String url, String outputPath, IFileParagraph fileParagraph,
            ICallback<Boolean> onReadingListener);

    /**
     * 保存文件段信息
     * @param fileParagraph
     */
    void saveLastPosition(IFileParagraph fileParagraph);
}

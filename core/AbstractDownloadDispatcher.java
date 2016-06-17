package com.mobile.ledown.core;

import ledown.core.listener.OnSaveLastPositionListener;

public abstract class AbstractDownloadDispatcher {

    /**
     * 将URL资源文件拆分并分配给不同职责范围的下载器
     * @param downloadingFile
     * @param isNewThread
     *            true 新线程执行 false 调用线程执行
     * @throws NoMemoryException
     * @throws FileAlreadyExistException
     */
    public abstract void dispenseRangeTask(DownloadingFile downloadingFile,
            boolean isNewThread) throws NoMemoryException,
            FileAlreadyExistException;

    /**
     * 获取并行下载数
     * @return
     */
    public abstract int getConcurrentDownloadNum();

    /**
     * 暂停任务
     */
    public abstract void pauseTask();

    /**
     * 获取最后位置 即上次进度
     */
    public abstract void readLastPosition();

    /**
     * 重启任务
     */
    public abstract void resumeTask(boolean isNewThread)
            throws NoMemoryException, FileAlreadyExistException;

    /**
     * 设置保存最后进度监听
     * @param onSaveLastPositionListener
     */
    public abstract void setOnSaveLastPositionListener(
            OnSaveLastPositionListener onSaveLastPositionListener);
    /**
     * 下载进度改变
     * @param progress
     */
    // public abstract void onChanageProgress(float progress);

    /**
     * 下载完成
     */
    // public abstract void onDownloadComplete();
}

package com.mobile.ledown.core.file;

/**
 * 文件片段
 * @author yangn
 */
public interface IFileParagraph {
    /**
     * 已下载进度 从开始位置计算+已下载size
     * @return
     */
    long getCompeleteSize();

    /**
     * 结束位置
     * @return
     */
    long getEndPosition();

    /**
     * 下载进度 下载开始位置到已下载位置长度
     * @return
     */
    long getProgress();

    /**
     * 开始位置
     * @return
     */
    long getStartPosition();

    /**
     * 是否完成
     * @return
     */
    boolean isFinish();

    /**
     * 设置已完成长度
     * @param compeleteSize
     */
    void setCompeleteSize(long compeleteSize);

    /**
     * 设置结束位置
     * @param endPosition
     */
    void setEndPosition(long endPosition);
}
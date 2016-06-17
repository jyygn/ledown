package com.mobile.ledown.core.file;

import java.io.IOException;

/**
 * 正在缓存的文件
 * @author yangn
 */
public interface IDownloadingFile {
    /**
     * 添加进度
     * @param riseSize
     *            增长进度
     * @throws IOException
     */
    void addProgress(int riseSize) throws IOException, RecordProgressException;

    /**
     * 检查本地是否存在网络文件 该函数必须在子线程调用
     * @return
     * @throws FileAlreadyExistException
     */
    boolean exists() /* throws IOException */;

    /**
     * 已下载进度
     * @return (即 已下载文件大小)
     */
    long getDownloadedFileProgress();

    /**
     * 文件所分成的文件段信息
     * @return
     */
    IFileParagraph[] getFileParagraphs() throws IOException;

    /**
     * 网络文件大小
     * @return
     * @throws IOException
     */
    long getFileSize() throws IOException;

    /**
     * 获取文件名称
     * @return
     */
    String getName();

    /**
     * 本地文件路径
     * @return
     */
    String getOutputFilePath();

    /**
     * 进度百分比
     * @return 1~100范围
     */
    float getPercentageProgress();

    /**
     * 网络地址
     * @return
     */
    String getUrl();

    /**
     * 是否已下载完成
     * @return true 已完成 false 未完成
     */
    public boolean isDownloadFinish() throws IOException;

    void setFileParagraphs(IFileParagraph[] fileParagraphs) throws IOException,
            RecordProgressException;

    /**
     * 设置文件长度 描述此网络文件的本地映射会占用newLength大小的存储空间 设置该值后 即刻会在SD Card占用newLength存储空间
     * @param newLength
     * @throws IOException
     *             如果SD Card 剩余存储空间少于newLength 则抛出
     */
    public void setLength(long newLength) throws IOException, NoMemoryException;

    /**
     * 设置文件名称
     * @param name
     * @return
     */
    void setName(String name);

}

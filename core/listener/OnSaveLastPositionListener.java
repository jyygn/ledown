package com.mobile.ledown.core.listener;

import ledown.core.file.IFileParagraph;

/**
 * 下载结束或暂停保存最后进度事件
 * @author yangn
 */
public interface OnSaveLastPositionListener {
    /**
     * 保存最后位置
     * @param fileParagraph
     */
    public void onSaveLastPosition(IFileParagraph fileParagraph,
            String downloadingFileName);

    /**
     * 创建一个新的位置并保存
     * @param fileParagraph
     * @param downloadingFileName
     */
    public void onSaveNewLastPositions(IFileParagraph[] fileParagraphs,
            String downloadingFileName);

}

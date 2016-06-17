package com.mobile.ledown.core.listener;

import com.mobile.ledown.core.file.IFileParagraph;

/**
 * 获取最后位置监听
 * @author yangn
 */
public interface onReadLastPositionListener {
    /**
     * 读取最后位置
     * @return
     */
    public IFileParagraph[] onReadLastPosition();
}

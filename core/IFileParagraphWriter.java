package com.mobile.ledown.core;

import java.io.Closeable;
import java.io.IOException;

public interface IFileParagraphWriter extends Closeable {
    void write(byte[] buffer, int offset, int count) throws IOException;

}

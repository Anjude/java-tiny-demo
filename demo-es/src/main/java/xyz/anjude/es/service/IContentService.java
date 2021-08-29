package xyz.anjude.es.service;

import java.io.IOException;

public interface IContentService  {
    /**
     * 内容获取并插入到es
     */
    boolean parseAndInsertES(String keyword)  throws IOException;
}

package com.taotao.content.service;

import com.taotao.common.pojo.EasyUiTreeResult;

import java.util.List;

public interface ContentCategoryService {
    public List<EasyUiTreeResult> getContentCateroryList(long parentId);
}

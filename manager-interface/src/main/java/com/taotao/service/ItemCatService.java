package com.taotao.service;

import com.taotao.common.pojo.EasyUiTreeResult;

import java.util.List;

public interface ItemCatService {
    public List<EasyUiTreeResult> getItemCatTree( long parentId);
}

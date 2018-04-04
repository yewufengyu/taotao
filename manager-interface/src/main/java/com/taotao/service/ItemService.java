package com.taotao.service;

import com.taotao.pojo.TbItem;
import com.taotao.common.pojo.EasyUiDatagridResult;
public interface ItemService {
    TbItem getItemById(long itemId);

   EasyUiDatagridResult getItemList( Integer page, Integer rows );
}

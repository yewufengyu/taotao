package com.taotao.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.common.pojo.EasyUiDatagridResult;
import com.taotao.service.ItemService;
import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {


    @Autowired
    private TbItemMapper tbItemMapper;

    @Override
    public TbItem getItemById( long itemId ) {
        return tbItemMapper.selectByPrimaryKey(itemId);
    }

    @Override
    public EasyUiDatagridResult getItemList( Integer page, Integer rows ) {
        PageHelper.startPage(page,rows);
        TbItemExample tbItemExample = new TbItemExample();
        List<TbItem> list = tbItemMapper.selectByExample(tbItemExample);
        PageInfo<TbItem> pageInfo = new PageInfo(list);
        EasyUiDatagridResult result = new EasyUiDatagridResult();
        result.setRows(list);
        result.setTotal(pageInfo.getTotal());
        return result;
    }
}

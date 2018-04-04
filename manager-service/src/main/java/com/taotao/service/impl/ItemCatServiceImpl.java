package com.taotao.service.impl;

import com.taotao.common.pojo.EasyUiTreeResult;
import com.taotao.mapper.TbItemCatMapper;
import com.taotao.pojo.TbItemCat;
import com.taotao.pojo.TbItemCatExample;
import com.taotao.pojo.TbItemCatExample.Criteria;
import com.taotao.service.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemCatServiceImpl implements ItemCatService {
    @Autowired
    TbItemCatMapper tbItemCatMapper;
    @Override
    public List<EasyUiTreeResult> getItemCatTree( long parentId) {

        TbItemCatExample example = new TbItemCatExample();
       Criteria criteria = example.createCriteria();
        criteria.andParentIdEqualTo(parentId);
        List<TbItemCat> list = tbItemCatMapper.selectByExample(example);
        List<EasyUiTreeResult> listNode = new ArrayList<EasyUiTreeResult>();
        for(TbItemCat itemCat : list){
            EasyUiTreeResult node = new EasyUiTreeResult();
            node.setId(itemCat.getId());
            node.setText(itemCat.getName());
            node.setState(itemCat.getIsParent()?"closed":"open");
            listNode.add(node);
        }

        return listNode;
    }
}

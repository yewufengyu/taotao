package com.taotao.content.service.impl;

import com.taotao.common.pojo.EasyUiTreeResult;
import com.taotao.content.service.ContentCategoryService;
import com.taotao.mapper.TbContentCategoryMapper;
import com.taotao.pojo.TbContentCategory;
import com.taotao.pojo.TbContentCategoryExample;
import com.taotao.pojo.TbContentCategoryExample.Criteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContentCategoryServiceImpl implements ContentCategoryService {
    @Autowired
    TbContentCategoryMapper tbContentCategoryMapper;
    @Override
    public List<EasyUiTreeResult> getContentCateroryList(long parentId) {
        TbContentCategoryExample example = new TbContentCategoryExample();
        Criteria criteria = example.createCriteria();
        criteria.andParentIdEqualTo(parentId);
       List<TbContentCategory> tbContentCategorys =  tbContentCategoryMapper.selectByExample(example);
       List<EasyUiTreeResult> easyUiTreeResults = new ArrayList<>();
       for(TbContentCategory TbContentCategory:tbContentCategorys){
           EasyUiTreeResult treeNode = new EasyUiTreeResult();
           treeNode.setState(TbContentCategory.getIsParent()?"closed":"open");
           treeNode.setId(TbContentCategory.getId());
           treeNode.setText(TbContentCategory.getName());
           easyUiTreeResults.add(treeNode);
       }
        return easyUiTreeResults;
    }
}

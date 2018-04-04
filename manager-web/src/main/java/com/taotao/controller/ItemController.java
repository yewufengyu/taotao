package com.taotao.controller;

import com.taotao.common.pojo.EasyUiDatagridResult;
import com.taotao.pojo.TbItem;
import com.taotao.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ItemController  {
    @Autowired
    private ItemService itemService;
    @RequestMapping(value="/item/{itemId}")
    @ResponseBody
    public TbItem getItemById(@PathVariable Long itemId){
        if(itemId ==null){
            return null;
        }
        System.out.println(itemId+"====");
        TbItem item=itemService.getItemById(itemId);
        return item;
    }

    @RequestMapping("/item/list")
    @ResponseBody
    public EasyUiDatagridResult getItemList(Integer page,Integer rows){
        EasyUiDatagridResult result = itemService.getItemList(page,rows);

        return result;
    }
}

package com.taotao.controller;

import com.taotao.common.pojo.EasyUiTreeResult;
import com.taotao.service.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ItemCatController {
    @Autowired
    private ItemCatService itemCatService;
    @RequestMapping("/item/cat/list")
    @ResponseBody
    public List<EasyUiTreeResult> getItemCatTree(@RequestParam(name = "id",defaultValue = "0") long parentId){
        return itemCatService.getItemCatTree(parentId);

    }
}

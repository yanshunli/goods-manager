package com.ysl.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ysl.entity.Goods;
import com.ysl.service.GdsService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/gds")
public class goodsController {

    @Reference
    private GdsService gdsService;

    @RequestMapping("/goodsList")
    public String goodsList(Model model){
        List<Goods> list1=gdsService.list();
        model.addAttribute("gdsl",list1);
        return "goodslist";
    }
}

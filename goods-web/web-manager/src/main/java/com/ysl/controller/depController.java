package com.ysl.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ysl.entity.Depository;
import com.ysl.service.DepService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/dep")
public class depController {
    @Reference
    private DepService depService;

    @RequestMapping("/list")
    public String list(Model model){
        List<Depository> list=depService.list();
        model.addAttribute("deps",list);
        return "deplist";
    }
}

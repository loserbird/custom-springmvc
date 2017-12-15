package com.loserbird.mvc.controller;

import com.loserbird.mvc.annotation.Autowired;
import com.loserbird.mvc.annotation.Controller;
import com.loserbird.mvc.annotation.RequestMapping;
import com.loserbird.mvc.annotation.RequestParam;
import com.loserbird.mvc.service.ModifyService;
import com.loserbird.mvc.service.QueryService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: bingqin
 * @Date: 2017/12/15
 * @Description:
 **/
@Controller
@RequestMapping("/web")
public class WebController {
    @Autowired("myQueryService")
    private QueryService queryService;
    @Autowired
    private ModifyService modifyService;

    @RequestMapping("/search")
    public void search(@RequestParam("name") String name, HttpServletRequest request, HttpServletResponse response) {
        String result = queryService.search(name);
        out(response, result);
    }

    @RequestMapping("/add")
    public void add(@RequestParam("name") String name,
                    @RequestParam("addr") String addr,
                    HttpServletRequest request, HttpServletResponse response) {
        String result = modifyService.add(name, addr);
        out(response, result);
    }

    @RequestMapping("/remove")
    public void remove(@RequestParam("name") Integer id,
                       HttpServletRequest request, HttpServletResponse response) {
        String result = modifyService.remove(id);
        out(response, result);
    }


    @RequestMapping("/update")
    public void update(String name, boolean flag,
                       HttpServletRequest request, HttpServletResponse response) {
        out(response, "我是name：" + name + "flag为：" + flag);
    }

    private void out(HttpServletResponse response, String str) {
        try {
            response.setContentType("application/json;charset=utf-8");
            response.getWriter().print(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

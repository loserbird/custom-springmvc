package com.loserbird.mvc.service.impl;

import com.loserbird.mvc.annotation.Service;
import com.loserbird.mvc.service.ModifyService;

/**
 * @Author: bingqin
 * @Date: 2017/12/15
 * @Description:
 **/
@Service
public class ModifyServiceImpl implements ModifyService {
    @Override
    public String add(String name, String addr) {
        return "invoke add name = " + name + " addr = " + addr;
    }

    @Override
    public String remove(Integer id) {
        return "remove id = " + id;
    }
}

package com.loserbird.mvc.service.impl;

import com.loserbird.mvc.annotation.Service;
import com.loserbird.mvc.service.QueryService;

/**
 * @Author: bingqin
 * @Date: 2017/12/15
 * @Description:
 **/
@Service("myQueryService")
public class QueryServiceImpl implements QueryService{

    @Override
    public String search(String name) {
        return "invoke search name= "+name;
    }
}

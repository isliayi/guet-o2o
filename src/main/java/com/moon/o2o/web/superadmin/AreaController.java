package com.moon.o2o.web.superadmin;

import com.moon.o2o.entity.Area;
import com.moon.o2o.service.AreaService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/superadmin")
public class AreaController {
    @Resource
    private AreaService areaService;

    @GetMapping(value = "/listarea")
    @ResponseBody
    private Map<String,Object> listArea(){
        Map<String ,Object> modelMap=new HashMap<>();
        List<Area> list;
        try {
            list=areaService.getAreaList();
            modelMap.put("rows",list);
            modelMap.put("size",list.size());
        }catch (Exception e){
            e.printStackTrace();
            modelMap.put("success",false);
            modelMap.put("errMsg",e.toString());
        }
        return modelMap;
    }
}

package com.moon.o2o.service.impl;

import com.moon.o2o.BaseTest;
import com.moon.o2o.entity.Area;
import com.moon.o2o.service.AreaService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

import static org.junit.Assert.*;

/**
 * 配置spring和junit整合，junit启动时加载springIOC容器
 */
public class AreaServiceTest extends BaseTest {

    @Resource
    private AreaService areaService;

    @Test
    public void getAreaList() {
        List<Area> areaList=areaService.getAreaList();
        assertEquals("东苑",areaList.get(0).getAreaName());
    }
}
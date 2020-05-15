package com.moon.o2o.dao;

import com.moon.o2o.BaseTest;
import com.moon.o2o.entity.Area;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.List;

import static org.junit.Assert.*;

public class AreaDaoTest extends BaseTest {

    @Resource
    private AreaDao areaDao;

    @Test
    public void queryArea() {
        List<Area> areas=areaDao.queryArea();
        assertEquals(4,areas.size());
    }
}
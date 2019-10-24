package org.PersonnelManagementSystem.service;

import org.PersonnelManagementSystem.bean.Menu;
import org.PersonnelManagementSystem.mapper.MenuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import springfox.documentation.annotations.Cacheable;

import java.util.List;

/**
 * @program: PersonnelManagementSystem
 * @description: Menu Service
 * @author: Ronglin.A
 * @create: 2019-10-21 15:54
 */
@Service
@Transactional
@CacheConfig(cacheNames = "menu_cache")
public class MenuService {
    @Autowired
    MenuMapper menuMapper;
    //@Cacheable(key = "#root.methodName")
    public List<Menu> getAllMenu(){
        return menuMapper.getAllMenu();
    }
}
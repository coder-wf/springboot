package com.wyt.springboot.service.impl;
 
import java.util.List;

import com.wyt.springboot.mapper.HeroMapper;
import com.wyt.springboot.pojo.Hero;
import com.wyt.springboot.service.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HeroServiceImpl implements HeroService {
     
    @Autowired(required = false)
    HeroMapper heroMapper;
 
    @Override
    public int add(Hero hero) {
        return heroMapper.add(hero);
    }
 
    @Override
    public void delete(int id) {
        heroMapper.delete(id);
    }
 
    @Override
    public Hero get(int id) {
        return heroMapper.get(id);
    }
 
    @Override
    public int update(Hero hero) {
        return heroMapper.update(hero);
    }
 
    @Override
    public List<Hero> list() {
        return heroMapper.list();
    }
 
}
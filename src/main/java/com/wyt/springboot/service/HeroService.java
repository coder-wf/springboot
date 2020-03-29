package com.wyt.springboot.service;
 
import com.wyt.springboot.pojo.Hero;

import java.util.List;

public interface HeroService {
    public int add(Hero hero);
     
    public void delete(int id);
         
    public Hero get(int id);
       
    public int update(Hero hero); 
         
    public List<Hero> list();
}
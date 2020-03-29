package com.wyt.springboot.mapper;
  
import java.util.List;

import com.wyt.springboot.pojo.Hero;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HeroMapper {
    public int add(Hero hero);
     
    public void delete(int id);
         
    public Hero get(int id);
       
    public int update(Hero hero); 
         
    public List<Hero> list();
}
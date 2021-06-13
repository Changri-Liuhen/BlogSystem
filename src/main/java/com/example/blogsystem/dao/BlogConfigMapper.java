package com.example.blogsystem.dao;

import com.example.blogsystem.entity.BlogConfig;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface BlogConfigMapper {
    List<BlogConfig> selectAll();

    BlogConfig selectByPrimaryKey(String configName);

    int updateByPrimaryKeySelective(BlogConfig record);

}
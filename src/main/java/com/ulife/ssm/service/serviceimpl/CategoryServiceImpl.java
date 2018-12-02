package com.ulife.ssm.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ulife.ssm.mapper.CategoryMapper;
import com.ulife.ssm.pojo.Category;
import com.ulife.ssm.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryMapper categoryMapper;


    public List<Category> list() {
        return categoryMapper.list();
    }


}

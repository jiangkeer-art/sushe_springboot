package com.dormitory_springboot.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dormitory_springboot.entity.Building;
import com.dormitory_springboot.form.SearchForm;
import com.dormitory_springboot.vo.PageVO;

public interface BuildingService extends IService<Building> {
    public PageVO list(Integer page, Integer size);

    public PageVO search(SearchForm searchForm);

    public Boolean deleteById(Integer id);
}

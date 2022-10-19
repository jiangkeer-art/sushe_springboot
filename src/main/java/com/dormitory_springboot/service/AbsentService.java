package com.dormitory_springboot.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dormitory_springboot.entity.Absent;
import com.dormitory_springboot.form.SearchForm;
import com.dormitory_springboot.vo.PageVO;


public interface AbsentService extends IService<Absent> {
    public PageVO list(Integer page, Integer size);

    public PageVO search(SearchForm searchForm);
}

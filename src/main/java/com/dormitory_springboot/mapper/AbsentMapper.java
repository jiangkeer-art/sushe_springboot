package com.dormitory_springboot.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dormitory_springboot.entity.Absent;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository
@Mapper
public interface AbsentMapper extends BaseMapper<Absent> {

}

package com.dormitory_springboot.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dormitory_springboot.entity.Moveout;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Mapper
@Repository
public interface MoveoutMapper extends BaseMapper<Moveout> {

}

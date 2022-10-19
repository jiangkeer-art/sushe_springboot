package com.dormitory_springboot.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dormitory_springboot.entity.SystemAdmin;
import com.dormitory_springboot.form.RuleForm;
import com.dormitory_springboot.vo.ResultVO;


public interface SystemAdminService extends IService<SystemAdmin> {
    public ResultVO login(RuleForm ruleForm);
}

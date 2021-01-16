package com.example.provider.service;

import com.example.base.pojo.UserInfoDTO;
import com.example.base.pojo.UserInfoVO;
import com.example.base.service.UserInfoService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Service
@Component
public class UserInfoServiceImpl implements UserInfoService {

    @Override
    public UserInfoVO getUserInfo(UserInfoDTO dto) {

        UserInfoVO vo = new UserInfoVO();
        vo.setId(dto.getId());
        vo.setAge(dto.getAge());
        vo.setName(dto.getName());
        vo.setAddress("清华大学");
        return vo;
    }

    @Override
    public UserInfoVO getUserInfoById(Long id) {
        UserInfoVO vo = new UserInfoVO();
        vo.setId(id);
        vo.setAge(20);
        vo.setName("小明");
        vo.setAddress("北京大学");
        return vo;
    }
}

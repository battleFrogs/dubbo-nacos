package com.example.consumer.controller;

import com.example.base.pojo.UserInfoDTO;
import com.example.base.pojo.UserInfoVO;
import com.example.base.service.UserInfoService;
import com.example.consumer.pojo.UserInfoParam;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserInfoController {

    //忽略启动校验，与@Service配合
    @Reference
    private UserInfoService userInfoService;


    @RequestMapping("/getUserInfoById")
    public UserInfoVO getUserInfoById(Long id){

        return userInfoService.getUserInfoById(id);
    }

    @RequestMapping("/getUserInfo")
    public UserInfoVO getUserInfo(UserInfoParam userInfoParam){

        UserInfoDTO dto = new UserInfoDTO();
        dto.setId(userInfoParam.getId());
        dto.setName(userInfoParam.getName());
        dto.setAge(userInfoParam.getAge());
        return userInfoService.getUserInfo(dto);
    }


}

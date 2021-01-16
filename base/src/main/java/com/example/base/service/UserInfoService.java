package com.example.base.service;


import com.example.base.pojo.UserInfoDTO;
import com.example.base.pojo.UserInfoVO;

public interface UserInfoService {

    public UserInfoVO getUserInfo(UserInfoDTO dto);

    public UserInfoVO getUserInfoById(Long id);


}

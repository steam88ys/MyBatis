package kr.hs.study.MyBatis.service;

import kr.hs.study.MyBatis.dto.UserDTO;
import kr.hs.study.MyBatis.mapper.myUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class myUserServiceImpl implements myUserService{
    @Autowired
    private myUserMapper mapper;

    @Override
    public void insert(UserDTO dto) {
        mapper.insert(dto);
    }
}

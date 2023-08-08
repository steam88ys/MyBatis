package kr.hs.study.MyBatis.service;

import kr.hs.study.MyBatis.dto.UserDTO;

import java.util.List;

public interface myUserService {
    public void insert(UserDTO dto);
    public void delete(String id);

    public List<UserDTO> listAll();
}

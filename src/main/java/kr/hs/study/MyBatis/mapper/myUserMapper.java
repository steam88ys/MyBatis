package kr.hs.study.MyBatis.mapper;

import kr.hs.study.MyBatis.dto.UserDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface myUserMapper {
    public void insert(UserDTO dto);
    public void delete(String id);
    public List<UserDTO> listAll();
}

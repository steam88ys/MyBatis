package kr.hs.study.MyBatis.mapper;

import kr.hs.study.MyBatis.dto.UserDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface myUserMapper {
    public void insert(UserDTO dto);
}

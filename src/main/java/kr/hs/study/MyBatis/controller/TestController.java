package kr.hs.study.MyBatis.controller;

import kr.hs.study.MyBatis.dto.UserDTO;
import kr.hs.study.MyBatis.service.myUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TestController {
    @Autowired
    private myUserService service;

    @GetMapping("/add")
    public String register() {
        return "register";
    }

    @PostMapping("/add_done")
    public String add_done(UserDTO dto) {
        service.insert(dto);
        return "result";
    }
}

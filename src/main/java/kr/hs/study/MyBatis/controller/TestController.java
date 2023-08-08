package kr.hs.study.MyBatis.controller;

import kr.hs.study.MyBatis.dto.UserDTO;
import kr.hs.study.MyBatis.service.myUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class TestController {
    @Autowired
    private myUserService service;

    @GetMapping("/list")
    public String list(Model model) {
        List<UserDTO> list = service.listAll();
        model.addAttribute("list1", list);
        return "list";
    }

    @GetMapping("/add")
    public String register() {
        return "register";
    }

    @PostMapping("/add_done")
    public String add_done(UserDTO dto) {
        service.insert(dto);
        return "redirect:/list";
    }

    @GetMapping("/delete/{id}")
    public String delete(String id) {
        service.delete(id);
        return "result";
    }
}

package net.daum.controller;

import lombok.RequiredArgsConstructor;
import net.daum.service.UserAddrService;
import net.daum.vo.UserAddrVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequiredArgsConstructor
public class UserAddrController {

    private final UserAddrService userAddrService;

    @RequestMapping(value = "/mybatis_jpa", method = RequestMethod.GET)
    public void myBatisJPA(Model model) {
        // void : 매핑주소 -> 뷰페이지 파일명 (/WEB/INF/views/mybatis_jpa.jsp)

        model.addAttribute("content_title", "mybatis_jpa 이름,주소,폼 연동연습");
    }

    @PostMapping("/mybatis_jpa")
    public ModelAndView myBatisJPA(@ModelAttribute UserAddrVO userAddr){
        System.out.println(userAddr);
        UserAddrVO userAddrVO = userAddrService.insertUserAddr(userAddr);

        return new ModelAndView("addr_ok")
                     .addObject("user", userAddrVO);
    }
}
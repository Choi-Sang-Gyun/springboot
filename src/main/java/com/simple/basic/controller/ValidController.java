package com.simple.basic.controller;


import com.simple.basic.command.DemoVO;
import com.simple.basic.command.ValidVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/valid")
public class ValidController {

    @GetMapping("/view")
    public String view() {
        return "valid/view";
    }

    @GetMapping("/result")
    public String result() {
        return "valid/result";
    }

    //가입요청
    @PostMapping("/joinForm")
    public String joinForm(@Valid @ModelAttribute("vo") ValidVO vo, BindingResult result, Model model) {
        //유효성 검사를 진행하고, 실패한 목록을 bindingresult에 담아줍니다

//        if(result.hasErrors()) { //유효성 검사에 실패하면 true
//            List<FieldError> list = result.getFieldErrors();
//            //에러목록 , 실패 목록
//
//            for(FieldError err : list) {
//                System.out.println(err.getField()); // 실패한 필드명을 볼 수 있게 된다
//                System.out.println(err.getDefaultMessage()); //실패한 필드의 메세지
//                model.addAttribute("valid_" + err.getField(), err.getDefaultMessage());
//            }
//
//            return "valid/view";
//        }

        //2nd
        if(result.hasErrors()) {
            return "valid/view";
        }

        //처리
        return "redirect:/valid/result";
    }

    @GetMapping("/quiz01")
    public String quiz01() {
        return "valid/quiz01";
    }

    @GetMapping("/quiz01_result")
    public String quiz01_result() {
        return "valid/quiz01_result";
    }

    @PostMapping("/loginForm")
    public String loginForm(@Valid @ModelAttribute("vo") DemoVO vo, BindingResult result, Model model) {
        //유효성 검사를 진행하고, 실패한 목록을 bindingresult에 담아줍니다
        if(result.hasErrors()) {
            return "valid/quiz01";
        }

        //처리
        return "redirect:/valid/quiz01_result";
    }



}

package com.xxxx.crm.controller;

 import com.xxxx.crm.base.BaseController;
 import org.springframework.stereotype.Controller;
 import org.springframework.web.bind.annotation.RequestMapping;


@Controller
 public class IndexController extends BaseController {
            public String index(){
            return "index";
          }

            // 系统界面欢迎页
          @RequestMapping("welcome")
            public String welcome(){
            return "welcome";
          }

          @RequestMapping("main")
          String main(){
            return "main";
          }
 }

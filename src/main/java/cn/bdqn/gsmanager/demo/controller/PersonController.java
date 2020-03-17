package cn.bdqn.gsmanager.demo.controller;


import cn.bdqn.gsmanager.demo.entity.Person;
import cn.bdqn.gsmanager.demo.service.IPersonService;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wubing
 * @since 2019-12-06
 */
@Controller
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private IPersonService iPersonService;

        @RequestMapping("/select")
        public String select(HttpSession session, Model model){
            List<Person> personList = iPersonService.list();
            model.addAttribute("personList",personList);
            return "index";
        }
         /* @RequestMapping("/insert")
           public String insert(){
            return "insert";
     }*/
        @RequestMapping("/add")
        public String add(Person person){
            return "insert";
        }

        @RequestMapping("/in")
        public String insert(Person person){
            person.setId(21);
             iPersonService.save(person);

            return "redirect:select";
        }

        @RequestMapping("/delete")
        public String delete(Integer id){
            boolean b = iPersonService.removeById(id);
            return "redirect:select";
        }
}

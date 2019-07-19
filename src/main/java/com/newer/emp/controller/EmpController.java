package com.newer.emp.controller;

import com.newer.emp.domain.Emp;
import com.newer.emp.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@ResponseBody
public class EmpController {
    @Autowired
    private EmpService empService;
    //sdfjsdfklss
    @RequestMapping("addEmp")
    public int addEmp(Emp emp){
        return empService.addEmp(emp);
    }

    @RequestMapping("select")
    public List<Emp> select(String ename){
        return empService.select(ename);
    }
}

package com.newer.emp.controller;


import com.newer.emp.domain.Emp;
import com.newer.emp.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class EmpController {
    @Autowired
    private EmpService empService;

    @RequestMapping("saveMenu")
    public ResponseEntity<?> saveMenu(Emp emp) {
        int fluRows = 0;
        fluRows = empService.updateemp(emp);
        return new ResponseEntity<>(fluRows, HttpStatus.OK);
    }

    @RequestMapping("uppParentMenu")
    public  ResponseEntity<?>  uppParentMenu(@RequestParam("empno")Integer empno ){
        Emp menusList = empService.selebemp(empno);
        if(menusList==null){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(menusList,HttpStatus.OK);
    }

}

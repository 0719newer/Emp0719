package com.newer.emp.service;

import com.newer.emp.domain.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpService {
    @Autowired
    private EmpService empService;

    public Emp selebemp(Integer empno){
        return  empService.selebemp(empno);
    }

    public int updateemp(Emp emp){
        return empService.updateemp(emp) ;

    }

}

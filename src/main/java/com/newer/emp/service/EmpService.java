package com.newer.emp.service;

import com.newer.emp.domain.Emp;
import com.newer.emp.mapper.EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmpService {
    @Autowired
    private EmpMapper empMapper;

    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,rollbackFor = Exception.class)
    public int addEmp(Emp emp){
        return empMapper.addEmp(emp);
    }
}

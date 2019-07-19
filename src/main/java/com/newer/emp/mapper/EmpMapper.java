package com.newer.emp.mapper;

import com.newer.emp.domain.Emp;
import org.apache.ibatis.annotations.Insert;

public interface EmpMapper {
    @Insert("insert into newemp values(#{empno},#{ename},#{job},#{mgr},#{hiredate},#{sal},#{comm},#{deptno})")
    public int addEmp(Emp emp);
}

package com.newer.emp.mapper;

import com.newer.emp.domain.Emp;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpMapper {
    @Update("update emp set ename=#{ename},job=#{job},mgr=#{mgr},hiredata=#{hiredata},sal=#{sal},comm=#{comm},deptno=#{deptno}")
    int updateemp(Emp emp);
    @Select("select * from emp where empno=#{empno}")
    Emp selebemp(Integer empno);
}

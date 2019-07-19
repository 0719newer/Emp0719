package com.newer.emp.mapper;

import com.newer.emp.domain.Emp;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface EmpMapper {
    @Insert("insert into newemp values(#{empno},#{ename},#{job},#{mgr},#{hiredate},#{sal},#{comm},#{deptno})")
    public int addEmp(Emp emp);

    @Select("select * from newemp where empno=#{empno}")
    Emp selebemp(Integer empno);

    @Select("select * from newemp")
    public List<Emp> queryAll();

    @Delete("delete from newemp where empno =#{empno}")
    public int delete(@Param("empno")int empno);

    @Update("update newemp set ename=#{ename},job=#{job},mgr=#{mgr},hiredate=#{hiredate},sal=#{sal},comm=#{comm},deptno=#{deptno} where empno=#{empno}")
    int updateemp(Emp emp);
}

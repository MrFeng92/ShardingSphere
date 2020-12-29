package com.feng.shardingjdbc;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.feng.shardingjdbc.entity.Course;
import com.feng.shardingjdbc.mapper.CourseMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShardingjdbcApplicationTests
{
    //注入mapper
    @Autowired
    private CourseMapper courseMapper;

    //=======================测试水平分表===================
    //添加课程的方法
    @Test
    public void addCourse()
    {
        for (int i = 1; i <= 10; i++)
        {
            Course course = new Course();
            course.setCname("java" + i);
            course.setUserId(100L);
            course.setCstatus("Normal" + i);
            courseMapper.insert(course);
        }
    }

    //查询课程的方法
    @Test
    public void findCourse()
    {
        QueryWrapper<Course> wrapper = new QueryWrapper<>();
        wrapper.eq("cid", 550826267901952001L);
        Course course = courseMapper.selectOne(wrapper);
        System.out.println(course);
    }
}

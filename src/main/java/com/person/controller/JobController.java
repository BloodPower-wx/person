package com.person.controller;

import com.person.entity.Job;
import com.person.service.JobService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Job)表控制层
 *
 * @author makejava
 * @since 2020-05-14 16:06:03
 */
@RestController
@RequestMapping("job")
public class JobController {
    /**
     * 服务对象
     */
    @Resource
    private JobService jobService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Job selectOne(Integer id) {
        return this.jobService.queryById(id);
    }

}
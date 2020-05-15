package com.person.controller;

import com.person.entity.Notice;
import com.person.service.NoticeService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Notice)表控制层
 *
 * @author makejava
 * @since 2020-05-14 16:06:03
 */
@RestController
@RequestMapping("notice")
public class NoticeController {
    /**
     * 服务对象
     */
    @Resource
    private NoticeService noticeService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Notice selectOne(Integer id) {
        return this.noticeService.queryById(id);
    }

}
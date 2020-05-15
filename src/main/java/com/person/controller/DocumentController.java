package com.person.controller;

import com.person.entity.Document;
import com.person.service.DocumentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Document)表控制层
 *
 * @author makejava
 * @since 2020-05-14 16:06:03
 */
@RestController
@RequestMapping("document")
public class DocumentController {
    /**
     * 服务对象
     */
    @Resource
    private DocumentService documentService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Document selectOne(Integer id) {
        return this.documentService.queryById(id);
    }

}
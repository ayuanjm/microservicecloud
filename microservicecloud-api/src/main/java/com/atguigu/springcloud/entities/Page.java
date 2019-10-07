package com.atguigu.springcloud.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
public class Page {
    /**
     * 默认当前页
     */
    private Integer currPage = 1;
    /*页码*/
    private Integer pageNum = 0;
    /**
     * 每页显示数量
     */
    private Integer pageSize = 10;
    /**
     * 返回总记录数
     */
    private Integer total = 0;
    /**
     * 返回总页数
     */
    private Integer totalPage;

    /**
     * 数据集合
     */
    private List<?> rows;

    private Boolean success;

}

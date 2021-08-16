package com.liuji.mall.common.api;

import com.github.pagehelper.PageInfo;

import java.util.List;

public class CommonPage<T> {
    private Integer pageNum;
    private Integer totalPages;
    private Integer pageSize;
    private Long total;
    private List<T> list;

    public CommonPage(Integer pageNum, Integer totalPages, Integer pageSize, Long total, List<T> list) {
        this.pageNum = pageNum;
        this.totalPages = totalPages;
        this.pageSize = pageSize;
        this.total = total;
        this.list = list;
    }

    public CommonPage() {
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public static <T> CommonPage<T> restPage(List<T> list) {
        CommonPage<T> result = new CommonPage<>();
        PageInfo<T> pageInfo = new PageInfo<>(list);
        result.setList(pageInfo.getList());
        result.setPageNum(pageInfo.getPageNum());
        result.setPageSize(pageInfo.getPageSize());
        result.setTotal(pageInfo.getTotal());
        result.setTotalPages(pageInfo.getPages());
        return result;
    }
}

package com.example.blogsystem.service;

import com.example.blogsystem.entity.BlogLink;
import com.example.blogsystem.util.PageQueryUtil;
import com.example.blogsystem.util.PageResult;

import java.util.List;
import java.util.Map;

public interface LinkService {
    /**
     * 查询链接的分页数据
     *
     * @param pageUtil
     * @return
     */
    PageResult getBlogLinkPage(PageQueryUtil pageUtil);

    int getTotalLinks();

    Boolean saveLink(BlogLink link);

    BlogLink selectById(Integer id);

    Boolean updateLink(BlogLink tempLink);

    Boolean deleteBatch(Integer[] ids);

    /**
     * 返回链接页面所需的所有数据
     *
     * @return
     */
    Map<Byte, List<BlogLink>> getLinksForLinkPage();
}
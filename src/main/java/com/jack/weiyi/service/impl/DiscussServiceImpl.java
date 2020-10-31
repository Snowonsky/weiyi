package com.jack.weiyi.service.impl;

import com.jack.weiyi.entity.DiscussPost;
import com.jack.weiyi.mapper.DiscussPostMapper;
import com.jack.weiyi.service.DiscussService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Description:
 * @Create: 2020-10-31-13:03
 * @Author:
 */
public class DiscussServiceImpl implements DiscussService {

    @Autowired
    private DiscussPostMapper discussPostMapper;

    @Override
    public List<DiscussPost> findDiscussPosts(int userId, int offset, int limit) {
        return discussPostMapper.selectDiscussPosts(userId, offset, limit);
    }

    @Override
    public int findDiscussPostRows(int userId) {
        return discussPostMapper.selectDiscussPostRows(userId);
    }
}

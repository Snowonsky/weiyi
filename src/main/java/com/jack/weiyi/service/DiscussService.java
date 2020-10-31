package com.jack.weiyi.service;

import com.jack.weiyi.entity.DiscussPost;

import java.util.List;

public interface DiscussService {
    List<DiscussPost> findDiscussPosts(int userId, int offset, int limit);
    int findDiscussPostRows(int userId);

}

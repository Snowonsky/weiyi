package com.jack.weiyi.mapper;

import com.jack.weiyi.entity.DiscussPost;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DiscussPostMapper {

    /**
     * @param userId 用户主页使用,如果是0就查询全部，动态sql
     * @param offset 起始行行号
     * @param limit 每页多少条数据
     * @return 查询首页动态
     */
    List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit);

    /**
     * 如果需要动态拼接条件，并且方法有且只有一个参数，必须要使用@Param指定别名
     * @param userId
     * @return 查询帖子的行数
     */
    int selectDiscussPostRows(@Param("userId") int userId);


}

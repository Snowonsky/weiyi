package com.jack.weiyi;

import com.jack.weiyi.entity.DiscussPost;
import com.jack.weiyi.entity.User;
import com.jack.weiyi.mapper.DiscussPostMapper;
import com.jack.weiyi.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class WeiyiApplicationTests {

	@Autowired
	private UserMapper userMapper;
	@Autowired
	private DiscussPostMapper discussPostMapper;

	@Test
	void contextLoads() {
		User user = userMapper.selectById(101);
		System.out.println(user);
	}

	@Test
	void selectPost() {
		List<DiscussPost> discussPosts = discussPostMapper.selectDiscussPosts(149, 0, 10);
		for (DiscussPost post : discussPosts) {
			System.out.println(post);
		}

		int i = discussPostMapper.selectDiscussPostRows(149);
		System.out.println(i);


	}

}

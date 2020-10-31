package com.jack.weiyi.entity;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @Description:
 * @Create: 2020-10-31-12:33
 * @Author:
 */

@Data
public class DiscussPost {
    private int id;
    private int userId;
    private String title;
    private String content;
    private int type;
    private int status;
    private LocalDateTime createTime;
    private int commentCount;
    private double score;
}

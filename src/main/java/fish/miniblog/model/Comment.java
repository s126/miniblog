package fish.miniblog.model;

import java.util.Date;

/**
 * 评论
 */
public class Comment {
    private long id;               // 主键
    private String content;        // 评论内容
    private Post post;             // 所属微博
    private User poster;          // 评论者
    private Date create_time;     // 评论时间
}

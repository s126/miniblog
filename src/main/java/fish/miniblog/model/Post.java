package fish.miniblog.model;

import java.util.Date;

/**
 * 每条微博
 */
public class Post {
    private long id;            // 主键
    private String content;     // 内容
    private String pic_url;     // 图片
    private User user;          // 作者
    private Date create_time;  // 发布时间
    private Date update_time;  // 更新时间
}

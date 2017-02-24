package edu.nf.miniblog.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Post {

    @Id
    @GeneratedValue
    private long id;

    private String content;

    @ManyToOne
    private User author;




    private Date create_time;
    private Date update_time;

}

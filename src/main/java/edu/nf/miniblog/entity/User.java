package edu.nf.miniblog.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Account")
public class User {
    @Id
    @GeneratedValue
    private long id;


    private String name;
    private String password;
    private String email;

    private Date birthday;
    private int type;
    private int status;

    @OneToMany(mappedBy = "author")
    List<Post> posts = new ArrayList<>();


    @ManyToMany
    @JoinTable(name = "RELATIONSHIP",
            joinColumns = {@JoinColumn(name = "id")},
            inverseJoinColumns = {@JoinColumn(name = "fid")}
    )
    List<User> friends = new ArrayList<>();

    @ManyToMany(mappedBy = "friends")
    List<User> fans = new ArrayList<>();




    private Date create_time;
    private Date update_time;


}

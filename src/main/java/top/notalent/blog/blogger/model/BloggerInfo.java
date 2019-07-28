package top.notalent.blog.blogger.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * BloggerInfo
 * @author Roy Chen
 * 2019-07-28 11:04
 * @version 1.0
 **/
@Data
@Entity
@ToString
@Table(name = "blogger_info")
public class BloggerInfo implements Serializable {

    private static final long serialVersionUID = -7942749600322234580L;

    @Id
    @Column(name = "blogger_info_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bloggerInfoId;

    @Column(name = "nickname", nullable = false, unique = true)
    private String nickname;

    @Column(name = "gender", length = 2)
    private String gender;

    @Column(name = "head_portrait")
    private String headPortrait;

    @Column(name = "intro", length = 1000)
    private String intro;

    @Column(name = "email", unique = true, length = 64)
    private String email;

    @Column(name = "phone", unique = true, length = 11)
    private String phone;

    @Column(name = "create_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;

    @Column(name = "update_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateTime;

}

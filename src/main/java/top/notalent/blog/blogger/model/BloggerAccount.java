package top.notalent.blog.blogger.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * BloggerAccount
 * @author Roy Chen
 * 2019-07-28 10:41
 * @version 1.0
 **/
@Data
@Entity
@ToString
@NoArgsConstructor
@Table(name = "blogger_account")
public class BloggerAccount implements Serializable {

    private static final long serialVersionUID = -1167064099769448963L;

    @Id
    @Column(name = "blogger_account_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bloggerAccountId;

    @Column(name = "username", nullable = false, unique = true, length = 64)
    private String username;

    @Column(name = "password", nullable = false, length = 64)
    private String password;

    @Column(name = "salt", nullable = false, length = 64)
    private String salt;

    @Column(name = "create_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;

    @Column(name = "update_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateTime;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "blogger_info_id", referencedColumnName = "blogger_info_id")
    private BloggerInfo bloggerInfo;

    public BloggerAccount(String username, String password, String salt) {
        this.username = username;
        this.password = password;
        this.salt = salt;
    }

}

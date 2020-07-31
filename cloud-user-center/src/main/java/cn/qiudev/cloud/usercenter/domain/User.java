package cn.qiudev.cloud.usercenter.domain;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * @author qiuqiu
 */
@Entity
@Getter
@Setter
@Table(name = "t_uaac_user")
public class User extends BaseEntity {

    @Id
    @GeneratedValue(generator = "system-uuid", strategy = GenerationType.IDENTITY)
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String id;

    @Column(name = "name", length = 20)
    private String name;

    private String orgId;
}

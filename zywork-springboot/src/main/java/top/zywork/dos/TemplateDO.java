package top.zywork.dos;

import javax.persistence.*;

/**
 * 模板DO类<br />
 * 创建于2017-08-31
 *
 * @author 王振宇
 * @version 1.0
 *
 */
@Entity
@Table(name = "t_template")
public class TemplateDO extends BaseDO {

    private static final long serialVersionUID = -7900497534500297934L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "password")
    private String password;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

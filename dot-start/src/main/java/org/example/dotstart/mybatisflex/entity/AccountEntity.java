package org.example.dotstart.mybatisflex.entity;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Builder;
import lombok.experimental.Accessors;
import io.swagger.v3.oas.annotations.media.Schema;
import com.mybatisflex.annotation.Column;
import com.mybatisflex.annotation.Id;
import com.mybatisflex.annotation.KeyType;
import com.mybatisflex.annotation.Table;

import java.lang.Long;
import java.util.Date;
import java.lang.String;
import java.lang.Integer;

/**
 * 访问 实体类。
 *
 * @author wbb
 * @since 0.0.1
 */
@Accessors(chain = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(name = "访问")
@Table(value = "tb_account")
public class AccountEntity {

    /**
     * id
     */
    @Schema(description = "id")
    @Id(keyType = KeyType.Generator)
    private Long id;

    /**
     * 用户名
     */
    @Schema(description = "用户名")
    @Column(value = "user_name")
    private String userName;

    /**
     * 年龄
     */
    @Schema(description = "年龄")
    @Column(value = "age")
    private Integer age;

    /**
     * 生日
     */
    @Schema(description = "生日")
    @Column(value = "birthday")
    private Date birthday;

    /**
     * 逻辑删除
     */
    @Schema(description = "逻辑删除")
    @Column(value = "deleted")
    private String deleted;


}

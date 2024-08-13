package org.example.dotstart.mybatisflex.entity;

import com.mybatisflex.annotation.Id;
import com.mybatisflex.annotation.KeyType;
import com.mybatisflex.annotation.Table;
import java.io.Serializable;
import java.time.LocalDateTime;

import com.mybatisflex.core.keygen.KeyGenerators;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serial;

/**
 *  实体类。
 *
 * @author wbb
 * @since 2024-07-24
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "")
@Table(value = "tb_account")
public class AccountEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @Id(keyType=KeyType.Generator, value= KeyGenerators.snowFlakeId)
    @Schema(description = "id")
    private Integer id;

    /**
     * 用户名
     */
    @Schema(description = "用户名")
    private String userName;

    /**
     * 年龄
     */
    @Schema(description = "年龄")
    private Integer age;

    /**
     * 生日
     */
    @Schema(description = "生日")
    private LocalDateTime birthday;

    /**
     * 逻辑删除
     */
    @Schema(description = "逻辑删除")
    private String deleted;

}

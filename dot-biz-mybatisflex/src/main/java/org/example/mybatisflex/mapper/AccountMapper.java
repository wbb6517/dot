package org.example.mybatisflex.mapper;

import com.mybatisflex.core.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.example.mybatisflex.entity.AccountEntity;

/**
 * 访问 映射层。
 *
 * @author wbb
 * @since 0.0.1
 */
@Mapper
public interface AccountMapper extends BaseMapper<AccountEntity> {


}

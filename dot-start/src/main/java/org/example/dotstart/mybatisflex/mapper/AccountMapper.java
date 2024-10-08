package org.example.dotstart.mybatisflex.mapper;

import org.example.dotstart.mybatisflex.entity.AccountEntity;
import com.mybatisflex.core.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 访问 映射层。
 *
 * @author wbb
 * @since 0.0.1
 */
@Mapper
public interface AccountMapper extends BaseMapper<AccountEntity> {


}

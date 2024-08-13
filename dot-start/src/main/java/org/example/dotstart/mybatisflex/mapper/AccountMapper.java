package org.example.dotstart.mybatisflex.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.mybatisflex.core.BaseMapper;
import org.example.dotstart.mybatisflex.entity.AccountEntity;

/**
 *  映射层。
 *
 * @author wbb
 * @since 2024-07-24
 */
@Mapper
public interface AccountMapper extends BaseMapper<AccountEntity> {

}

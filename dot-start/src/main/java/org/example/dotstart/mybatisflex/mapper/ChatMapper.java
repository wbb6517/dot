package org.example.dotstart.mybatisflex.mapper;

import org.example.dotstart.mybatisflex.entity.ChatEntity;
import com.mybatisflex.core.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 聊天记录表 映射层。
 *
 * @author wbb
 * @since 0.0.1
 */
@Mapper
public interface ChatMapper extends BaseMapper<ChatEntity> {


}

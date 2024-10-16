package org.example.mybatisflex.mapper;

import com.mybatisflex.core.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.example.mybatisflex.entity.ArticleEntity;

/**
 * 文章推荐 映射层。
 *
 * @author wbb
 * @since 0.0.1
 */
@Mapper
public interface ArticleMapper extends BaseMapper<ArticleEntity> {


}

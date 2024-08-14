package org.example.dotstart.mybatisflex.mapper;

import org.example.dotstart.mybatisflex.entity.ArticleEntity;
import com.mybatisflex.core.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 文章推荐 映射层。
 *
 * @author wbb
 * @since 0.0.1
 */
@Mapper
public interface ArticleMapper extends BaseMapper<ArticleEntity> {


}

package org.example.dotstart.mybatisflex.service.impl;


import org.springframework.stereotype.Service;
import org.example.dotstart.mybatisflex.service.ArticleService;
import org.example.dotstart.mybatisflex.entity.ArticleEntity;
import org.example.dotstart.mybatisflex.mapper.ArticleMapper;
import com.mybatisflex.spring.service.impl.ServiceImpl;

/**
 * 文章推荐 服务层实现。
 *
 * @author wbb
 * @since 0.0.1
 */
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, ArticleEntity> implements ArticleService {

}
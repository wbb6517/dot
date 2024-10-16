package org.example.mybatisflex.service.impl;


import com.mybatisflex.spring.service.impl.ServiceImpl;
import org.example.mybatisflex.entity.ArticleEntity;
import org.example.mybatisflex.mapper.ArticleMapper;
import org.example.mybatisflex.service.ArticleService;
import org.springframework.stereotype.Service;

/**
 * 文章推荐 服务层实现。
 *
 * @author wbb
 * @since 0.0.1
 */
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, ArticleEntity> implements ArticleService {

}
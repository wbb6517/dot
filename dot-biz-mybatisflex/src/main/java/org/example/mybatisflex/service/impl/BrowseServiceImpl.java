package org.example.mybatisflex.service.impl;


import com.mybatisflex.spring.service.impl.ServiceImpl;
import org.example.mybatisflex.entity.BrowseEntity;
import org.example.mybatisflex.mapper.BrowseMapper;
import org.example.mybatisflex.service.BrowseService;
import org.springframework.stereotype.Service;

/**
 * 浏览信息表 服务层实现。
 *
 * @author wbb
 * @since 0.0.1
 */
@Service
public class BrowseServiceImpl extends ServiceImpl<BrowseMapper, BrowseEntity> implements BrowseService {

}
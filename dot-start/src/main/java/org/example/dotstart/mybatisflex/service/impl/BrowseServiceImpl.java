package org.example.dotstart.mybatisflex.service.impl;


import org.springframework.stereotype.Service;
import org.example.dotstart.mybatisflex.service.BrowseService;
import org.example.dotstart.mybatisflex.entity.BrowseEntity;
import org.example.dotstart.mybatisflex.mapper.BrowseMapper;
import com.mybatisflex.spring.service.impl.ServiceImpl;

/**
 * 浏览信息表 服务层实现。
 *
 * @author wbb
 * @since 0.0.1
 */
@Service
public class BrowseServiceImpl extends ServiceImpl<BrowseMapper, BrowseEntity> implements BrowseService {

}
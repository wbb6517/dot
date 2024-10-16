package org.example.mybatisflex.service.impl;


import com.mybatisflex.spring.service.impl.ServiceImpl;
import org.example.mybatisflex.entity.BlacklistEntity;
import org.example.mybatisflex.mapper.BlacklistMapper;
import org.example.mybatisflex.service.BlacklistService;
import org.springframework.stereotype.Service;

/**
 * 黑名单 服务层实现。
 *
 * @author wbb
 * @since 0.0.1
 */
@Service
public class BlacklistServiceImpl extends ServiceImpl<BlacklistMapper, BlacklistEntity> implements BlacklistService {

}
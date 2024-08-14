package org.example.dotstart.mybatisflex.service.impl;


import org.springframework.stereotype.Service;
import org.example.dotstart.mybatisflex.service.BlacklistService;
import org.example.dotstart.mybatisflex.entity.BlacklistEntity;
import org.example.dotstart.mybatisflex.mapper.BlacklistMapper;
import com.mybatisflex.spring.service.impl.ServiceImpl;

/**
 * 黑名单 服务层实现。
 *
 * @author wbb
 * @since 0.0.1
 */
@Service
public class BlacklistServiceImpl extends ServiceImpl<BlacklistMapper, BlacklistEntity> implements BlacklistService {

}
package org.example.mybatisflex.service.impl;


import com.mybatisflex.spring.service.impl.ServiceImpl;
import org.example.mybatisflex.entity.BannerEntity;
import org.example.mybatisflex.mapper.BannerMapper;
import org.example.mybatisflex.service.BannerService;
import org.springframework.stereotype.Service;

/**
 * Banner管理 服务层实现。
 *
 * @author wbb
 * @since 0.0.1
 */
@Service
public class BannerServiceImpl extends ServiceImpl<BannerMapper, BannerEntity> implements BannerService {

}
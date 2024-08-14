package org.example.dotstart.mybatisflex.service.impl;


import org.springframework.stereotype.Service;
import org.example.dotstart.mybatisflex.service.BannerService;
import org.example.dotstart.mybatisflex.entity.BannerEntity;
import org.example.dotstart.mybatisflex.mapper.BannerMapper;
import com.mybatisflex.spring.service.impl.ServiceImpl;

/**
 * Banner管理 服务层实现。
 *
 * @author wbb
 * @since 0.0.1
 */
@Service
public class BannerServiceImpl extends ServiceImpl<BannerMapper, BannerEntity> implements BannerService {

}
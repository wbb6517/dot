package org.example.dotstart.mybatisflex.service.impl;


import org.springframework.stereotype.Service;
import org.example.dotstart.mybatisflex.service.ComplaintService;
import org.example.dotstart.mybatisflex.entity.ComplaintEntity;
import org.example.dotstart.mybatisflex.mapper.ComplaintMapper;
import com.mybatisflex.spring.service.impl.ServiceImpl;

/**
 * 投诉信息表 服务层实现。
 *
 * @author wbb
 * @since 0.0.1
 */
@Service
public class ComplaintServiceImpl extends ServiceImpl<ComplaintMapper, ComplaintEntity> implements ComplaintService {

}
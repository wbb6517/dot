package org.example.mybatisflex.service.impl;


import com.mybatisflex.spring.service.impl.ServiceImpl;
import org.example.mybatisflex.entity.ComplaintEntity;
import org.example.mybatisflex.mapper.ComplaintMapper;
import org.example.mybatisflex.service.ComplaintService;
import org.springframework.stereotype.Service;

/**
 * 投诉信息表 服务层实现。
 *
 * @author wbb
 * @since 0.0.1
 */
@Service
public class ComplaintServiceImpl extends ServiceImpl<ComplaintMapper, ComplaintEntity> implements ComplaintService {

}
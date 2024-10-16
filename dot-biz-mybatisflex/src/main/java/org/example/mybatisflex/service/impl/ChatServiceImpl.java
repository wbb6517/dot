package org.example.mybatisflex.service.impl;


import com.mybatisflex.spring.service.impl.ServiceImpl;
import org.example.mybatisflex.entity.ChatEntity;
import org.example.mybatisflex.mapper.ChatMapper;
import org.example.mybatisflex.service.ChatService;
import org.springframework.stereotype.Service;

/**
 * 聊天记录表 服务层实现。
 *
 * @author wbb
 * @since 0.0.1
 */
@Service
public class ChatServiceImpl extends ServiceImpl<ChatMapper, ChatEntity> implements ChatService {

}
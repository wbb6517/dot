package org.example.dotstart.mybatisflex.service.impl;


import org.springframework.stereotype.Service;
import org.example.dotstart.mybatisflex.service.ChatService;
import org.example.dotstart.mybatisflex.entity.ChatEntity;
import org.example.dotstart.mybatisflex.mapper.ChatMapper;
import com.mybatisflex.spring.service.impl.ServiceImpl;

/**
 * 聊天记录表 服务层实现。
 *
 * @author wbb
 * @since 0.0.1
 */
@Service
public class ChatServiceImpl extends ServiceImpl<ChatMapper, ChatEntity> implements ChatService {

}
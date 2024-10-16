package org.example.mybatisflex.service.impl;


import com.mybatisflex.spring.service.impl.ServiceImpl;
import org.example.mybatisflex.entity.AccountEntity;
import org.example.mybatisflex.mapper.AccountMapper;
import org.example.mybatisflex.service.AccountService;
import org.springframework.stereotype.Service;

/**
 * 访问 服务层实现。
 *
 * @author wbb
 * @since 0.0.1
 */
@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, AccountEntity> implements AccountService {

}
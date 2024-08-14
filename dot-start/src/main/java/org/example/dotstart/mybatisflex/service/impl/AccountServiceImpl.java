package org.example.dotstart.mybatisflex.service.impl;


import org.springframework.stereotype.Service;
import org.example.dotstart.mybatisflex.service.AccountService;
import org.example.dotstart.mybatisflex.entity.AccountEntity;
import org.example.dotstart.mybatisflex.mapper.AccountMapper;
import com.mybatisflex.spring.service.impl.ServiceImpl;

/**
 * 访问 服务层实现。
 *
 * @author wbb
 * @since 0.0.1
 */
@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, AccountEntity> implements AccountService {

}
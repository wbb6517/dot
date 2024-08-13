package org.example.dotstart.mybatisflex.service.impl;

import com.mybatisflex.spring.service.impl.ServiceImpl;
import org.example.dotstart.mybatisflex.entity.AccountEntity;
import org.example.dotstart.mybatisflex.mapper.AccountMapper;
import org.example.dotstart.mybatisflex.service.AccountService;
import org.springframework.stereotype.Service;

/**
 *  服务层实现。
 *
 * @author wbb
 * @since 2024-07-24
 */
@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, AccountEntity> implements AccountService {

}

package org.example.dotstart.mybatisflex;

import com.mybatisflex.core.query.QueryCondition;
import com.mybatisflex.core.query.QueryWrapper;
import com.mybatisflex.core.update.UpdateWrapper;
import com.mybatisflex.core.util.UpdateEntity;
import org.example.dotstart.mybatisflex.entity.AccountEntity;
import org.example.dotstart.mybatisflex.mapper.AccountMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.example.dotstart.mybatisflex.entity.table.AccountEntityTableDef.ACCOUNT_ENTITY;


@SpringBootTest
class MybatisFlexTestApplicationTests {

    @Autowired
    private AccountMapper accountMapper;

    @Test
    void contextLoads0() {
        QueryWrapper queryWrapper = QueryWrapper.create()
                .select()
                .from(AccountEntity.class)
                .where(AccountEntity::getAge).eq(18);

        AccountEntity account = accountMapper.selectOneByQuery(queryWrapper);
        System.out.println(account);
    }

    @Test
    void contextLoads1() {
        QueryCondition le = ACCOUNT_ENTITY.AGE.le(18);

        AccountEntity accountEntity = UpdateEntity.of(AccountEntity.class, 1);
        UpdateWrapper accountEntity1 = (UpdateWrapper) accountEntity;
        accountMapper.update(accountEntity);
        AccountEntity account = new AccountEntity();


        account.setAge(18);
        accountMapper.insert(account);
        System.out.println(account);
    }

}
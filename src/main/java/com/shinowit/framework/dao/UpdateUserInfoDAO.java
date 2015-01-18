package com.shinowit.framework.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.sql.Types;

/**
 * Created by daihui on 2014-12-27.
 */
@Repository
public class UpdateUserInfoDAO {

    @Resource
    private JdbcTemplate jdbcTemplate;

    public boolean updateUserStatus(String username) {
        boolean result = false;
        String sql = "update TBa_MemberInfo set Status=1 where UserName=?";
        int i = jdbcTemplate.update(sql, new Object[]{username}, new int[]{Types.VARCHAR});
        if (i > 0) {
            result = true;
        }
        return result;
    }
}

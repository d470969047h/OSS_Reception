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

    public boolean updateUserPassword(String username,String pwd) {
        boolean result = false;
        String sql = "update TBa_MemberInfo set Pwd=? where UserName=?";
        int i = jdbcTemplate.update(sql, new Object[]{pwd,username}, new int[]{Types.VARCHAR,Types.VARCHAR});
        if (i > 0) {
            result = true;
        }
        return result;
    }

    public boolean updateUserRemark(String username,String valid_string) {
        boolean result = false;
        String sql = "update TBa_MemberInfo set Remark=? where UserName=?";
        int i = jdbcTemplate.update(sql, new Object[]{valid_string,username}, new int[]{Types.VARCHAR,Types.VARCHAR});
        if (i > 0) {
            result = true;
        }
        return result;
    }
}

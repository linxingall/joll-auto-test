package org.joll.automate.tms.source.persistence;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.joll.automate.tms.source.model.Query.UserQuery;
import org.joll.automate.tms.source.model.UserDo;

public interface UserDao {
    /**
     * auth_user
     */
    long countByQuery(UserQuery example);

    /**
     * auth_user
     */
    int deleteByQuery(UserQuery example);

    /**
     * auth_user
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * auth_user
     */
    int insert(UserDo record);

    /**
     * auth_user
     */
    int insertSelective(UserDo record);

    /**
     * auth_user
     */
    List<UserDo> selectByQuery(UserQuery example);

    /**
     * auth_user
     */
    UserDo selectByPrimaryKey(Integer id);

    /**
     * auth_user
     */
    int updateByQuerySelective(@Param("record") UserDo record, @Param("example") UserQuery example);

    /**
     * auth_user
     */
    int updateByQuery(@Param("record") UserDo record, @Param("example") UserQuery example);

    /**
     * auth_user
     */
    int updateByPrimaryKeySelective(UserDo record);

    /**
     * auth_user
     */
    int updateByPrimaryKey(UserDo record);
}
package org.joll.automate.tms.test.persistence;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.joll.automate.tms.test.model.Query.StudentQuery;
import org.joll.automate.tms.test.model.StudentDo;

public interface StudentDao {
    /**
     * student
     */
    long countByQuery(StudentQuery example);

    /**
     * student
     */
    int deleteByQuery(StudentQuery example);

    /**
     * student
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * student
     */
    int insert(StudentDo record);

    /**
     * student
     */
    int insertSelective(StudentDo record);

    /**
     * student
     */
    List<StudentDo> selectByQuery(StudentQuery example);

    /**
     * student
     */
    StudentDo selectByPrimaryKey(Integer id);

    /**
     * student
     */
    int updateByQuerySelective(@Param("record") StudentDo record, @Param("example") StudentQuery example);

    /**
     * student
     */
    int updateByQuery(@Param("record") StudentDo record, @Param("example") StudentQuery example);

    /**
     * student
     */
    int updateByPrimaryKeySelective(StudentDo record);

    /**
     * student
     */
    int updateByPrimaryKey(StudentDo record);
}
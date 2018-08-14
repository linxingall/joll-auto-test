package org.joll.automate.tms.test.model;

import java.io.Serializable;

/**
 * 认证用户表
 * student
 */
public class StudentDo implements Serializable {
    /**
     * 用户ID
     * student.ID
     */
    private Integer id;

    /**
     * 用户姓名
     * student.NAME
     */
    private String name;

    /**
     * 年龄
     * student.AGE
     */
    private Integer age;

    /**
     * student
     */
    private static final long serialVersionUID = 1L;

    /**
     * student.ID
     * @return the value of student.ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * student.ID
     * @param id the value for student.ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * student.NAME
     * @return the value of student.NAME
     */
    public String getName() {
        return name;
    }

    /**
     * student.NAME
     * @param name the value for student.NAME
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * student.AGE
     * @return the value of student.AGE
     */
    public Integer getAge() {
        return age;
    }

    /**
     * student.AGE
     * @param age the value for student.AGE
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * student
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        StudentDo other = (StudentDo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getAge() == null ? other.getAge() == null : this.getAge().equals(other.getAge()));
    }

    /**
     * student
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getAge() == null) ? 0 : getAge().hashCode());
        return result;
    }
}
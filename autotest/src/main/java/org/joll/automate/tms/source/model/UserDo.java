package org.joll.automate.tms.source.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 认证用户表
 * auth_user
 */
public class UserDo implements Serializable {
    /**
     * 用户ID
     * auth_user.ID
     */
    private Integer id;

    /**
     * 用户名
     * auth_user.USERNAME
     */
    private String username;

    /**
     * 用户姓名
     * auth_user.NAME
     */
    private String name;

    /**
     * 密码
     * auth_user.PASSWORD
     */
    private String password;

    /**
     * 最后登录日期
     * auth_user.LAST_LOGIN
     */
    private Date lastLogin;

    /**
     * 截止日期
     * auth_user.DEADLINE
     */
    private Date deadline;

    /**
     * 最后登录IP
     * auth_user.LOGIN_IP
     */
    private String loginIp;

    /**
     * ENABLED
     * auth_user.ENABLED
     */
    private String enabled;

    /**
     * 是否过期
     * auth_user.ACCOUNT_NON_EXPIRED
     */
    private String accountNonExpired;

    /**
     * 是否锁定
     * auth_user.ACCOUNT_NON_LOCKED
     */
    private String accountNonLocked;

    /**
     * 用户证书是否有效
     * auth_user.CREDENTIALS_NON_EXPIRED
     */
    private String credentialsNonExpired;

    /**
     * 系统ID
     * auth_user.SYSTEM_ID
     */
    private Integer systemId;

    /**
     * 创建时间
     * auth_user.create_dt
     */
    private Date createDt;

    /**
     * create_by
     * auth_user.create_by
     */
    private Integer createBy;

    /**
     * 最后更新时间
     * auth_user.last_update_dt
     */
    private Date lastUpdateDt;

    /**
     * 最后更新人
     * auth_user.last_update_by
     */
    private Integer lastUpdateBy;

    /**
     * 状态
     * auth_user.sts
     */
    private String sts;

    /**
     * auth_user.warehouse_id
     */
    private Integer warehouseId;

    /**
     * 语言
     * auth_user.language
     */
    private String language;

    /**
     * 时区
     * auth_user.time_zone
     */
    private String timeZone;

    /**
     * 邮箱
     * auth_user.email
     */
    private String email;

    /**
     * 审核类型(A-自动、M-手动)
     * auth_user.check_type
     */
    private String checkType;

    /**
     * 用户类型(E:企业;W:仓库;M:运营;S:超级管理员;SL:销售人员)
     * auth_user.user_type
     */
    private String userType;

    /**
     * 推广人代码
     * auth_user.promotion_code
     */
    private String promotionCode;

    /**
     * 所属数据库地区
     * auth_user.belong_area
     */
    private String belongArea;

    /**
     * 上级管理人id 
     * auth_user.super_manager_id
     */
    private Integer superManagerId;

    /**
     * auth_user
     */
    private static final long serialVersionUID = 1L;

    /**
     * auth_user.ID
     * @return the value of auth_user.ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * auth_user.ID
     * @param id the value for auth_user.ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * auth_user.USERNAME
     * @return the value of auth_user.USERNAME
     */
    public String getUsername() {
        return username;
    }

    /**
     * auth_user.USERNAME
     * @param username the value for auth_user.USERNAME
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * auth_user.NAME
     * @return the value of auth_user.NAME
     */
    public String getName() {
        return name;
    }

    /**
     * auth_user.NAME
     * @param name the value for auth_user.NAME
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * auth_user.PASSWORD
     * @return the value of auth_user.PASSWORD
     */
    public String getPassword() {
        return password;
    }

    /**
     * auth_user.PASSWORD
     * @param password the value for auth_user.PASSWORD
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * auth_user.LAST_LOGIN
     * @return the value of auth_user.LAST_LOGIN
     */
    public Date getLastLogin() {
        return lastLogin;
    }

    /**
     * auth_user.LAST_LOGIN
     * @param lastLogin the value for auth_user.LAST_LOGIN
     */
    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    /**
     * auth_user.DEADLINE
     * @return the value of auth_user.DEADLINE
     */
    public Date getDeadline() {
        return deadline;
    }

    /**
     * auth_user.DEADLINE
     * @param deadline the value for auth_user.DEADLINE
     */
    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    /**
     * auth_user.LOGIN_IP
     * @return the value of auth_user.LOGIN_IP
     */
    public String getLoginIp() {
        return loginIp;
    }

    /**
     * auth_user.LOGIN_IP
     * @param loginIp the value for auth_user.LOGIN_IP
     */
    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp == null ? null : loginIp.trim();
    }

    /**
     * auth_user.ENABLED
     * @return the value of auth_user.ENABLED
     */
    public String getEnabled() {
        return enabled;
    }

    /**
     * auth_user.ENABLED
     * @param enabled the value for auth_user.ENABLED
     */
    public void setEnabled(String enabled) {
        this.enabled = enabled == null ? null : enabled.trim();
    }

    /**
     * auth_user.ACCOUNT_NON_EXPIRED
     * @return the value of auth_user.ACCOUNT_NON_EXPIRED
     */
    public String getAccountNonExpired() {
        return accountNonExpired;
    }

    /**
     * auth_user.ACCOUNT_NON_EXPIRED
     * @param accountNonExpired the value for auth_user.ACCOUNT_NON_EXPIRED
     */
    public void setAccountNonExpired(String accountNonExpired) {
        this.accountNonExpired = accountNonExpired == null ? null : accountNonExpired.trim();
    }

    /**
     * auth_user.ACCOUNT_NON_LOCKED
     * @return the value of auth_user.ACCOUNT_NON_LOCKED
     */
    public String getAccountNonLocked() {
        return accountNonLocked;
    }

    /**
     * auth_user.ACCOUNT_NON_LOCKED
     * @param accountNonLocked the value for auth_user.ACCOUNT_NON_LOCKED
     */
    public void setAccountNonLocked(String accountNonLocked) {
        this.accountNonLocked = accountNonLocked == null ? null : accountNonLocked.trim();
    }

    /**
     * auth_user.CREDENTIALS_NON_EXPIRED
     * @return the value of auth_user.CREDENTIALS_NON_EXPIRED
     */
    public String getCredentialsNonExpired() {
        return credentialsNonExpired;
    }

    /**
     * auth_user.CREDENTIALS_NON_EXPIRED
     * @param credentialsNonExpired the value for auth_user.CREDENTIALS_NON_EXPIRED
     */
    public void setCredentialsNonExpired(String credentialsNonExpired) {
        this.credentialsNonExpired = credentialsNonExpired == null ? null : credentialsNonExpired.trim();
    }

    /**
     * auth_user.SYSTEM_ID
     * @return the value of auth_user.SYSTEM_ID
     */
    public Integer getSystemId() {
        return systemId;
    }

    /**
     * auth_user.SYSTEM_ID
     * @param systemId the value for auth_user.SYSTEM_ID
     */
    public void setSystemId(Integer systemId) {
        this.systemId = systemId;
    }

    /**
     * auth_user.create_dt
     * @return the value of auth_user.create_dt
     */
    public Date getCreateDt() {
        return createDt;
    }

    /**
     * auth_user.create_dt
     * @param createDt the value for auth_user.create_dt
     */
    public void setCreateDt(Date createDt) {
        this.createDt = createDt;
    }

    /**
     * auth_user.create_by
     * @return the value of auth_user.create_by
     */
    public Integer getCreateBy() {
        return createBy;
    }

    /**
     * auth_user.create_by
     * @param createBy the value for auth_user.create_by
     */
    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    /**
     * auth_user.last_update_dt
     * @return the value of auth_user.last_update_dt
     */
    public Date getLastUpdateDt() {
        return lastUpdateDt;
    }

    /**
     * auth_user.last_update_dt
     * @param lastUpdateDt the value for auth_user.last_update_dt
     */
    public void setLastUpdateDt(Date lastUpdateDt) {
        this.lastUpdateDt = lastUpdateDt;
    }

    /**
     * auth_user.last_update_by
     * @return the value of auth_user.last_update_by
     */
    public Integer getLastUpdateBy() {
        return lastUpdateBy;
    }

    /**
     * auth_user.last_update_by
     * @param lastUpdateBy the value for auth_user.last_update_by
     */
    public void setLastUpdateBy(Integer lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy;
    }

    /**
     * auth_user.sts
     * @return the value of auth_user.sts
     */
    public String getSts() {
        return sts;
    }

    /**
     * auth_user.sts
     * @param sts the value for auth_user.sts
     */
    public void setSts(String sts) {
        this.sts = sts == null ? null : sts.trim();
    }

    /**
     * auth_user.warehouse_id
     * @return the value of auth_user.warehouse_id
     */
    public Integer getWarehouseId() {
        return warehouseId;
    }

    /**
     * auth_user.warehouse_id
     * @param warehouseId the value for auth_user.warehouse_id
     */
    public void setWarehouseId(Integer warehouseId) {
        this.warehouseId = warehouseId;
    }

    /**
     * auth_user.language
     * @return the value of auth_user.language
     */
    public String getLanguage() {
        return language;
    }

    /**
     * auth_user.language
     * @param language the value for auth_user.language
     */
    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

    /**
     * auth_user.time_zone
     * @return the value of auth_user.time_zone
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * auth_user.time_zone
     * @param timeZone the value for auth_user.time_zone
     */
    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone == null ? null : timeZone.trim();
    }

    /**
     * auth_user.email
     * @return the value of auth_user.email
     */
    public String getEmail() {
        return email;
    }

    /**
     * auth_user.email
     * @param email the value for auth_user.email
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * auth_user.check_type
     * @return the value of auth_user.check_type
     */
    public String getCheckType() {
        return checkType;
    }

    /**
     * auth_user.check_type
     * @param checkType the value for auth_user.check_type
     */
    public void setCheckType(String checkType) {
        this.checkType = checkType == null ? null : checkType.trim();
    }

    /**
     * auth_user.user_type
     * @return the value of auth_user.user_type
     */
    public String getUserType() {
        return userType;
    }

    /**
     * auth_user.user_type
     * @param userType the value for auth_user.user_type
     */
    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    /**
     * auth_user.promotion_code
     * @return the value of auth_user.promotion_code
     */
    public String getPromotionCode() {
        return promotionCode;
    }

    /**
     * auth_user.promotion_code
     * @param promotionCode the value for auth_user.promotion_code
     */
    public void setPromotionCode(String promotionCode) {
        this.promotionCode = promotionCode == null ? null : promotionCode.trim();
    }

    /**
     * auth_user.belong_area
     * @return the value of auth_user.belong_area
     */
    public String getBelongArea() {
        return belongArea;
    }

    /**
     * auth_user.belong_area
     * @param belongArea the value for auth_user.belong_area
     */
    public void setBelongArea(String belongArea) {
        this.belongArea = belongArea == null ? null : belongArea.trim();
    }

    /**
     * auth_user.super_manager_id
     * @return the value of auth_user.super_manager_id
     */
    public Integer getSuperManagerId() {
        return superManagerId;
    }

    /**
     * auth_user.super_manager_id
     * @param superManagerId the value for auth_user.super_manager_id
     */
    public void setSuperManagerId(Integer superManagerId) {
        this.superManagerId = superManagerId;
    }

    /**
     * auth_user
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
        UserDo other = (UserDo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getLastLogin() == null ? other.getLastLogin() == null : this.getLastLogin().equals(other.getLastLogin()))
            && (this.getDeadline() == null ? other.getDeadline() == null : this.getDeadline().equals(other.getDeadline()))
            && (this.getLoginIp() == null ? other.getLoginIp() == null : this.getLoginIp().equals(other.getLoginIp()))
            && (this.getEnabled() == null ? other.getEnabled() == null : this.getEnabled().equals(other.getEnabled()))
            && (this.getAccountNonExpired() == null ? other.getAccountNonExpired() == null : this.getAccountNonExpired().equals(other.getAccountNonExpired()))
            && (this.getAccountNonLocked() == null ? other.getAccountNonLocked() == null : this.getAccountNonLocked().equals(other.getAccountNonLocked()))
            && (this.getCredentialsNonExpired() == null ? other.getCredentialsNonExpired() == null : this.getCredentialsNonExpired().equals(other.getCredentialsNonExpired()))
            && (this.getSystemId() == null ? other.getSystemId() == null : this.getSystemId().equals(other.getSystemId()))
            && (this.getCreateDt() == null ? other.getCreateDt() == null : this.getCreateDt().equals(other.getCreateDt()))
            && (this.getCreateBy() == null ? other.getCreateBy() == null : this.getCreateBy().equals(other.getCreateBy()))
            && (this.getLastUpdateDt() == null ? other.getLastUpdateDt() == null : this.getLastUpdateDt().equals(other.getLastUpdateDt()))
            && (this.getLastUpdateBy() == null ? other.getLastUpdateBy() == null : this.getLastUpdateBy().equals(other.getLastUpdateBy()))
            && (this.getSts() == null ? other.getSts() == null : this.getSts().equals(other.getSts()))
            && (this.getWarehouseId() == null ? other.getWarehouseId() == null : this.getWarehouseId().equals(other.getWarehouseId()))
            && (this.getLanguage() == null ? other.getLanguage() == null : this.getLanguage().equals(other.getLanguage()))
            && (this.getTimeZone() == null ? other.getTimeZone() == null : this.getTimeZone().equals(other.getTimeZone()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getCheckType() == null ? other.getCheckType() == null : this.getCheckType().equals(other.getCheckType()))
            && (this.getUserType() == null ? other.getUserType() == null : this.getUserType().equals(other.getUserType()))
            && (this.getPromotionCode() == null ? other.getPromotionCode() == null : this.getPromotionCode().equals(other.getPromotionCode()))
            && (this.getBelongArea() == null ? other.getBelongArea() == null : this.getBelongArea().equals(other.getBelongArea()))
            && (this.getSuperManagerId() == null ? other.getSuperManagerId() == null : this.getSuperManagerId().equals(other.getSuperManagerId()));
    }

    /**
     * auth_user
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getLastLogin() == null) ? 0 : getLastLogin().hashCode());
        result = prime * result + ((getDeadline() == null) ? 0 : getDeadline().hashCode());
        result = prime * result + ((getLoginIp() == null) ? 0 : getLoginIp().hashCode());
        result = prime * result + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        result = prime * result + ((getAccountNonExpired() == null) ? 0 : getAccountNonExpired().hashCode());
        result = prime * result + ((getAccountNonLocked() == null) ? 0 : getAccountNonLocked().hashCode());
        result = prime * result + ((getCredentialsNonExpired() == null) ? 0 : getCredentialsNonExpired().hashCode());
        result = prime * result + ((getSystemId() == null) ? 0 : getSystemId().hashCode());
        result = prime * result + ((getCreateDt() == null) ? 0 : getCreateDt().hashCode());
        result = prime * result + ((getCreateBy() == null) ? 0 : getCreateBy().hashCode());
        result = prime * result + ((getLastUpdateDt() == null) ? 0 : getLastUpdateDt().hashCode());
        result = prime * result + ((getLastUpdateBy() == null) ? 0 : getLastUpdateBy().hashCode());
        result = prime * result + ((getSts() == null) ? 0 : getSts().hashCode());
        result = prime * result + ((getWarehouseId() == null) ? 0 : getWarehouseId().hashCode());
        result = prime * result + ((getLanguage() == null) ? 0 : getLanguage().hashCode());
        result = prime * result + ((getTimeZone() == null) ? 0 : getTimeZone().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getCheckType() == null) ? 0 : getCheckType().hashCode());
        result = prime * result + ((getUserType() == null) ? 0 : getUserType().hashCode());
        result = prime * result + ((getPromotionCode() == null) ? 0 : getPromotionCode().hashCode());
        result = prime * result + ((getBelongArea() == null) ? 0 : getBelongArea().hashCode());
        result = prime * result + ((getSuperManagerId() == null) ? 0 : getSuperManagerId().hashCode());
        return result;
    }
}
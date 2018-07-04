package com.example.springbootredis.model;

import com.alibaba.fastjson.annotation.JSONField;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * Model class of t_user
 * 基本用户
 * 
 * @author PAM
 * @since 2016年12月20日
 */
public class UserModel implements Serializable {
    private static final long serialVersionUID = 8439873683799631997L;

    /**
     * 用户id
     */
    private Long id;

    private String qqId;
    private String wxId;
    private String qqName;
    private String wxName;
    /**
     * 用户登录帐号，系统全局唯一
     */
    private String account;

    /**
     * 用户角色：1，超级管理员；2,管理员；3,教务员；4,教师；5,学生；6,助教; 7,学校超级管理员; 8,学校管理员;
     */
    private String role;

    /**
     * 密码
     */
    private String password;

    /**
     * 1,正常；2,删除；3,待审核；4,审核失败；5,锁定
     */
    private Integer status;

    /**
     * 真实姓名
     */
    private String name;

    /**
     * 入住学校ID
     */
    private Long schoolId;

    /**
     * 办公电话
     */
    private String telephone;  //暂时不用该字段

    /**
     * 移动电话
     */
    private String mobile;

    /**
     * 匹配移动电话
     */
    private String searchMobile;
    /**
     * 1,男；2,女
     */
    private Integer sex;

    /**
     * 出生年月
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JSONField(format = "yyyy-MM-dd")
    private Date birthday;

    /**
     * QQ号
     */
    private Long qq;

    /**
     * 电子邮箱
     */
    private String email;

    /**
     * 1,邮箱已认证；2,邮箱未认证
     */
    private Integer emailPassable;

    /**
     * 头像图片
     */
    private String image;

    /**
     * 创建人id
     */
    private Long creator;

    /**
     * 修改人id
     */
    private Long modifier;

    /**
     * 创建时间：Y-m-d H:i:S
     */
    private Date createTime;

    /**
     * 修改时间：Y-m-d H:i:S
     */
    private Date modifyTime;

    /**
     * Get the confirmPwd
     * 
     * @return confirmPwd
     *         新密码
     */
    private String newPassword;

    private int isValidate; //是否实名认证

    private Integer accountType;

    private String mobileCode;

    public int getIsValidate() {
        return isValidate;
    }

    public void setIsValidate(int isValidate) {
        this.isValidate = isValidate;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    /**
     * Get the newPassword
     * 
     * @return newPassword
     * @see UserModel#newPassword
     */
    public String getNewPassword() {
        return newPassword;
    }

    /**
     * Set the newPassword
     * 
     * @param newPassword
     * @see UserModel#newPassword
     */
    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    /**
     * Get the id
     * 
     * @return id
     *         用户id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Set the id
     * 
     * @param id
     *            用户id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Get the account
     * 
     * @return account
     *         用户登录帐号，系统全局唯一
     */
    public String getAccount() {
        return this.account;
    }

    /**
     * Set the account
     * 
     * @param account
     *            用户登录帐号，系统全局唯一
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * Get the password
     * 
     * @return password
     *         密码
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * Set the password
     * 
     * @param password
     *            密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Get the status
     * 
     * @return status
     *         1,正常；2,删除；3,待审核；4,审核失败；5,锁定
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * Set the status
     * 
     * @param status
     *            1,正常；2,删除；3,待审核；4,审核失败；5,锁定
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * Get the name
     * 
     * @return name
     *         真实姓名
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get the schoolId
     * 
     * @return schoolId
     * @see UserModel#schoolId
     */
    public Long getSchoolId() {
        return schoolId;
    }

    /**
     * Set the schoolId
     * 
     * @param schoolId
     * @see UserModel#schoolId
     */
    public void setSchoolId(Long schoolId) {
        this.schoolId = schoolId;
    }

    /**
     * Set the name
     * 
     * @param name
     *            真实姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the telephone
     * 
     * @return telephone
     *         办公电话
     */
    public String getTelephone() {
        return this.telephone;
    }

    /**
     * Set the telephone
     * 
     * @param telephone
     *            办公电话
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * Get the mobile
     * 
     * @return mobile
     *         移动电话
     */
    public String getMobile() {
        return this.mobile;
    }

    /**
     * Set the mobile
     * 
     * @param mobile
     *            移动电话
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * Get the sex
     * 
     * @return sex
     *         1,男；2,女
     */
    public Integer getSex() {
        return this.sex;
    }

    /**
     * Set the sex
     * 
     * @param sex
     *            1,男；2,女
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * Get the birthday
     * 
     * @return birthday
     *         出生年月
     */
    public Date getBirthday() {
        return this.birthday;
    }

    /**
     * Set the birthday
     * 
     * @param birthday
     *            出生年月
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Long getQq() {
        return qq;
    }

    public void setQq(Long qq) {
        this.qq = qq;
    }

    /**
     * Get the email
     * 
     * @return email
     *         电子邮箱
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Set the email
     * 
     * @param email
     *            电子邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Get the emailPassable
     * 
     * @return emailPassable
     *         1,邮箱已认证；2,邮箱未认证
     */
    public Integer getEmailPassable() {
        return this.emailPassable;
    }

    /**
     * Set the emailPassable
     * 
     * @param emailPassable
     *            1,邮箱已认证；2,邮箱未认证
     */
    public void setEmailPassable(Integer emailPassable) {
        this.emailPassable = emailPassable;
    }

    /**
     * Get the image
     * 
     * @return image
     *         头像图片
     */
    public String getImage() {
        return this.image;
    }

    /**
     * Set the image
     * 
     * @param image
     *            头像图片
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * Get the creator
     * 
     * @return creator
     *         创建人id
     */
    public Long getCreator() {
        return this.creator;
    }

    /**
     * Set the creator
     * 
     * @param creator
     *            创建人id
     */
    public void setCreator(Long creator) {
        this.creator = creator;
    }

    /**
     * Get the modifier
     * 
     * @return modifier
     *         修改人id
     */
    public Long getModifier() {
        return this.modifier;
    }

    /**
     * Set the modifier
     * 
     * @param modifier
     *            修改人id
     */
    public void setModifier(Long modifier) {
        this.modifier = modifier;
    }

    /**
     * Get the createTime
     * 
     * @return createTime
     *         创建时间：Y-m-d H:i:S
     */
    public Date getCreateTime() {
        return this.createTime;
    }

    /**
     * Set the createTime
     * 
     * @param createTime
     *            创建时间：Y-m-d H:i:S
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * Get the modifyTime
     * 
     * @return modifyTime
     *         修改时间：Y-m-d H:i:S
     */
    public Date getModifyTime() {
        return this.modifyTime;
    }

    /**
     * Set the modifyTime
     * 
     * @param modifyTime
     *            修改时间：Y-m-d H:i:S
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Integer getAccountType() {
        return accountType;
    }

    public void setAccountType(Integer accountType) {
        this.accountType = accountType;
    }

    public String getQqId() {
        return qqId;
    }

    public void setQqId(String qqId) {
        this.qqId = qqId;
    }

    public String getWxId() {
        return wxId;
    }

    public void setWxId(String wxId) {
        this.wxId = wxId;
    }

    public String getQqName() {
        return qqName;
    }

    public void setQqName(String qqName) {
        this.qqName = qqName;
    }

    public String getWxName() {
        return wxName;
    }

    public void setWxName(String wxName) {
        this.wxName = wxName;
    }

    public String getSearchMobile() {
        return searchMobile;
    }

    public void setSearchMobile(String searchMobile) {
        this.searchMobile = searchMobile;
    }

    public String getMobileCode() {
        return mobileCode;
    }

    public void setMobileCode(String mobileCode) {
        this.mobileCode = mobileCode;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("UserModel [id=");
        builder.append(id);
        builder.append(", account=");
        builder.append(account);
        builder.append(", password=");
        builder.append(password);
        builder.append(", status=");
        builder.append(status);
        builder.append(", name=");
        builder.append(name);
        builder.append(", schoolId=");
        builder.append(schoolId);
        builder.append(", telephone=");
        builder.append(telephone);
        builder.append(", mobile=");
        builder.append(mobile);
        builder.append(", sex=");
        builder.append(sex);
        builder.append(", birthday=");
        builder.append(birthday);
        builder.append(", qq=");
        builder.append(qq);
        builder.append(", email=");
        builder.append(email);
        builder.append(", emailPassable=");
        builder.append(emailPassable);
        builder.append(", image=");
        builder.append(image);
        builder.append(", creator=");
        builder.append(creator);
        builder.append(", modifier=");
        builder.append(modifier);
        builder.append(", createTime=");
        builder.append(createTime);
        builder.append(", modifyTime=");
        builder.append(modifyTime);
        builder.append(", accountType=");
        builder.append(accountType);
        builder.append("]");
        return builder.toString();
    }

}

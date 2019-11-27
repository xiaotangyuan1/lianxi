package com.fsl.manager.dao;

import com.fsl.manager.pojo.Userinfo;
import com.fsl.manager.pojo.UserinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserinfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfo
     *
     * @mbggenerated Tue Nov 12 16:01:03 CST 2019
     */
    int countByExample(UserinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfo
     *
     * @mbggenerated Tue Nov 12 16:01:03 CST 2019
     */
    int deleteByExample(UserinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfo
     *
     * @mbggenerated Tue Nov 12 16:01:03 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfo
     *
     * @mbggenerated Tue Nov 12 16:01:03 CST 2019
     */
    int insert(Userinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfo
     *
     * @mbggenerated Tue Nov 12 16:01:03 CST 2019
     */
    int insertSelective(Userinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfo
     *
     * @mbggenerated Tue Nov 12 16:01:03 CST 2019
     */
    List<Userinfo> selectByExample(UserinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfo
     *
     * @mbggenerated Tue Nov 12 16:01:03 CST 2019
     */
    Userinfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfo
     *
     * @mbggenerated Tue Nov 12 16:01:03 CST 2019
     */
    int updateByExampleSelective(@Param("record") Userinfo record, @Param("example") UserinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfo
     *
     * @mbggenerated Tue Nov 12 16:01:03 CST 2019
     */
    int updateByExample(@Param("record") Userinfo record, @Param("example") UserinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfo
     *
     * @mbggenerated Tue Nov 12 16:01:03 CST 2019
     */
    int updateByPrimaryKeySelective(Userinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfo
     *
     * @mbggenerated Tue Nov 12 16:01:03 CST 2019
     */
    int updateByPrimaryKey(Userinfo record);
}
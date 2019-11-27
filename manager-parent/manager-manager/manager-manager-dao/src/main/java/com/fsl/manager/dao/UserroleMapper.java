package com.fsl.manager.dao;

import com.fsl.manager.pojo.Userrole;
import com.fsl.manager.pojo.UserroleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserroleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userrole
     *
     * @mbggenerated Tue Nov 12 16:01:03 CST 2019
     */
    int countByExample(UserroleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userrole
     *
     * @mbggenerated Tue Nov 12 16:01:03 CST 2019
     */
    int deleteByExample(UserroleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userrole
     *
     * @mbggenerated Tue Nov 12 16:01:03 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userrole
     *
     * @mbggenerated Tue Nov 12 16:01:03 CST 2019
     */
    int insert(Userrole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userrole
     *
     * @mbggenerated Tue Nov 12 16:01:03 CST 2019
     */
    int insertSelective(Userrole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userrole
     *
     * @mbggenerated Tue Nov 12 16:01:03 CST 2019
     */
    List<Userrole> selectByExample(UserroleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userrole
     *
     * @mbggenerated Tue Nov 12 16:01:03 CST 2019
     */
    Userrole selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userrole
     *
     * @mbggenerated Tue Nov 12 16:01:03 CST 2019
     */
    int updateByExampleSelective(@Param("record") Userrole record, @Param("example") UserroleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userrole
     *
     * @mbggenerated Tue Nov 12 16:01:03 CST 2019
     */
    int updateByExample(@Param("record") Userrole record, @Param("example") UserroleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userrole
     *
     * @mbggenerated Tue Nov 12 16:01:03 CST 2019
     */
    int updateByPrimaryKeySelective(Userrole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userrole
     *
     * @mbggenerated Tue Nov 12 16:01:03 CST 2019
     */
    int updateByPrimaryKey(Userrole record);
}
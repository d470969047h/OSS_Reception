package com.shinowit.dao.mapper;

import com.shinowit.entity.TmeOrderdetailsinfo;
import com.shinowit.entity.TmeOrderdetailsinfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TmeOrderdetailsinfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OrderDetailsInfo
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    int countByExample(TmeOrderdetailsinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OrderDetailsInfo
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    int deleteByExample(TmeOrderdetailsinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OrderDetailsInfo
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OrderDetailsInfo
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    int insert(TmeOrderdetailsinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OrderDetailsInfo
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    int insertSelective(TmeOrderdetailsinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OrderDetailsInfo
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    List<TmeOrderdetailsinfo> selectByExample(TmeOrderdetailsinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OrderDetailsInfo
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    TmeOrderdetailsinfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OrderDetailsInfo
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    int updateByExampleSelective(@Param("record") TmeOrderdetailsinfo record, @Param("example") TmeOrderdetailsinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OrderDetailsInfo
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    int updateByExample(@Param("record") TmeOrderdetailsinfo record, @Param("example") TmeOrderdetailsinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OrderDetailsInfo
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    int updateByPrimaryKeySelective(TmeOrderdetailsinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OrderDetailsInfo
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    int updateByPrimaryKey(TmeOrderdetailsinfo record);

    List<TmeOrderdetailsinfo> selectPage(TmeOrderdetailsinfoExample example);

    Integer selectMaxPrimaryKeyValue();
}
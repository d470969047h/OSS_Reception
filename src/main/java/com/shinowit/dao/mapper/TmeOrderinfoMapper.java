package com.shinowit.dao.mapper;

import com.shinowit.entity.TmeOrderinfo;
import com.shinowit.entity.TmeOrderinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TmeOrderinfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OrderInfo
     *
     * @mbggenerated Fri Jan 02 23:34:19 CST 2015
     */
    int countByExample(TmeOrderinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OrderInfo
     *
     * @mbggenerated Fri Jan 02 23:34:19 CST 2015
     */
    int deleteByExample(TmeOrderinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OrderInfo
     *
     * @mbggenerated Fri Jan 02 23:34:19 CST 2015
     */
    int deleteByPrimaryKey(String billcode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OrderInfo
     *
     * @mbggenerated Fri Jan 02 23:34:19 CST 2015
     */
    int insert(TmeOrderinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OrderInfo
     *
     * @mbggenerated Fri Jan 02 23:34:19 CST 2015
     */
    int insertSelective(TmeOrderinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OrderInfo
     *
     * @mbggenerated Fri Jan 02 23:34:19 CST 2015
     */
    List<TmeOrderinfo> selectByExample(TmeOrderinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OrderInfo
     *
     * @mbggenerated Fri Jan 02 23:34:19 CST 2015
     */
    TmeOrderinfo selectByPrimaryKey(String billcode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OrderInfo
     *
     * @mbggenerated Fri Jan 02 23:34:19 CST 2015
     */
    int updateByExampleSelective(@Param("record") TmeOrderinfo record, @Param("example") TmeOrderinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OrderInfo
     *
     * @mbggenerated Fri Jan 02 23:34:19 CST 2015
     */
    int updateByExample(@Param("record") TmeOrderinfo record, @Param("example") TmeOrderinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OrderInfo
     *
     * @mbggenerated Fri Jan 02 23:34:19 CST 2015
     */
    int updateByPrimaryKeySelective(TmeOrderinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OrderInfo
     *
     * @mbggenerated Fri Jan 02 23:34:19 CST 2015
     */
    int updateByPrimaryKey(TmeOrderinfo record);

    List<TmeOrderinfo> selectPage(TmeOrderinfoExample example);

    String selectMaxPrimaryKeyValue();
}
package com.shinowit.dao.mapper;

import com.shinowit.entity.TmeOutstockdetailsinfo;
import com.shinowit.entity.TmeOutstockdetailsinfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TmeOutstockdetailsinfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OutStockDetailsInfo
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    int countByExample(TmeOutstockdetailsinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OutStockDetailsInfo
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    int deleteByExample(TmeOutstockdetailsinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OutStockDetailsInfo
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OutStockDetailsInfo
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    int insert(TmeOutstockdetailsinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OutStockDetailsInfo
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    int insertSelective(TmeOutstockdetailsinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OutStockDetailsInfo
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    List<TmeOutstockdetailsinfo> selectByExample(TmeOutstockdetailsinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OutStockDetailsInfo
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    TmeOutstockdetailsinfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OutStockDetailsInfo
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    int updateByExampleSelective(@Param("record") TmeOutstockdetailsinfo record, @Param("example") TmeOutstockdetailsinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OutStockDetailsInfo
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    int updateByExample(@Param("record") TmeOutstockdetailsinfo record, @Param("example") TmeOutstockdetailsinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OutStockDetailsInfo
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    int updateByPrimaryKeySelective(TmeOutstockdetailsinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OutStockDetailsInfo
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    int updateByPrimaryKey(TmeOutstockdetailsinfo record);

    List<TmeOutstockdetailsinfo> selectPage(TmeOutstockdetailsinfoExample example);

    Integer selectMaxPrimaryKeyValue();
}
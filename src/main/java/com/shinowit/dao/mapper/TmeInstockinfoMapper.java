package com.shinowit.dao.mapper;

import com.shinowit.entity.TmeInstockinfo;
import com.shinowit.entity.TmeInstockinfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TmeInstockinfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_InStockInfo
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    int countByExample(TmeInstockinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_InStockInfo
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    int deleteByExample(TmeInstockinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_InStockInfo
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    int deleteByPrimaryKey(String billcode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_InStockInfo
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    int insert(TmeInstockinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_InStockInfo
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    int insertSelective(TmeInstockinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_InStockInfo
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    List<TmeInstockinfo> selectByExample(TmeInstockinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_InStockInfo
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    TmeInstockinfo selectByPrimaryKey(String billcode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_InStockInfo
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    int updateByExampleSelective(@Param("record") TmeInstockinfo record, @Param("example") TmeInstockinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_InStockInfo
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    int updateByExample(@Param("record") TmeInstockinfo record, @Param("example") TmeInstockinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_InStockInfo
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    int updateByPrimaryKeySelective(TmeInstockinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_InStockInfo
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    int updateByPrimaryKey(TmeInstockinfo record);

    List<TmeInstockinfo> selectPage(TmeInstockinfoExample example);

    String selectMaxPrimaryKeyValue();
}
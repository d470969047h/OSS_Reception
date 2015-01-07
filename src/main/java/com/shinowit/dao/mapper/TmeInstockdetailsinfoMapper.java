package com.shinowit.dao.mapper;

import com.shinowit.entity.TmeInstockdetailsinfo;
import com.shinowit.entity.TmeInstockdetailsinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TmeInstockdetailsinfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_InStockDetailsInfo
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    int countByExample(TmeInstockdetailsinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_InStockDetailsInfo
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    int deleteByExample(TmeInstockdetailsinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_InStockDetailsInfo
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_InStockDetailsInfo
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    int insert(TmeInstockdetailsinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_InStockDetailsInfo
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    int insertSelective(TmeInstockdetailsinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_InStockDetailsInfo
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    List<TmeInstockdetailsinfo> selectByExample(TmeInstockdetailsinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_InStockDetailsInfo
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    TmeInstockdetailsinfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_InStockDetailsInfo
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    int updateByExampleSelective(@Param("record") TmeInstockdetailsinfo record, @Param("example") TmeInstockdetailsinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_InStockDetailsInfo
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    int updateByExample(@Param("record") TmeInstockdetailsinfo record, @Param("example") TmeInstockdetailsinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_InStockDetailsInfo
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    int updateByPrimaryKeySelective(TmeInstockdetailsinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_InStockDetailsInfo
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    int updateByPrimaryKey(TmeInstockdetailsinfo record);

    List<TmeInstockdetailsinfo> selectPage(TmeInstockdetailsinfoExample example);

    Integer selectMaxPrimaryKeyValue();
}
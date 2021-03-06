package com.shinowit.dao.mapper;

import com.shinowit.entity.TmeTrolley;
import com.shinowit.entity.TmeTrolleyExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TmeTrolleyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_Trolley
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    int countByExample(TmeTrolleyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_Trolley
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    int deleteByExample(TmeTrolleyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_Trolley
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    int deleteByPrimaryKey(Integer trolleyid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_Trolley
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    int insert(TmeTrolley record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_Trolley
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    int insertSelective(TmeTrolley record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_Trolley
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    List<TmeTrolley> selectByExample(TmeTrolleyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_Trolley
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    TmeTrolley selectByPrimaryKey(Integer trolleyid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_Trolley
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    int updateByExampleSelective(@Param("record") TmeTrolley record, @Param("example") TmeTrolleyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_Trolley
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    int updateByExample(@Param("record") TmeTrolley record, @Param("example") TmeTrolleyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_Trolley
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    int updateByPrimaryKeySelective(TmeTrolley record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_Trolley
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    int updateByPrimaryKey(TmeTrolley record);

    List<TmeTrolley> selectPage(TmeTrolleyExample example);

    Integer selectMaxPrimaryKeyValue();
}
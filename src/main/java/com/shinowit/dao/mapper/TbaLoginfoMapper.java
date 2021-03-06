package com.shinowit.dao.mapper;

import com.shinowit.entity.TbaLoginfo;
import com.shinowit.entity.TbaLoginfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbaLoginfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_LogInfo
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    int countByExample(TbaLoginfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_LogInfo
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    int deleteByExample(TbaLoginfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_LogInfo
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_LogInfo
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    int insert(TbaLoginfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_LogInfo
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    int insertSelective(TbaLoginfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_LogInfo
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    List<TbaLoginfo> selectByExample(TbaLoginfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_LogInfo
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    TbaLoginfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_LogInfo
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    int updateByExampleSelective(@Param("record") TbaLoginfo record, @Param("example") TbaLoginfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_LogInfo
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    int updateByExample(@Param("record") TbaLoginfo record, @Param("example") TbaLoginfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_LogInfo
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    int updateByPrimaryKeySelective(TbaLoginfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_LogInfo
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    int updateByPrimaryKey(TbaLoginfo record);

    List<TbaLoginfo> selectPage(TbaLoginfoExample example);

    Integer selectMaxPrimaryKeyValue();
}
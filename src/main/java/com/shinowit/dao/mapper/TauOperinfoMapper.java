package com.shinowit.dao.mapper;

import com.shinowit.entity.TauOperinfo;
import com.shinowit.entity.TauOperinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TauOperinfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TAu_OperInfo
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    int countByExample(TauOperinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TAu_OperInfo
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    int deleteByExample(TauOperinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TAu_OperInfo
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    int deleteByPrimaryKey(String operid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TAu_OperInfo
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    int insert(TauOperinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TAu_OperInfo
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    int insertSelective(TauOperinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TAu_OperInfo
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    List<TauOperinfo> selectByExample(TauOperinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TAu_OperInfo
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    TauOperinfo selectByPrimaryKey(String operid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TAu_OperInfo
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    int updateByExampleSelective(@Param("record") TauOperinfo record, @Param("example") TauOperinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TAu_OperInfo
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    int updateByExample(@Param("record") TauOperinfo record, @Param("example") TauOperinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TAu_OperInfo
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    int updateByPrimaryKeySelective(TauOperinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TAu_OperInfo
     *
     * @mbggenerated Wed Jan 07 14:34:57 CST 2015
     */
    int updateByPrimaryKey(TauOperinfo record);

    List<TauOperinfo> selectPage(TauOperinfoExample example);

    String selectMaxPrimaryKeyValue();
}
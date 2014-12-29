package com.shinowit.dao.mapper;

import com.shinowit.entity.TbaSupplyrecordinfo;
import com.shinowit.entity.TbaSupplyrecordinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbaSupplyrecordinfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_SupplyRecordInfo
     *
     * @mbggenerated Mon Dec 29 09:58:42 CST 2014
     */
    int countByExample(TbaSupplyrecordinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_SupplyRecordInfo
     *
     * @mbggenerated Mon Dec 29 09:58:42 CST 2014
     */
    int deleteByExample(TbaSupplyrecordinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_SupplyRecordInfo
     *
     * @mbggenerated Mon Dec 29 09:58:42 CST 2014
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_SupplyRecordInfo
     *
     * @mbggenerated Mon Dec 29 09:58:42 CST 2014
     */
    int insert(TbaSupplyrecordinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_SupplyRecordInfo
     *
     * @mbggenerated Mon Dec 29 09:58:42 CST 2014
     */
    int insertSelective(TbaSupplyrecordinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_SupplyRecordInfo
     *
     * @mbggenerated Mon Dec 29 09:58:42 CST 2014
     */
    List<TbaSupplyrecordinfo> selectByExample(TbaSupplyrecordinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_SupplyRecordInfo
     *
     * @mbggenerated Mon Dec 29 09:58:42 CST 2014
     */
    TbaSupplyrecordinfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_SupplyRecordInfo
     *
     * @mbggenerated Mon Dec 29 09:58:42 CST 2014
     */
    int updateByExampleSelective(@Param("record") TbaSupplyrecordinfo record, @Param("example") TbaSupplyrecordinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_SupplyRecordInfo
     *
     * @mbggenerated Mon Dec 29 09:58:42 CST 2014
     */
    int updateByExample(@Param("record") TbaSupplyrecordinfo record, @Param("example") TbaSupplyrecordinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_SupplyRecordInfo
     *
     * @mbggenerated Mon Dec 29 09:58:42 CST 2014
     */
    int updateByPrimaryKeySelective(TbaSupplyrecordinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_SupplyRecordInfo
     *
     * @mbggenerated Mon Dec 29 09:58:42 CST 2014
     */
    int updateByPrimaryKey(TbaSupplyrecordinfo record);

    List<TbaSupplyrecordinfo> selectPage(TbaSupplyrecordinfoExample example);

    Integer selectMaxPrimaryKeyValue();
}
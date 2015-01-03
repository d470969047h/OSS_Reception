package com.shinowit.dao.mapper;

import com.shinowit.entity.TbaSupplierinfo;
import com.shinowit.entity.TbaSupplierinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbaSupplierinfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_SupplierInfo
     *
     * @mbggenerated Fri Jan 02 23:34:19 CST 2015
     */
    int countByExample(TbaSupplierinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_SupplierInfo
     *
     * @mbggenerated Fri Jan 02 23:34:19 CST 2015
     */
    int deleteByExample(TbaSupplierinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_SupplierInfo
     *
     * @mbggenerated Fri Jan 02 23:34:19 CST 2015
     */
    int deleteByPrimaryKey(String supplierid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_SupplierInfo
     *
     * @mbggenerated Fri Jan 02 23:34:19 CST 2015
     */
    int insert(TbaSupplierinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_SupplierInfo
     *
     * @mbggenerated Fri Jan 02 23:34:19 CST 2015
     */
    int insertSelective(TbaSupplierinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_SupplierInfo
     *
     * @mbggenerated Fri Jan 02 23:34:19 CST 2015
     */
    List<TbaSupplierinfo> selectByExample(TbaSupplierinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_SupplierInfo
     *
     * @mbggenerated Fri Jan 02 23:34:19 CST 2015
     */
    TbaSupplierinfo selectByPrimaryKey(String supplierid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_SupplierInfo
     *
     * @mbggenerated Fri Jan 02 23:34:19 CST 2015
     */
    int updateByExampleSelective(@Param("record") TbaSupplierinfo record, @Param("example") TbaSupplierinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_SupplierInfo
     *
     * @mbggenerated Fri Jan 02 23:34:19 CST 2015
     */
    int updateByExample(@Param("record") TbaSupplierinfo record, @Param("example") TbaSupplierinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_SupplierInfo
     *
     * @mbggenerated Fri Jan 02 23:34:19 CST 2015
     */
    int updateByPrimaryKeySelective(TbaSupplierinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_SupplierInfo
     *
     * @mbggenerated Fri Jan 02 23:34:19 CST 2015
     */
    int updateByPrimaryKey(TbaSupplierinfo record);

    List<TbaSupplierinfo> selectPage(TbaSupplierinfoExample example);

    String selectMaxPrimaryKeyValue();
}
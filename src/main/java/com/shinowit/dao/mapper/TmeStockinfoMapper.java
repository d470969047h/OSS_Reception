package com.shinowit.dao.mapper;

import com.shinowit.entity.TmeStockinfo;
import com.shinowit.entity.TmeStockinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TmeStockinfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_StockInfo
     *
     * @mbggenerated Sun Jan 04 15:01:26 CST 2015
     */
    int countByExample(TmeStockinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_StockInfo
     *
     * @mbggenerated Sun Jan 04 15:01:26 CST 2015
     */
    int deleteByExample(TmeStockinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_StockInfo
     *
     * @mbggenerated Sun Jan 04 15:01:26 CST 2015
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_StockInfo
     *
     * @mbggenerated Sun Jan 04 15:01:26 CST 2015
     */
    int insert(TmeStockinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_StockInfo
     *
     * @mbggenerated Sun Jan 04 15:01:26 CST 2015
     */
    int insertSelective(TmeStockinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_StockInfo
     *
     * @mbggenerated Sun Jan 04 15:01:26 CST 2015
     */
    List<TmeStockinfo> selectByExample(TmeStockinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_StockInfo
     *
     * @mbggenerated Sun Jan 04 15:01:26 CST 2015
     */
    TmeStockinfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_StockInfo
     *
     * @mbggenerated Sun Jan 04 15:01:26 CST 2015
     */
    int updateByExampleSelective(@Param("record") TmeStockinfo record, @Param("example") TmeStockinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_StockInfo
     *
     * @mbggenerated Sun Jan 04 15:01:26 CST 2015
     */
    int updateByExample(@Param("record") TmeStockinfo record, @Param("example") TmeStockinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_StockInfo
     *
     * @mbggenerated Sun Jan 04 15:01:26 CST 2015
     */
    int updateByPrimaryKeySelective(TmeStockinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_StockInfo
     *
     * @mbggenerated Sun Jan 04 15:01:26 CST 2015
     */
    int updateByPrimaryKey(TmeStockinfo record);

    List<TmeStockinfo> selectPage(TmeStockinfoExample example);

    Integer selectMaxPrimaryKeyValue();
}
package com.yaozhitech.baobei.order.mapper;

import com.yaozhitech.baobei.order.domain.BiHuaxiang;
import java.util.List;

public interface BiHuaxiangMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bi_huaxiang
     *
     * @mbg.generated Wed Nov 07 17:51:41 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bi_huaxiang
     *
     * @mbg.generated Wed Nov 07 17:51:41 CST 2018
     */
    int insert(BiHuaxiang record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bi_huaxiang
     *
     * @mbg.generated Wed Nov 07 17:51:41 CST 2018
     */
    BiHuaxiang selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bi_huaxiang
     *
     * @mbg.generated Wed Nov 07 17:51:41 CST 2018
     */
    List<BiHuaxiang> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bi_huaxiang
     *
     * @mbg.generated Wed Nov 07 17:51:41 CST 2018
     */
    int updateByPrimaryKey(BiHuaxiang record);
}
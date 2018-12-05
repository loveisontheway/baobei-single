package com.yaozhitech.baobei.order.service;
import com.yaozhitech.baobei.order.domain.BiHuaxiang;
import java.util.List;
import java.lang.Integer;

/**
 * 用户画像 - Service接口类
 *
 * @author jiangjialiang on 2018/11/07
 */
public interface BiHuaxiangService {

    int deleteByPrimaryKey(Integer id);

    int insert(BiHuaxiang biHuaxiang);

    BiHuaxiang selectByPrimaryKey(Integer id);

    List<BiHuaxiang> selectAll();

    int updateByPrimaryKey(BiHuaxiang biHuaxiang);

}
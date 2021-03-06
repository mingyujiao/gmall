package com.learn.gmall.manage.mapper;

import com.learn.gmall.bean.BaseAttrInfo;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author jiaomingyu5778@gmail.com
 * @date 2019/11/12 22:16
 */
public interface BaseAttrInfoMapper extends Mapper<BaseAttrInfo> {

    public List<BaseAttrInfo> getBaseAttrInfoListByCatalog3Id(@Param("catalog3Id")String catalog3Id);
}

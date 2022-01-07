package cn.mywork.sketch.dao;

import cn.mywork.sketch.pojo.DemandInfo;

/**
 * @author sketch
 * @date 2022/01/07
 */
public interface DemandInfoDao {
    int deleteById(Integer id);

    int insert(DemandInfo record);

    int insertSelective(DemandInfo record);

    DemandInfo selectById(Integer id);

    int updateByCon(DemandInfo record);

    int updateById(DemandInfo record);
}

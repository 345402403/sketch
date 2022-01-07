package cn.mywork.sketch.dao;

import cn.mywork.sketch.pojo.DonorInfo;

/**
 * @author sketch
 * @date 2022/01/07
 */
public interface DonorInfoDao {
    int deleteById(Integer id);

    int insert(DonorInfo record);

    int insertSelective(DonorInfo record);

    DonorInfo selectById(Integer id);

    int updateByCon(DonorInfo record);

    int updateById(DonorInfo record);
}

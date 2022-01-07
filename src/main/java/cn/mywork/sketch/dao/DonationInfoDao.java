package cn.mywork.sketch.dao;

import cn.mywork.sketch.pojo.DonationInfo;

/**
 * @author sketch
 * @date 2022/01/07
 */
public interface DonationInfoDao {
    int deleteById(Integer id);

    int insert(DonationInfo record);

    int insertSelective(DonationInfo record);

    DonationInfo selectById(Integer id);

    int updateByCon(DonationInfo record);

    int updateById(DonationInfo record);
}

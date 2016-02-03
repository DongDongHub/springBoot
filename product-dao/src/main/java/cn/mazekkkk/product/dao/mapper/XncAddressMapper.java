package cn.mazekkkk.product.dao.mapper;

import cn.mazekkkk.product.common.XncAddress;
import cn.mazekkkk.product.common.XncAddressExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XncAddressMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xnc_address
     *
     * @mbggenerated Wed Feb 03 16:15:00 CST 2016
     */
    int countByExample(XncAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xnc_address
     *
     * @mbggenerated Wed Feb 03 16:15:00 CST 2016
     */
    int deleteByExample(XncAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xnc_address
     *
     * @mbggenerated Wed Feb 03 16:15:00 CST 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xnc_address
     *
     * @mbggenerated Wed Feb 03 16:15:00 CST 2016
     */
    int insert(XncAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xnc_address
     *
     * @mbggenerated Wed Feb 03 16:15:00 CST 2016
     */
    int insertSelective(XncAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xnc_address
     *
     * @mbggenerated Wed Feb 03 16:15:00 CST 2016
     */
    List<XncAddress> selectByExample(XncAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xnc_address
     *
     * @mbggenerated Wed Feb 03 16:15:00 CST 2016
     */
    XncAddress selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xnc_address
     *
     * @mbggenerated Wed Feb 03 16:15:00 CST 2016
     */
    int updateByExampleSelective(@Param("record") XncAddress record, @Param("example") XncAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xnc_address
     *
     * @mbggenerated Wed Feb 03 16:15:00 CST 2016
     */
    int updateByExample(@Param("record") XncAddress record, @Param("example") XncAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xnc_address
     *
     * @mbggenerated Wed Feb 03 16:15:00 CST 2016
     */
    int updateByPrimaryKeySelective(XncAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xnc_address
     *
     * @mbggenerated Wed Feb 03 16:15:00 CST 2016
     */
    int updateByPrimaryKey(XncAddress record);
}
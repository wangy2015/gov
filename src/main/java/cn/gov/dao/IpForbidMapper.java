package cn.gov.dao;

import cn.gov.model.IpForbid;
import cn.gov.model.IpForbidExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface IpForbidMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ip_forbid
     *
     * @mbggenerated
     */
    int countByExample(IpForbidExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ip_forbid
     *
     * @mbggenerated
     */
    int deleteByExample(IpForbidExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ip_forbid
     *
     * @mbggenerated
     */
    @Delete({
        "delete from ip_forbid",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ip_forbid
     *
     * @mbggenerated
     */
    @Insert({
        "insert into ip_forbid (id, ip)",
        "values (#{id,jdbcType=INTEGER}, #{ip,jdbcType=VARCHAR})"
    })
    int insert(IpForbid record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ip_forbid
     *
     * @mbggenerated
     */
    int insertSelective(IpForbid record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ip_forbid
     *
     * @mbggenerated
     */
    List<IpForbid> selectByExample(IpForbidExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ip_forbid
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "id, ip",
        "from ip_forbid",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    IpForbid selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ip_forbid
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") IpForbid record, @Param("example") IpForbidExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ip_forbid
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") IpForbid record, @Param("example") IpForbidExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ip_forbid
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(IpForbid record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ip_forbid
     *
     * @mbggenerated
     */
    @Update({
        "update ip_forbid",
        "set ip = #{ip,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(IpForbid record);
}
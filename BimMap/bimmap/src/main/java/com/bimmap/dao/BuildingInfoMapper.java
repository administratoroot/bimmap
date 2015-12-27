package com.bimmap.dao;

import com.bimmap.model.BuildingInfo;
import com.bimmap.model.BuildingInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface BuildingInfoMapper {
    int countByExample(BuildingInfoExample example);

    int deleteByExample(BuildingInfoExample example);

    @Delete({
        "delete from building_info",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into building_info (id, BuildingName, ",
        "Address, GISLat, ",
        "GISLon, GISAlt, Authority, ",
        "Area, BuildingType, ",
        "StructureType, UpFloorNum, ",
        "SubFloorNum, Developer, ",
        "Builder, Supervisor, ",
        "ModelDrawer, UploadTime, ",
        "UploadUserID)",
        "values (#{id,jdbcType=INTEGER}, #{buildingname,jdbcType=VARCHAR}, ",
        "#{address,jdbcType=VARCHAR}, #{gislat,jdbcType=DOUBLE}, ",
        "#{gislon,jdbcType=DOUBLE}, #{gisalt,jdbcType=DOUBLE}, #{authority,jdbcType=INTEGER}, ",
        "#{area,jdbcType=DOUBLE}, #{buildingtype,jdbcType=INTEGER}, ",
        "#{structuretype,jdbcType=INTEGER}, #{upfloornum,jdbcType=INTEGER}, ",
        "#{subfloornum,jdbcType=INTEGER}, #{developer,jdbcType=VARCHAR}, ",
        "#{builder,jdbcType=VARCHAR}, #{supervisor,jdbcType=VARCHAR}, ",
        "#{modeldrawer,jdbcType=VARCHAR}, #{uploadtime,jdbcType=VARCHAR}, ",
        "#{uploaduserid,jdbcType=INTEGER})"
    })
    int insert(BuildingInfo record);

    int insertSelective(BuildingInfo record);

    List<BuildingInfo> selectByExample(BuildingInfoExample example);

    @Select({
        "select",
        "id, BuildingName, Address, GISLat, GISLon, GISAlt, Authority, Area, BuildingType, ",
        "StructureType, UpFloorNum, SubFloorNum, Developer, Builder, Supervisor, ModelDrawer, ",
        "UploadTime, UploadUserID",
        "from building_info",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    BuildingInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BuildingInfo record, @Param("example") BuildingInfoExample example);

    int updateByExample(@Param("record") BuildingInfo record, @Param("example") BuildingInfoExample example);

    int updateByPrimaryKeySelective(BuildingInfo record);

    @Update({
        "update building_info",
        "set BuildingName = #{buildingname,jdbcType=VARCHAR},",
          "Address = #{address,jdbcType=VARCHAR},",
          "GISLat = #{gislat,jdbcType=DOUBLE},",
          "GISLon = #{gislon,jdbcType=DOUBLE},",
          "GISAlt = #{gisalt,jdbcType=DOUBLE},",
          "Authority = #{authority,jdbcType=INTEGER},",
          "Area = #{area,jdbcType=DOUBLE},",
          "BuildingType = #{buildingtype,jdbcType=INTEGER},",
          "StructureType = #{structuretype,jdbcType=INTEGER},",
          "UpFloorNum = #{upfloornum,jdbcType=INTEGER},",
          "SubFloorNum = #{subfloornum,jdbcType=INTEGER},",
          "Developer = #{developer,jdbcType=VARCHAR},",
          "Builder = #{builder,jdbcType=VARCHAR},",
          "Supervisor = #{supervisor,jdbcType=VARCHAR},",
          "ModelDrawer = #{modeldrawer,jdbcType=VARCHAR},",
          "UploadTime = #{uploadtime,jdbcType=VARCHAR},",
          "UploadUserID = #{uploaduserid,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(BuildingInfo record);
}
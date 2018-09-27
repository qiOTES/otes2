package PSGLGD.OTES.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import PSGLGD.OTES.entity.RolePremission;
import PSGLGD.OTES.entity.RolePremissionExample;

public interface RolePremissionMapper {
    long countByExample(RolePremissionExample example);

    int deleteByExample(RolePremissionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RolePremission record);

    int insertSelective(RolePremission record);

    List<RolePremission> selectByExample(RolePremissionExample example);

    RolePremission selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RolePremission record, @Param("example") RolePremissionExample example);

    int updateByExample(@Param("record") RolePremission record, @Param("example") RolePremissionExample example);

    int updateByPrimaryKeySelective(RolePremission record);

    int updateByPrimaryKey(RolePremission record);
}
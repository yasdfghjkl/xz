package com.fh.user.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.fh.user.entity.TSysUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fh.user.entity.UserVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author yyy
 * @since 2020-12-01
 */
@Repository
@Mapper
public interface TSysUserMapper extends BaseMapper<TSysUser> {

    IPage<UserVo> queryPageUser(@Param("page") Page<UserVo> page);
}

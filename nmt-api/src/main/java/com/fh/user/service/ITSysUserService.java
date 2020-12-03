package com.fh.user.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.fh.user.entity.TSysUser;
import com.baomidou.mybatisplus.extension.service.IService;
import com.fh.user.entity.UserVo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author yyy
 * @since 2020-12-01
 */
public interface ITSysUserService extends IService<TSysUser> {

    IPage<UserVo> queryPageUser(Page<UserVo> page);
}

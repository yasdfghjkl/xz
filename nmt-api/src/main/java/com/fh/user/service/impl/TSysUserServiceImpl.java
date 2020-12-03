package com.fh.user.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.fh.user.entity.TSysUser;
import com.fh.user.entity.UserVo;
import com.fh.user.mapper.TSysUserMapper;
import com.fh.user.service.ITSysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yyy
 * @since 2020-12-01
 */
@Service
public class TSysUserServiceImpl extends ServiceImpl<TSysUserMapper, TSysUser> implements ITSysUserService {

    @Autowired
    private TSysUserMapper userMapper;


    @Override
    public IPage<UserVo> queryPageUser(Page<UserVo> page) {
        IPage<UserVo> iPage = userMapper.queryPageUser(page);
        return iPage;
    }
}

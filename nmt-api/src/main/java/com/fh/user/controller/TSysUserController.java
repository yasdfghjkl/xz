package com.fh.user.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.fh.commons.resuit.CommonsReturn;
import com.fh.user.entity.TSysUser;
import com.fh.user.entity.UserVo;
import com.fh.user.service.ITSysUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author yyy
 * @since 2020-12-01
 */
@RestController
@RequestMapping("/users")
@CrossOrigin
@Api(tags = "TSysUserController",description = "用户信息管理")
public class TSysUserController {

    @Autowired
    private ITSysUserService userService;

  /*  @GetMapping
    @ApiOperation("查询全部用户信息")
    public CommonsReturn queryUserList(){
        List<TSysUser> userList=userService.list();
        return CommonsReturn.success(userList);
    }*/
 /* @GetMapping
    @ApiOperation("查询全部用户分页信息")
    public CommonsReturn queryUserList(Page<TSysUser> page){
        userService.page(page);
        return CommonsReturn.success(page);
    }*/
    @GetMapping
    @ApiOperation("查询全部用户信息")
    public CommonsReturn queryUserList(Page<UserVo> page){
        IPage<UserVo> iPage = userService.queryPageUser(page);
        return CommonsReturn.success(iPage);
    }

    @GetMapping("/{name}")
    @ApiOperation("根据用户名称模糊查询")
    public CommonsReturn queryUserList(@ApiParam(value = "用户名称",required = true,type = "String") @PathVariable("name") String name){
        List<TSysUser> userList=userService.list(new QueryWrapper<TSysUser>().like("realName",name));
        return CommonsReturn.success(userList);
    }


}

package com.example.lambda.web;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value="测试接口Controller")
public class HelloController {

    /**
     * 获取所有用户
     * @return
     */
    @ApiOperation(value = "用户", notes = "查询所有用户")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful — 请求已完成"),
            @ApiResponse(code = 500, message = "服务器不能完成请求")
    })
    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public String getUsers(){
        return "all";
    }

    /***
     * 根据id获取用户
     * @param userId
     * @return
     */
    @RequestMapping(value = "/user/{userId}", method = RequestMethod.GET)
    public String getUser(@PathVariable Long userId){
        return "userId";
    }
}

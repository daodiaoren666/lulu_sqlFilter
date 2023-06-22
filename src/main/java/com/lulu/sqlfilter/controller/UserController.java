package com.lulu.sqlfilter.controller;


import com.lulu.sqlfilter.common.BaseResponse;
import com.lulu.sqlfilter.common.ErrorCode;
import com.lulu.sqlfilter.common.ResultUtils;
import com.lulu.sqlfilter.exception.BusinessException;
import com.lulu.sqlfilter.model.domain.User;
import com.lulu.sqlfilter.model.domain.request.SearchUserRequest;
import com.lulu.sqlfilter.service.UserService;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.annotation.Resource;

@RequestMapping("/user")
@CrossOrigin(originPatterns = "*",allowCredentials = "true")
public class UserController {
    @Resource
    private UserService userService;
    @GetMapping("/search")
  public BaseResponse<List<User>> searchUser(SearchUserRequest searchUserRequest){
        if(searchUserRequest==null){
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
      return ResultUtils.success(userService.getSearchUser(searchUserRequest));

    }
}

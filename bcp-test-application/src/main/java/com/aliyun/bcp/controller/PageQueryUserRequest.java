package com.aliyun.bcp.controller;

import com.aliyun.bcp.common.utils.PageQueryBaseRequest;
import lombok.Data;

/**
 * @author davisyou
 * @version 1.0
 * @date 2022/12/14 11:32 PM
 */
@Data
public class PageQueryUserRequest extends PageQueryBaseRequest {

    private Long uid;

    private String password;

    private String telephone;

    private String username;

}

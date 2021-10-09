package com.bob.workingarrangement.model;

import com.bob.workingarrangement.Enum.JobTypeEnum;
import lombok.Data;

@Data
public class UserInfo {

    // 姓名
    private String name;

    // 工作类型
    private JobTypeEnum jobType;
}

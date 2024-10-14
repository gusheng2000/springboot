package com.itheima.utils;

import lombok.Data;
//统一表现层接口返回值类型
@Data
public class R {
    private boolean flag;
    private Object data;

    public R() {
    }

    public R(boolean flag) {
        this.flag = flag;

    }

    public R(boolean flag, Object data) {
        this.flag = flag;
        this.data = data;
    }
}

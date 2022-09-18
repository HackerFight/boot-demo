package com.qiuguan.boot.bean;

import com.qiuguan.boot.resolver.EventEnum;
import lombok.Data;

/**
 * @author qiuguan
 * @date 2022/09/18 23:07:11  星期日
 */
@Data
public class EventBean {

    private String topic;

    private String taskId;

    private EventEnum eventEnum;

}

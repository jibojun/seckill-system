package com.seckill.service.mq;

import org.apache.kafka.clients.producer.KafkaProducer;

import java.util.HashMap;

/**
 * @Author: Bojun Ji
 * @Description:
 * @Date: 2018/8/31_12:07 AM
 */
public class MqProducer {
    //TODO: send request to service side, async
    KafkaProducer producer = new KafkaProducer(new HashMap<>());
}

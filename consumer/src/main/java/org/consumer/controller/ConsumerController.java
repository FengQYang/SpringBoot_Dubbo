package org.consumer.controller;

import org.consumer.service.ConsumerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author fqy
 * @date 2021/9/5 11:47
 */


@RestController
@RequestMapping("/Consumer")
public class ConsumerController {

    //2+2=4
    //3+3=6

    @Resource
    private ConsumerService consumerService;

    @GetMapping("/Hello")
    public String Hello(){
        return consumerService.HelloConsumer();
    }
}

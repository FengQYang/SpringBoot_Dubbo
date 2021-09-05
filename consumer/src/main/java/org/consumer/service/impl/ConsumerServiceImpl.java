package org.consumer.service.impl;

import org.apache.dubbo.config.annotation.DubboReference;
import org.consumer.service.ConsumerService;
import org.product.service.ProductService;
import org.springframework.stereotype.Service;

/**
 * @author fqy
 * @date 2021/9/5 11:44
 */

@Service  //这里引入的不是Dubbo的
public class ConsumerServiceImpl implements ConsumerService {

    @DubboReference  //引入Dubbo的注入配置
    private ProductService productService;


    public String HelloConsumer() {
        return productService.HelloProduct();
    }
}

package org.product.service.impl;


import org.apache.dubbo.config.annotation.DubboService;
import org.product.service.ProductService;

/**
 * @author fqy
 * @date 2021/9/5 11:40
 */

@DubboService  //暴露接口
public class ProductServiceImpl implements ProductService {

    public String HelloProduct() {
        return "我被远程调用了";
    }
}

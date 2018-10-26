package com.demo;

/**
 * 用途描述
 *
 * @author 胡晓磊
 * @version $Id: DemoServiceImpl, v0.1
 * @company 杭州信牛网络科技有限公司
 * @date 2018年10月26日 下午 3:12 胡晓磊 Exp $
 */
public class DemoServiceImpl implements DemoService {
    /**
     * 获取并返回用户姓名
     * @param name
     * @return java.lang.String
     * @author 胡晓磊
     * @version 1.0
     * @date 2018-10-26 15:12:33
     */
    @Override
    public String getName(String name) {
        return "My name is " + name;
    }
}

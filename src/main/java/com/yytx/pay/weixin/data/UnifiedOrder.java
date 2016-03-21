package com.yytx.pay.weixin.data;

import com.yytx.pay.weixin.bean.Configure;

import java.util.UUID;

/**
 * 统一下单输入对象
 * Created by domnli on 16/3/21.
 */
public class UnifiedOrder extends AbstractConfigureBase {

    public UnifiedOrder(Configure configure){
        super(configure);
        values.put("nonce_str", UUID.randomUUID().toString().replace("-", ""));
    }

    /**
     * 设备号
     * @param deviceInfo
     */
    public void setDeviceInfo(String deviceInfo){
        values.put("device_info",deviceInfo);
    }

    public String getDeviceInfo(){
        return (String) values.get("device_info");
    }

    /**
     * 随机字符串
     */
    public String getNonceStr(){
        return (String) values.get("nonce_str");
    }



}

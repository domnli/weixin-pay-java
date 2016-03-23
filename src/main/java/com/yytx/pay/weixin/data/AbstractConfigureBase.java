package com.yytx.pay.weixin.data;

import com.yytx.pay.weixin.bean.Configure;
import com.yytx.pay.weixin.common.Signature;

/**
 * 统一下单数据实体
 * Created by domnli on 16/3/21.
 */
public class AbstractConfigureBase extends AbstractBase {

    protected Configure configure;

    public AbstractConfigureBase(Configure configure){
        this.configure = configure;
    }

    /**
     * 应用ID
     */
    public void setAppId(){
        values.put("appid",configure.getAppId());
    }

    public String getAppId(){
        return (String) values.get("appid");
    }

    /**
     * 商户号
     */
    public void setMchId(){
        values.put("mch_id",configure.getMchId());
    }

    public String getMchId(){
        return (String) values.get("mch_id");
    }

    /**
     * 子商户号
     */
    public void setSubMchId(){
        values.put("sub_mch_id",configure.getSubMchId());
    }

    public String getSubMchId(){
        return (String) values.get("sub_mch_id");
    }

    /**
     * 签名
     */
    protected void setSign(){
        String sign = Signature.getSign(values,configure.getKey());
        values.put("sign",sign);
    }


}

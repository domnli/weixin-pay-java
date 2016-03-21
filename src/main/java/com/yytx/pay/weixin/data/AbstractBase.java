package com.yytx.pay.weixin.data;

import java.util.HashMap;
import java.util.Map;

/**
 * 微信数据基础类
 * Created by domnli on 16/3/21.
 */
public abstract class AbstractBase {
    protected Map<String,Object> values = new HashMap<>();

    public void fromXml(){

    }

    public String toXmlString(){
        return null;
    }

}

package com.yytx.pay.weixin.data;

import com.yytx.pay.weixin.bean.Configure;
import com.yytx.pay.weixin.common.MD5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/**
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

    public void setSign(){
        ArrayList<String> list = new ArrayList<String>();
        for(Map.Entry<String,Object> entry:values.entrySet()){
            if(entry.getValue()!=""){
                list.add(entry.getKey() + "=" + entry.getValue() + "&");
            }
        }
        int size = list.size();
        String [] arrayToSort = list.toArray(new String[size]);
        Arrays.sort(arrayToSort, String.CASE_INSENSITIVE_ORDER);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < size; i ++) {
            sb.append(arrayToSort[i]);
        }
        String result = sb.toString();
        result += "key=" + Configure.getKey();
        //Util.log("Sign Before MD5:" + result);
        result = MD5.MD5Encode(result).toUpperCase();
        //Util.log("Sign Result:" + result);
        return result;
    }
}

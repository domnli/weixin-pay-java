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
     * @param deviceInfo 设备号
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

    public void setSign(){
        // TODO 验证必填项

        super.setSign();
    }

    /**
     * 商品描述
     * @param body 商品描述
     */
    public void setBody(String body){
        values.put("body", body);
    }

    public String getBody(){
        return (String) values.get("body");
    }

    /**
     * 商品详情
     *  @param detail 商品详情
     */
    public void setDetail(String detail){
        values.put("detail",detail);
    }

    public String getDetail(){
        return (String) values.get("detail");
    }

    /**
     * 附加数据
     * @param attach 附加数据
     */
    public void setAttach(String attach){
        values.put("attach",attach);
    }

    public String getAttach(){
        return (String) values.get("attach");
    }

    /**
     * 商户订单号
     * @param outTradeNo 商户订单号
     */
    public void setOutTradeNo(String outTradeNo){
        values.put("out_trade_no",outTradeNo);
    }

    public String getOutTradeNo(){
        return (String) values.get("out_trade_no");
    }

    /**
     * 货币类型
     * @param feeType 货币类型
     */
    public void setFeeType(String feeType){
        values.put("fee_type",feeType);
    }
    public String getFeeType(){
        return (String) values.get("fee_type");
    }

    /**
     * 总金额
     * @param totalFee 总金额
     */
    public void setTotalFee(int totalFee){
        values.put("total_fee",totalFee);
    }

    public Integer getTotalFee(){
        return (Integer) values.get("total_fee");
    }

    /**
     * 终端ip
     * @param spbillCreateIp 终端ip
     */
    public void setSpbillCreateIp(String spbillCreateIp){
        values.put("spbill_create_ip",spbillCreateIp);
    }

    public String getSpbillCreateIp(){
        return (String) values.get("spbill_create_ip");
    }

    /**
     * 交易起始时间
     * @param timeStart 交易起始时间
     */
    public void setTimeStart(String timeStart){
        values.put("time_start",timeStart);
    }

    public String getTimeStart(){
        return (String) values.get("time_start");
    }

    /**
     * 交易结束时间
     * @param timeExpire 交易结束时间
     */
    public void setTimeExpire(String timeExpire){
        values.put("time_expire",timeExpire);
    }
    public String getTimeExpire(){
        return (String) values.get("time_expire");
    }

    /**
     * 商品标记
     * @param goodsTag 商品标记
     */
    public void setGoodsTag(String goodsTag){
        values.put("goods_tag",goodsTag);
    }
    public String getGoodsTag(){
        return (String) values.get("goods_tag");
    }

    /**
     * 通知地址
     * @param notifyUrl 通知地址
     */
    public void setNotifyUrl(String notifyUrl){
        values.put("notify_url",notifyUrl);
    }
    public String getNotifyUrl(){
        return (String) values.get("notify_url");
    }

    /**
     * 交易类型
     * @param tradeType 交易类型
     */
    public void setTradeType(String tradeType){
        values.put("trade_type",tradeType);
    }
    public String getTradeType(){
        return (String) values.get("trade_type");
    }

    /**
     * 指定支付方式
     * @param limitPay 指定支付方式
     */
    public void setLimitPay(String limitPay){
        values.put("limit_pay",limitPay);
    }

    public String getLimitPay(){
        return (String) values.get("limit_pay");
    }

}

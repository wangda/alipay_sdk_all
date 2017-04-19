package cn.trawe.alipay.consts;

/**
* @author 赵友强 
* @version 创建时间：2017年4月18日 下午2:18:26
* 类说明
*  控制支付宝sdk是否检查证书
*/

public class ValidCertSwitch {

    //默认是检查的
    public static boolean isValidCert = true;

    public boolean isValidCert() {
        return isValidCert;
    }

    public void setIsValidCert(boolean isValidCert) {
        ValidCertSwitch.isValidCert = isValidCert;
    }

    
}

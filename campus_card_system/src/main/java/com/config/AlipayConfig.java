package com.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {
//在这里配置基本信息
	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "9021000136625856";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCP+tpXRjUmLkHlqmOc+t3r9+920NgACWGQSYgnCw6n7KQbTPnptgPr5NMNXbxX76xsV0hjWnDrS8mT++HP7s163RnqhfHCy+QYsgkGK2nQ4Oh/bp49jAgZEF1szBYoxj+1NWckmgIvZST9y5oHQdtnEjwXyPjcezNRkdndCVPnUeW79hDuqx5eeTDFOM2yw90lU/f2CN2Axm6xTD74pW/EIVdVtKIvU3p/G/ecUgGjOLfd3Iy/eNwjuA8Ral9+QpYrsLH3Ur3jzZkJsZCNSIqu72FfbJTjAuKccQMaSbl6A/1xfSO4QNrLyYfjhL8a++z4lZu+ke0ncM6A0LLgi5JtAgMBAAECggEAeXfO4LZQfKel3JaFd5iFxV/k3L6QnGdNsib3AMlpUe5o/MdSSAPRByCDldEw5pdDRhvU7E0O2tOTeo+UEJKNNEx4Ys0iC49sHhGFX3kcyqYUP/4Y7h/HbS3LQ9BiGYA3my80l0J++XFBZgRxLBI5gZl2rTJWEdy2jOiZfssxyAKg+0I40vUV/npjy6sJFWcjc6+hGE+CEnUC2frsCXhnK6sKOzxqv+xazaj0W4a12YxmA7vEKVfVPKoqUTc6v99kvHRjNjqLYIihAdnbw8/NW4IgL+A+1F8uU8U+KTfjJJ3WXeJaksZ+vOHfa9fc0YQk73jKY2Vs+sZTzP6gL3TfWQKBgQDPjUQA++n/l9KpiHq+Z99m8l11eoPEznMWCVlt7Ly7jCJ6kkoB1ahcSUZJkqG+X/L5SQ9vbnDkykWMxdAZoXQAN2zg76ToddK1+mDshs7mTo1zuTaNVlguCR72eaE36KprFsApFBgIMdYwkTDWvGEGZcjk81R9u4POOse+OZrkowKBgQCxlrOGaMud8KAgzylwMv2bz3mTa3gVgt73bY3oTBcAmNkBwb8lFddVGIbuMzKFQA7Xpe8JDMhyhvIcYTV7/jCHXFX32v15S1P9yGCbcUtYOSiP+PC0MeqK2oPxpnkz+UOXsIy7IQ6U0dx3gvdK8E0219rPDhAawQpCxlDBGY8NrwKBgBFdRUI70UD0B8jtRS+m6xbm0hDhFiMiDpjaYWQD+WpLeBr/IDf1EyfdbYb8QJH33xEiHqt49vL9RUJYzmdGjbjy6iYLhqV4Lg/RichgIvE7wzPaXAkJH0mCs9d1J5rQ2WkqNxt4teYBnWTk0Mw2aHurilo1TW1TgdyAKHPux9m3AoGAFzpa6O20FEhw6VmvVdmViles0zdvUYD4oOxXb1bke1OCrtQkqDkfHSZEH8vag8tJJbOyfECLx08XQ9cDI+CvgET3iZ+/H6pWpg8bc7lx3Ww8ffhVo3wT7W1/bJAVslKcIK8a+S7ttVFtwMQEjGy57L53BDYWrSkqqmk+DsPFDkkCgYEAr7Jxe622DpjsbppX5lmxQkerGYC1lbo5Drnk4G+FB9U7ga9tMQcjZYCycUvc/g8+Oir1vQBkwCz0eIKzE5Y83rKjcHj59XQikJGxM0VpyUOIswQRQW4MOgINmSPdg50cEDKIuhyvhvj/VAyov1cQqZ8A2/hsPPylE8wM5647hXQ=";
	
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAj/raV0Y1Ji5B5apjnPrd6/fvdtDYAAlhkEmIJwsOp+ykG0z56bYD6+TTDV28V++sbFdIY1pw60vJk/vhz+7Net0Z6oXxwsvkGLIJBitp0ODof26ePYwIGRBdbMwWKMY/tTVnJJoCL2Uk/cuaB0HbZxI8F8j43HszUZHZ3QlT51Hlu/YQ7qseXnkwxTjNssPdJVP39gjdgMZusUw++KVvxCFXVbSiL1N6fxv3nFIBozi33dyMv3jcI7gPEWpffkKWK7Cx91K9482ZCbGQjUiKru9hX2yU4wLinHEDGkm5egP9cX0juEDay8mH44S/Gvvs+JWbvpHtJ3DOgNCy4IuSbQIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "https://90tpje167323.vicp.fun/ssmt9pm0/";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "https://90tpje167323.vicp.fun/ssmt9pm0/admin/dist/index.html#/";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi-sandbox.dl.alipaydev.com/gateway.do";
	
	// 支付宝网关
	public static String log_path = "C:\\";


    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}


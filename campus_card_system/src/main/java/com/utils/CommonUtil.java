package com.utils;

import java.util.Random;
import org.springframework.stereotype.Component;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.ss.usermodel.Cell;
import java.text.DecimalFormat;
import java.util.Objects;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

@Component
public class CommonUtil {
    private static JavaMailSenderImpl mailSender;
    
	@Autowired
	public void setMailSender(JavaMailSenderImpl mailSender) {
    	CommonUtil.mailSender = mailSender;
	}

	/**
     * 获取随机字符串
     *
     * @param num
     * @return
     */
    public static String getRandomString(Integer num) {
        String base = "abcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < num; i++) {
            int number = random.nextInt(base.length());
            sb.append(base.charAt(number));
        }
        return sb.toString();
    }

	/**
     * 获取随机验证码
     *
     * @param num
     * @return
     */
    public static String getRandomNumber(Integer num) {
        String base = "0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < num; i++) {
            int number = random.nextInt(base.length());
            sb.append(base.charAt(number));
        }
        return sb.toString();
    }

    public static String getCellValue(Cell cell) {
        String resultValue = "";
        // 判空
        if (Objects.isNull(cell)) {
            return resultValue;
        }

        // 拿到单元格类型
        int cellType = cell.getCellType();
        switch (cellType) {
            // 字符串类型
            case Cell.CELL_TYPE_STRING:
                resultValue = StringUtils.isEmpty(cell.getStringCellValue()) ? "" : cell.getStringCellValue().trim();
                break;
            // 布尔类型
            case Cell.CELL_TYPE_BOOLEAN:
                resultValue = String.valueOf(cell.getBooleanCellValue());
                break;
            // 数值类型
            case Cell.CELL_TYPE_NUMERIC:
                resultValue = new DecimalFormat("#.######").format(cell.getNumericCellValue());
                break;
            // 取空串
            default:
                break;
        }
        return resultValue;
    }

    /**
     * 邮件发送
     * @param recipient 收件人
     * @param subject 主题
     * @param content 内容
     */
    public static void sendEmail(String recipient,String subject,String content) {
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        try {
            MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage,true,"UTF-8");
            messageHelper.setFrom("yclw9@qq.com");//发件人
            messageHelper.setTo(recipient);
            messageHelper.setSubject(subject);
            messageHelper.setText(content,true);//true代表支持html格式
            mailSender.send(mimeMessage);
        } catch (MessagingException e) {
                e.printStackTrace();
        }
    }
}

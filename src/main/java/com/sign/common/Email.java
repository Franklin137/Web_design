package com.sign.common;

import com.sun.mail.util.MailSSLSocketFactory;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.security.GeneralSecurityException;
import java.util.Properties;

public class Email {
    public static void SendMail(String name,String content) throws GeneralSecurityException, MessagingException {
        try {
            String hi="<h1 style='color: red;'>Hello World！</h1>";
            String emailUser = "784095454@qq.com";
            String emailPwd = "glljraddnbqpbdff";
            String emailHost = "smtp.qq.com";
            String emailAuth = "true";
            String emailProtocol = "smtp";
            int emailPort = 25;

            //获取系统环境信息
            Properties props = System.getProperties();
            //设置邮件服务器
            props.setProperty("mail.smtp.host", emailHost);
            //设置密码认证
            props.setProperty("mail.smtp.auth", emailAuth);
            //设置传输协议
            props.setProperty("mail.transport.protocol", emailProtocol);
            //创建session对象
            Session session = Session.getInstance(props);
            //设置输出日志
            session.setDebug(true);

            //邮件发送对象
            MimeMessage message = new MimeMessage(session);
            //设置发件人
            message.setFrom(new InternetAddress(emailUser));
            //设置邮件主题
            message.setSubject("测试邮件");
            //设置邮件内容
//            message.setText("Welcome to JavaMail World!");
            //如果带网页内容使用Content发送
            message.setContent((content),"text/html;charset=utf-8");

            //获取邮件发送管道
            Transport transport=session.getTransport();
            //连接管道
            transport.connect(emailHost,emailPort, emailUser, emailPwd);
            //发送邮件
            transport.sendMessage(message,new Address[]{new InternetAddress(name)});
            //关闭管道
            transport.close();
        }
        catch (MessagingException e) {
            e.printStackTrace();
        }
    }

}

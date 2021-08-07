package com.sign.common;

import com.sun.mail.util.MailSSLSocketFactory;
import org.junit.jupiter.api.Test;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.security.GeneralSecurityException;
import java.util.Properties;

import static org.junit.jupiter.api.Assertions.*;

class EmailTest {
    @Test
    public void SendMail() throws GeneralSecurityException, MessagingException {
    }

}
package com.zking.util;

import javax.annotation.Resource;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;
import com.zking.dao.BuyListMapper;
import com.zking.dao.PaimaiInfoMapper;
import com.zking.enetity.message.paimaiinfo;
import com.zking.pojo.BuyList;
import com.zking.pojo.PaimaiInfo;

public class MessageReceiver implements MessageListener {
	@Resource
	private PaimaiInfoMapper paimaidao;
	
	private  Logger logger = LoggerFactory.getLogger(MessageReceiver.class);
	@Override
	public void onMessage(Message message) {
		if (message instanceof TextMessage) {
            TextMessage textMessage = (TextMessage) message;
            try {
                String text = textMessage.getText();
                logger.info("接收到消息: " + text);
                paimaiinfo paimaiinfo = new Gson().fromJson(text, paimaiinfo.class);
                PaimaiInfo record = new PaimaiInfo(paimaiinfo.getMoney(), paimaiinfo.getUser_id(), paimaiinfo.getBuylist_id());
                logger.info("插入记录"+paimaiinfo.toString());
                paimaidao.insert(record);
            } catch (JMSException e) {
            	logger.debug(e.getMessage());
            }
        }
	}
	
	

}

package cn.edu.hqu.javaee.chapter7_1.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.hqu.javaee.chapter7_1.domain.entity.Message;
import cn.edu.hqu.javaee.chapter7_1.repository.HquerRepository;
import cn.edu.hqu.javaee.chapter7_1.repository.MessageRepository;
import cn.edu.hqu.javaee.chapter7_1.service.MessageService;

@Service
public class MessageServiceImpl implements MessageService{

	@Autowired
	MessageRepository messageRepository;
	@Autowired
	HquerRepository hquerRepository;
	@Override
	public List<Message> getMessageByUserName(String userName) {
		
		return messageRepository.findMessageByUserId(hquerRepository.findByUserName(userName).getId());
	}
	@Override
	public void saveMessage(Message message) {
		messageRepository.save(message);
		
	}

}

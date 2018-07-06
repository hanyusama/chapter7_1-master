package cn.edu.hqu.javaee.chapter7_1.service;

import java.util.List;

import cn.edu.hqu.javaee.chapter7_1.domain.entity.Message;

public interface MessageService {
	public List<Message> getMessageByUserName(String userName);
	public void saveMessage(Message message);
	public List<Message> getMessageByAdministratorsName(String AdministratorsName);
	public void saveAdministratorsMessage(Message Administratorsmessage);
}

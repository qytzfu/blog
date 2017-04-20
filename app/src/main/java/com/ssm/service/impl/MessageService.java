package com.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.dao.MessageMapper;
import com.ssm.pojo.Message;
import com.ssm.service.IMessageService;

@Service("messageService")
public class MessageService implements IMessageService{
	@Autowired
	private MessageMapper messageMapper;
	
	@Override
	public Message findById(int id) {
		// TODO Auto-generated method stub
		return messageMapper.findById(id);
	}
	@Override
	public int insert(Message message) {
		// TODO Auto-generated method stub
		return messageMapper.insert(message);
	}
	@Override
	public int remove(int id) {
		// TODO Auto-generated method stub
		return messageMapper.remove(id);
	}
	@Override
	public int update(Message message) {
		// TODO Auto-generated method stub
		return messageMapper.update(message);
	}
	@Override
	public List<Message> getByReceiverId(int receiverId) {
		// TODO Auto-generated method stub
		return messageMapper.getByReceiverId(receiverId);
	}
}

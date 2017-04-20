package com.ssm.dao;

import java.util.List;

import com.ssm.pojo.Message;

public interface MessageMapper {
    public int insert(Message message);
    public int update(Message message);
    public Message findById(int id);
    public int remove(int id);
    
    public List<Message> getByReceiverId(int receiverId);
}

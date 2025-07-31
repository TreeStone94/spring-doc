package com.example.doc.user.service;

import com.example.doc.user.dto.mybatis.UserDTO;
import com.example.doc.user.dto.response.UserResponse;
import com.example.doc.user.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
	private final UserMapper userMapper;
	public UserResponse getUser(Long id) {
		UserDTO userDTO = userMapper.selectUserById(id);

		UserResponse userResponse = UserResponse.builder()
						.id(userDTO.getId())
						.email(userDTO.getEmail())
						.name(userDTO.getName())
						.build();
		return userResponse;
	}
}

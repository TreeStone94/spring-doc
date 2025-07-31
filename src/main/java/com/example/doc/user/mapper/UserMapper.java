package com.example.doc.user.mapper;

import com.example.doc.user.dto.mybatis.UserDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {
	/************************
	 * 리스트 조회
	 ***********************/
	/************************
    * 상세 조회
    ***********************/
	UserDTO selectUserById(@Param("id") long id);
	/************************
    * 등록
    ***********************/
	/************************
    * 수정
    ***********************/
	/************************
    * 삭제
    ***********************/
}

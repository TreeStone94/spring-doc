package com.example.doc.user.controller;

import com.example.doc.user.dto.response.UserResponse;
import com.example.doc.user.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
@Tag(name = "User", description = "사용자 관리 API")
@RequiredArgsConstructor
public class UserController {
	private final UserService userService;
	@GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	@Operation(summary = "사용자 조회", description = "ID로 사용자 정보를 조회 합니다.")
	@ApiResponses({
			@ApiResponse(responseCode = "200", description = "조회 성공"),
			@ApiResponse(responseCode = "404", description = "사용자 없음")
	})
	public ResponseEntity<UserResponse> getUser(@Parameter(description = "사용자 ID") @PathVariable Long id) {
		UserResponse userResponse = userService.getUser(id);
		return ResponseEntity.ok(userResponse);
	}
}

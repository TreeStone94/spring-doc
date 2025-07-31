package com.example.doc.user.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Schema(description = "사용자 기본 정보 응답")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserResponse {
	@Schema(description = "사용자 ID", example = "testId")
	private long id;
	@Schema(description = "사용자 이름", example = "홍길동")
	private String name;
	@Schema(description = "사용자 이메일", example = "testId@gmail.com")
	private String email;
}

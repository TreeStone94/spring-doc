package com.example.doc.user.dto.mybatis;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

	private long id;
	private String name;
	private String email;
}

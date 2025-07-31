package com.example.doc.config;

import com.example.doc.user.service.UserService;
import org.mockito.Mockito;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.restdocs.mockmvc.MockMvcRestDocumentation;
import org.springframework.restdocs.mockmvc.RestDocumentationResultHandler;
import org.springframework.restdocs.operation.preprocess.Preprocessors;
@TestConfiguration
public class RestDocsConfig {

	@Bean
	@Primary
	public RestDocumentationResultHandler write() {
		return MockMvcRestDocumentation.document(
				"{class-name}/{method-name}",
				Preprocessors.preprocessRequest(Preprocessors.prettyPrint()),
				Preprocessors.preprocessResponse(Preprocessors.prettyPrint())
		);
	}

	@Bean
	UserService userService() {
		return Mockito.mock(UserService.class);
	}
}

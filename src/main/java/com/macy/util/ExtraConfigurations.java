package com.macy.util;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExtraConfigurations {
	@Bean
	public ModelMapper getModelMapper() {
		return new ModelMapper();
	}
}

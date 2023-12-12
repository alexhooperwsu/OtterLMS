package com.otter.lms.otterlms;

import com.otter.lms.otterlms.controller.CourseController;
import com.otter.lms.otterlms.repository.CourseRepository;
import com.otter.lms.otterlms.service.CourseService;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class WebDemoApplicationTests {

	@Test
	void contextLoads(ApplicationContext context) {
		assertThat(context).isNotNull();
	}

	@Test
	void hasCourseRelatedBeansRegistered(ApplicationContext context) {
		assertThat(context.getBean(CourseController.class)).isNotNull();
		assertThat(context.getBean(CourseService.class)).isNotNull();
		assertThat(context.getBean(CourseRepository.class)).isNotNull();
	}

	@Test
	void hasModelMapperRegistered(ApplicationContext context) {
		assertThat(context.getBean(ModelMapper.class)).isNotNull();
	}

}

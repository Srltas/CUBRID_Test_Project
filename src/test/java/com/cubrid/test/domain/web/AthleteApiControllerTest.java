package com.cubrid.test.domain.web;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.cubrid.test.domain.Athlete;
import com.cubrid.test.domain.AthleteRepository;
import com.cubrid.test.web.dto.AthleteFindRequestDto;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class AthleteApiControllerTest {
	
	@LocalServerPort
	private int port;
	
	@Autowired
	private TestRestTemplate restTemplate;
	
	@Autowired
	private AthleteRepository athleteRepository;
	
//	@AfterEach
//	public void tearDown() throws Exception {
//		athleteRepository.deleteAll();
//	}
	
	@Test
	public void athlete_등록된다() throws Exception {
		//given
		int code = 16693;
		String name = "Kim Dong-min";
		char gender = 'M';
		String nationCode = "KOR";
		String event = "Pyeongchang";
		
		AthleteFindRequestDto requestDto = AthleteFindRequestDto.builder()
				.code(code)
				.name(name)
				.gender(gender)
				.nationCode(nationCode)
				.event(event)
				.build();
		
		String url = "http://localhost:" + port + "/list";
		
		//when
		ResponseEntity<Athlete> responseEntity = restTemplate.postForEntity(null, requestDto, Athlete.class);

		//then
		Assertions.assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);
		
	}

}

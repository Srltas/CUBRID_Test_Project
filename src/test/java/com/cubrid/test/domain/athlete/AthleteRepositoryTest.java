package com.cubrid.test.domain.athlete;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.cubrid.test.domain.Athlete;
import com.cubrid.test.domain.AthleteRepository;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class AthleteRepositoryTest {
	
	@Autowired
	AthleteRepository athleteRepository;
	
//	@AfterEach
//	public void cleanup() {
//		athleteRepository.deleteAll();
//	}
	
	@Test
	public void 선수_불러오기() {
		
		//when
		List<Athlete> athleteList = athleteRepository.findAll();
		
		//then
		Athlete athlete = athleteList.get(0);
		assertThat(athlete.getCode()).isEqualTo(10999);
		assertThat(athlete.getName()).isEqualTo("Fernandez Jesus");
		assertThat(athlete.getGender()).isEqualTo('M');
		assertThat(athlete.getNationCode()).isEqualTo("ESP");
		assertThat(athlete.getEvent()).isEqualTo("Handball");
	}
}

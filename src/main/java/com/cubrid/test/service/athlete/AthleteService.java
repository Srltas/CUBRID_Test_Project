package com.cubrid.test.service.athlete;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cubrid.test.domain.Athlete;
import com.cubrid.test.domain.AthleteRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class AthleteService {
	
	private final AthleteRepository athleteRepository;
	
	@Transactional
	public List<Athlete> findAll() {
		return athleteRepository.findAll();
	}
}

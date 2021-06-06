package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.Ranking;

public interface RankingRepository extends JpaRepository<Ranking, Integer> {
	
	List<Ranking> findTop5ByOrderByPontuacaoDesc(String nivel);
}

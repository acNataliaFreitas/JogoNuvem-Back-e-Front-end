package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Ranking;
import com.example.demo.repository.RankingRepository;


@RestController
@RequestMapping("/ranking")
public class RankingController {

	@Autowired
	private RankingRepository repository;

	@PostMapping
	@CrossOrigin
	Ranking gravaPontuacao(@RequestBody Ranking ranking) {
		return repository.save(ranking);
	}
	
	@GetMapping("/{nivel}")
	@CrossOrigin
	List<Ranking> rankingOrdenadoTop5(@PathVariable String nivel){
		return repository.findTop5ByOrderByPontuacaoDesc(nivel);
	}
	
	
}

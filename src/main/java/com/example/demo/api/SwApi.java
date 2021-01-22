package com.example.demo.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "swapi")
public interface SwApi {

	@GetMapping("/api/people/{num}/")
	public CharacterBean getCharacter(@PathVariable int num);
}

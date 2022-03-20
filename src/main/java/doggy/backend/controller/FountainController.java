package doggy.backend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import doggy.backend.domain.Fountain;
import doggy.backend.repository.FountainsRepository;

@RestController
@RequestMapping ("fountain")
public class FountainController {
	
	@GetMapping 
	public List<Fountain> getFountains(){
		return FountainsRepository.getInstance().getListFountain();
	}

}

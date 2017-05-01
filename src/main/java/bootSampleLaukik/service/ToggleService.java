package bootSampleLaukik.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import bootSampleLaukik.dao.ToggleRepository;
import bootSampleLaukik.model.Toggle;

@Service
@Transactional
public class ToggleService {

	private final ToggleRepository toggleRepository;
	public ToggleService(ToggleRepository toggleRepository) {
		super();
		this.toggleRepository = toggleRepository;
	}
	
	public List<Toggle> findAll(){
		List<Toggle> toggles = new ArrayList<Toggle>();
		for( Toggle toggle : toggleRepository.findAll()){
			toggles.add(toggle);
		}
		return toggles;
		toggleRepository.
	}


	
}

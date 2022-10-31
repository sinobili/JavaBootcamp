package Kodlama.io.Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.Kodlama.io.Devs.business.abstracts.LanguageService;
import Kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import Kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService {
	
	private LanguageRepository languageRepository;
	
	@Autowired
	public LanguageManager(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;	
	}

	@Override
	public List<Language> getAll() {
		// TODO Auto-generated method stub
		return languageRepository.getAll();
	}

	@Override
	public void add(Language language) throws Exception {
		if(!language.getName().isEmpty()) {
			for (int i = 0; i < languageRepository.getAll().size(); i++) {
				if (languageRepository.getAll().get(i).getName().equalsIgnoreCase(language.getName())) {
					throw new Exception("Dil adı tekrar edemez.");
				}
			}
			languageRepository.add(language);
		} else {
			throw new Exception("Programlama dili ismi boş olamaz.");
		}
		
	}

	@Override
	public void delete(Language language) {
		languageRepository.delete(language);
		
	}

	@Override
	public void update(Language language) {
		languageRepository.update(language);
		
	}

	@Override
	public Language getById(int id) {
		
		return languageRepository.getById(id);
	}

}

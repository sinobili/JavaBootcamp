package Kodlama.io.Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import Kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import Kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository{

	List<Language> languages;
	public InMemoryLanguageRepository() {
		languages = new ArrayList<Language>();
		languages.add(new Language(1,"C#"));
		languages.add(new Language(2,"java"));
		languages.add(new Language(3,"Python"));
	}
	
	@Override
	public List<Language> getAll() {
		// TODO Auto-generated method stub
		return languages;
	}

	@Override
	public void add(Language language) {
		languages.add(language);
		
	}

	@Override
	public void delete(Language language) {
		Language languageDelete = null;
		for (int i = 0; i < languages.size(); i++) {
			if (language.getId() == languages.get(i).getId()) {
				languageDelete = languages.get(i);
			}
		}
		languages.remove(languageDelete);
		
	}

	@Override
	public void update(Language language) {
		Language languageUpdate = null;
		for (int i = 0; i < languages.size(); i++) {
			if (language.getId() == languages.get(i).getId()) {
				languageUpdate = languages.get(i);
			}
		}
		languageUpdate.setId(language.getId());
		languageUpdate.setName(language.getName());
		
	}

	@Override
	public Language getById(int id) {
			for (int i = 0; i < languages.size(); i++) {
				if (languages.get(i).getId() == id) {
					return languages.get(i);
				}
			}
		return null;
	}

}

package Kodlama.io.Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import Kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

public interface LanguageRepository {

	List<Language> getAll();	
	
	void add(Language language);
	void delete(Language language);
	void update(Language language);
	Language getById(int id);
	
}

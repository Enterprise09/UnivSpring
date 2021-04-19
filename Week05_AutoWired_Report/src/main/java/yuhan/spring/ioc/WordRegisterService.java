package yuhan.spring.ioc;

import org.springframework.beans.factory.annotation.Autowired;

public class WordRegisterService {
	
	
	private WordDao wordDao;

	public WordRegisterService() {
		
	}

	@Autowired
	public WordRegisterService(WordDao wordDao) {
		this.wordDao = wordDao;
	}

	public void register(WordSet wordSet) {
	String wordKey = wordSet.getWordKey();
	if(verify(wordKey)) {	//같은 데이터가 없는지 확인하여 insert실행여부 결정
		wordDao.insert(wordSet);
	} else {
		System.out.println("The word has already registered.");
		}
	}

	//같은 데이터가 있는지 확인하여 bool값을 리턴한다.
	public boolean verify(String wordKey) {	
		WordSet wordSet = wordDao.select(wordKey);
		return wordSet == null ? true : false;
	}

	public void setWordDao(WordDao wordDao) {
		this.wordDao = wordDao;
	}
}

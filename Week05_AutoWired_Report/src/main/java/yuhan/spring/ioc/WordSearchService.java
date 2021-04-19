package yuhan.spring.ioc;

import org.springframework.beans.factory.annotation.Autowired;

public class WordSearchService {
	
	
	private WordDao wordDao;

	public WordSearchService() {
		
	}

	@Autowired
	public WordSearchService(WordDao wordDao) {
		this.wordDao = wordDao;
	}

	public WordSet searchWord(String wordKey) {
		if(verify(wordKey)) {	//존재하지 않는 값이면 실행됨
			return wordDao.select(wordKey);
		} 
		else {		//존재하는 값이면 사용가능한 데이터임을 알려줌
			System.out.println("WordKey information is available.");
		}

		return null;
	}

	//존재하는 데이터인지를 판단하여 bool값으로 리턴한다.
	public boolean verify(String wordKey) {
		WordSet wordSet = wordDao.select(wordKey);
		return wordSet != null ? true : false;
	}

	public void setWordDao(WordDao wordDao) {
		this.wordDao = wordDao;
	}

}

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
	if(verify(wordKey)) {	//���� �����Ͱ� ������ Ȯ���Ͽ� insert���࿩�� ����
		wordDao.insert(wordSet);
	} else {
		System.out.println("The word has already registered.");
		}
	}

	//���� �����Ͱ� �ִ��� Ȯ���Ͽ� bool���� �����Ѵ�.
	public boolean verify(String wordKey) {	
		WordSet wordSet = wordDao.select(wordKey);
		return wordSet == null ? true : false;
	}

	public void setWordDao(WordDao wordDao) {
		this.wordDao = wordDao;
	}
}

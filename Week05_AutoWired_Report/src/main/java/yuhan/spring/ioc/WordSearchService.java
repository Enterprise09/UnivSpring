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
		if(verify(wordKey)) {	//�������� �ʴ� ���̸� �����
			return wordDao.select(wordKey);
		} 
		else {		//�����ϴ� ���̸� ��밡���� ���������� �˷���
			System.out.println("WordKey information is available.");
		}

		return null;
	}

	//�����ϴ� ������������ �Ǵ��Ͽ� bool������ �����Ѵ�.
	public boolean verify(String wordKey) {
		WordSet wordSet = wordDao.select(wordKey);
		return wordSet != null ? true : false;
	}

	public void setWordDao(WordDao wordDao) {
		this.wordDao = wordDao;
	}

}

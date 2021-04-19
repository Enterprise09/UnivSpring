package yuhan.spring.ioc;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		String[] swlanguage = {"c", "c++", "java", "jsp",  "spring"};
		String[] discription = {"C�� 1972�� �� �轼�� ���Ͻ� ��ġ�� ���н� � ü������ ����ϱ� ���� ������ ���α׷��� ����̴�.",
		           "C++�� AT&T �� �������� ��߳� ��Ʈ�ӽ�Ʈ���� 1983�� ��ǥ�Ͽ� ������ ���α׷��� ����̴�.", 
		           "�ڹٴ� �� ����ũ�νý������� ���ӽ�����(James Gosling)�� �ٸ� ���������� ������ ��ü ������ ���α׷��� ����̴�.",
		           "JSP�� HTML���� �ڹ� �ڵ带 �����Ͽ� �� �������� �������� �� �������� �����Ͽ� �� �������� �����ִ� ����̴�.", 
		           "������ �����ӿ�ũ�� �ڹ� �÷����� ���� ���¼ҽ� ���ø����̼� �����ӿ�ũ�μ� ���� �����߿� ���帹�� ���Ǵ������ӿ�ũ�κҸ���."};

		//appConfig.xml �������� ���
		GenericXmlApplicationContext ctx = 
			new GenericXmlApplicationContext("classpath:appConfig.xml");

		
		//WordRegisterService��ü ����
		WordRegisterService registerService = 
		    ctx.getBean("registerService", WordRegisterService.class);
		    
		
		for (int i = 0; i < discription.length; i++) { 				
			//WordSet ��ü ���� > �������� �Ű����� �ѱ� > DB�� �����Ŵ
			//�������� ��ü�� swlanguage�� discription�� �̿��Ͽ� �ݺ������� ����
		    WordSet wordSet = new  WordSet(swlanguage[i], discription[i]);
		    registerService.register(wordSet); 	//������ ������ WordRegisterService�� �޼ҵ带 Ȱ��
		}
		 
		
		//WordSearchService��ü ����
		WordSearchService searchService = 
		ctx.getBean("searchService", WordSearchService.class);

		System.out.println(" \n \n------------------------------------");
		
		for (int i = 0; i < swlanguage.length; i++) {			
			//���ο� WordSet ��ü ���� 
			//DB�� ����� �����͸� ȭ�鿡 ���
			WordSet wordSet = searchService.searchWord(swlanguage[i]);
			System.out.print(wordSet.getWordKey() + " \t: ");
			System.out.println(wordSet.getWordValue());
			System.out.println("[��ó:��Ű�ǵ��(https://www.wikipedia.org/)]");
			System.out.println("------------------------------------");
		}
		System.out.println(" \n \n");

		ctx.close();

		}

	}



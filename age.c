#include<stdio.h>
main()
{
	int age ;
	printf("��ɺ����س�\n���䣺");
	scanf_s("%d",&age);
	if (age < 18)
		printf("δ����\n");
	else if (age >= 18 && age <=19)
		printf("С����\n");
	else if (age > 19 && age <= 58)
		printf("��ͬ־\n");
	else if (age > 58 && age <= 100)
		printf("ɨ��ɮ\n");
	else if (age > 100)
		printf("�ϲ���\n");
	system("pause");
	return 0;
}
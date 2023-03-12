#include<stdio.h>
main()
{
	int age ;
	printf("完成后点击回车\n年龄：");
	scanf_s("%d",&age);
	if (age < 18)
		printf("未成年\n");
	else if (age >= 18 && age <=19)
		printf("小青年\n");
	else if (age > 19 && age <= 58)
		printf("老同志\n");
	else if (age > 58 && age <= 100)
		printf("扫地僧\n");
	else if (age > 100)
		printf("老不死\n");
	system("pause");
	return 0;
}
#include <stdio.h>
#include <time.h>
#include <stdlib.h>
//��ӡ�˵�����
void menu()
{
	printf("****************\n");
	printf("*****��ʼ��Ϸ��1��*****\n");
	printf("*****�˳���Ϸ��2��*****�ǵð��س�emo\n");
	printf("****************\n�����Χ��1-100Ŷ");
}
void game()
{
	int ret = rand() % 100 + 1;//��֤������ķ�Χ��1-100
	int guess = 0;
	while (1)
	{
		printf("��������²������:\n");
		scanf_s("%d", &guess);
		if (guess == ret)
		{
			printf("�¶��ˣ�\n");
			break;
		}
		else if (guess > ret)
		{
			printf("�´��ˣ�\n");
		}
		else
		{
			printf("��С��!\n");
		}
	}
}
int main9()
{
	srand((unsigned int)time(NULL));
	while (1)
	{
		menu();
		int input = 0;
		printf("��ѡ��:\n");
		scanf_s("%d", &input);
		system("cls");
		switch (input)
		{
		case 1:
			game();
			break;
		case 0:printf("�����˳���\n");
			system("pause");
			return 0;
			break;
		default:printf("�����������������:\n");
			break;
		}
	}
	return 0;
}
#include <stdio.h>
#include <time.h>
#include <stdlib.h>
//打印菜单函数
void menu()
{
	printf("****************\n");
	printf("*****开始游戏（1）*****\n");
	printf("*****退出游戏（2）*****记得按回车emo\n");
	printf("****************\n这个范围是1-100哦");
}
void game()
{
	int ret = rand() % 100 + 1;//保证随机数的范围是1-100
	int guess = 0;
	while (1)
	{
		printf("请输入你猜测的数字:\n");
		scanf_s("%d", &guess);
		if (guess == ret)
		{
			printf("猜对了！\n");
			break;
		}
		else if (guess > ret)
		{
			printf("猜大了！\n");
		}
		else
		{
			printf("猜小了!\n");
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
		printf("请选择:\n");
		scanf_s("%d", &input);
		system("cls");
		switch (input)
		{
		case 1:
			game();
			break;
		case 0:printf("程序退出！\n");
			system("pause");
			return 0;
			break;
		default:printf("输入错误，请重新输入:\n");
			break;
		}
	}
	return 0;
}
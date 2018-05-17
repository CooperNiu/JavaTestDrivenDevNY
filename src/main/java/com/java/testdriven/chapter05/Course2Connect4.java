package com.java.testdriven.chapter05;

/**
 * 	Connect4
 *	
 *
 *	Connect4是一款流行的桌面游戏，其规则少而简单，玩起来很容易。
 *
 *	Connect4是一款两人玩的连接游戏。
 *	玩家首先选择颜色，然后轮流将碟片放入7列6行的网格中。
 *	碟片垂直下落，停留在当前列中下一个未占据的位置。
 *	玩家的目标是抢在对手前将自己的4个相邻碟片排成水平线、垂直线或对角线。
 *
 *	参阅维基百科（http://en.wikipedia.org/wiki/Connect_Four）。
 *	@author hzweiyongqiang
 */
public class Course2Connect4 {

	/**
	 * 	需求
	 * 
	(1) 棋盘为7列6行，所有格子都是空的。
	(2) 玩家从列顶放入碟片。如果整列为空，放入的碟片将落到底部。在特定列中，后放入的碟片将叠在前面放入的碟片之上。
	(3) 这是一款两人玩的游戏，每位玩家的碟片用一种颜色表示：一位玩家为红色（'R'），另一位玩家为绿色（'G'）。玩家轮流放入碟片，每次放入一个。
	(4) 我们要在玩家放入碟片或发生错误时提供反馈：每当玩家放入碟片后，都使用输出指出棋盘状态。
	(5) 无法再放入碟片时游戏结束，结果为平局。
	(6) 玩家放入碟片后，如果将其3个以上碟片连成垂直线，该玩家将获胜。
	(7) 玩家放入碟片后，如果将其3个以上碟片连成水平线，该玩家将获胜。
	(8) 玩家放入碟片后，如果将其3个以上碟片连成对角线，该玩家将获胜。
	 */
}

package com.java.testdriven.chapter04;


/**
 * 	创建项目
 * 
 * 	
 * 	从Git仓库导入项目：
 * 	https://bitbucket.org/vfarcic/tdd-java-ch04-ship.git
 * 
 * 	创建了所有辅助类： Direction 、Location 、 Planet 和 Point 。
 * 
 * 	相应的测试类也已编写好，它们的名称与被测试的类相同，但包含后缀 Spec （如 DirectionSpec ）。
 * 	使用这个后缀旨在明确这样一点：它们不仅用于验证代码，还是可执行的规范。
 *	
 *	除这些辅助类外，还有另外两个类： Ship （实现）和 ShipSpec （规范/测试），我们的大部分时间都将花在完善它们上。
 *	将在 ShipSpec 中编写测试，再在 Ship 类中编写实现代码
 *	
 *	@author hzweiyongqiang
 */
public class Course5DevShipAll {

	/**
	 * 	每次修改实现代码后都再次运行所有测试。
	 * 
	 * 	这确保对代码所做的修改不会带来任何意外的副作用。
	 * 
	 * 	最理想的情况是，测试的执行速度很快，且开发人员能够在本地运行。
	 * 	将代码提交给版本控制系统后，应再次运行所有测试，确认代码合并没有带来任何问题。
	 * 	多位开发人员协作开发代码时，这显得尤其重要。
	 */
	
	/**
	 * 	应编写尽可能简单的代码，只要让测试能够通过即可。
	 * 	这可确保设计越来越清晰，并避免包含多余功能。
	 * 
	 * 	这里的理念是，实现越简单，产品越好，维护也越容易。
	 * 	这种理念遵循了KISS原则，该原则指出，对大多数系统而言，保持简单而不是复杂化的效果最好。
	 * 	因此设计的主要目标是简约，必须避免不必要的复杂性。
	 */
	
	/**
	 * 	仅当所有测试都通过后才重构
	 * 	这样做的优点是：重构是安全的。
	 * 	如果所有可能受影响的实现代码都有测试，且所有测试都通过，那么重构将是相对安全的。
	 * 	大多数情况下不需要添加新的测试，而只需对既有测试做细微的修改即可。
	 * 	重构的预期结果是，在修改代码之前和之后，所有测试都能通过。
	 */
}

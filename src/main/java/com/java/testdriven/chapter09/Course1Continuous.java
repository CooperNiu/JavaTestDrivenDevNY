package com.java.testdriven.chapter09;

/**
 * 	持续集成、持续交付和持续部署
 * 
 * 
 * 	测试驱动开发与持续集成（CI）、持续交付和持续部署（CD）相辅相成。
 * 
 * 	持续集成、持续交付和持续部署虽然有些差别，但它们的目标类似，即都力图不断验证代码可否部署到生产环境。
 * 	它们与TDD很像，都提倡采用极短的开发周期持续验证当前编写的代码，旨在确保应用程序始终处于可部署到生产环境的状态。
 *	
 *	@author hzweiyongqiang
 */
public class Course1Continuous {

	/**
	 * 	【持续集成】
	 * 	持续集成意味着始终将代码与系统的其他部分集成起来，让问题快速浮出水面。
	 * 	发现问题后，将优先修复导致问题的原因，推后新的开发工作。
	 */
	
	/**
	 * 	【持续交付】
	 * 	持续交付很像持续集成，但比后者更进一步，将整个流水线都自动化（部署到生产环境除外）。
	 * 	每次将代码提交到仓库并通过所有验证后，便可部署到生产环境。
	 * 
	 * 	“持续交付是一种软件开发准则，通过采用合适的开发方式确保软件在任何时候都可发布到生产环境。”——Martin Fowler
	 */
	
	/**
	 * 	【持续部署】
	 * 	如果有关部署内容的决策也是自动做出的，持续交付就变成持续部署。
	 * 
	 * 	要持续将代码交付到生产环境，必须满足如下条件：
	 * 	要么没有分支，要么分支从被创建到被集成到主干（mainline）的时间很短（不超过一天，最好只有几小时）；否则就不能持续验证代码。
	 */
	
	/**
	 * 	【与TDD关系】
	 * 	提交代码前必须创建验证，这是将这些技术与TDD联系起来的纽带。
	 * 	如果不预先创建这些验证，提交到仓库的代码将没有配套测试，整个过程将以失败告终。
	 * 	如果没有测试，我们就没法对开发的代码充满信心；如果没有TDD，就没有与实现代码配套的测试。
	 * 
	 * 	持续集成、持续交付和持续部署依赖于与实现代码配套的测试，即依赖于TDD，还要求不使用分支或确保分支的存活时间极短（被频繁地合并到主干）。
	 */
	
	
}

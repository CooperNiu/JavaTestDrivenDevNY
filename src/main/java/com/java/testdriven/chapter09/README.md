#### 第 9 章：功能开关——将未完成的功能部署到生产环境 ####
TDD 不仅让开发过程更容易，还可缩短编写高质量代码所需的时间。  
TDD 还能带来另一个好处：由于代码经过了测试，其正确性得到广泛证明。  
因此我们可进一步认为，所有测试都通过后，便可将代码部署到生产环境。
  
有一些基于这种理念的软件生命周期方法。   
本章将介绍一些极限编程实践，如持续集成、持续交付和持续部署。
##### 本章目录及程序实现 #####
1.	[持续集成、持续交付和持续部署](Course1Continuous.java)  
2.	[功能开关](Course2FeatureToggles.java)   
3.	[功能开关示例](Course30Example.java)   
	3.1	[实现 fibonacci 服务](Course31Fibonacci.java)  
	3.2	[使用模版引擎](Course32TemplateEngine.java)   
    
##### 小结 #####
-	功能开关为在生产环境中隐藏和处理未完成的功能提供了不错的途径。
-	根据需要将代码部署到生产环境时，使用功能开关好像有点怪。
-	但需要持续集成、持续交付或持续部署时，经常使用功能开关。
-	实现了两种不同的方法：针对简单REST API的功能开关；在Web应用程序中使用功能开关。

## 第一章 Spring之旅(要点)
### 简化Java开发
#### 激发POJO的潜能
- 非侵入式编程

#### 依赖注入
- 低耦合，高内聚
1. 对象的依赖关系将由系统中负责协调个对象并在创建对象时候进行设定，对象本身无需创建/管理这种依赖关系。
2. Spring通过Application Context进行依赖注入。

#### 应用切面
- 可复用
1. AOP旨在促使系统服务组件分离。
2. AOP中的系统服务被称为横切关注点(point-cut)。

#### 使用模板消除样板式代码
Spring通过模板封装来消除样板式代码。

### 容纳你的Bean
Spring自带多个容器进行实现，主要归为Bean Factory和Application Context两种类型。
#### 使用ApplicationContext
1. AnnotationConfigApplicationContext: 从一个或多个基于Java的配置类加载Spring应用上下文。
2. AnnotationConfigWebApplicationContext:  从一个或多个基于Java的配置类加载Spring Web应用上下文。
3. ClassPathXmlApplicationContext: 从类路径一个或多个XML配置文件加载上下文定义。
4. FileSystemXmlApplicationContext: 从文件系统下的一个或多个XML配置文件加载上下文定义。
5. XmlWebApplicationContext: 从Web应用下的一个或多个XML配置文件加载上下文定义。
#### bean的生命周期
1. Spring对Bean实例化，
2. Spring将值和Bean的引用注入到Bean对应的属性中，
3. 如果实现BeanNameAware接口，Spring将Bean的ID传递给setBeanName()。
4. 如果实现BeanFactoryAware接口，Spring调用setBeanFactory()把BeanFactory容器实例传入。
5. 如果实现ApplicationContextAware接口，Spring调用setApplication()把bean的应用上下文传递过来。
6. 如果实现BeanPostProcessor接口，Spring调用postProcessorBeforeInitialization()。
7. 如果实现InitializingBean接口，Spring调用afterPropertiesSet()方法。
8. 如果实现BeanPostProcessor接口，Spring调用postProcessorAfterInitialization()。
9. Bean已经准备就绪可以使用，它会一直驻留在应用上下文中。
10. 如果实现DisposableBean接口，Spring调用destroy()。

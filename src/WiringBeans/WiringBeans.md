## 第二章 装配Bean(要点)
### Spring配置的可选方案
- 在XML中进行显示配置
- 在Java中进行显示配置
- 隐式的Bean发现机制和自动装配
### 自动化装配Bean
- Component Scanning: 自动发现应用上下文所创建的Bean
- Autowiring: Spring自动满足Bean之间的依赖

#### 创建可被发现的Bean
- @Component: 表明这个类是组件类，告知Spring要为这个类创建Bean
- @ComponentScan: 启用组件扫描（默认不启动），扫描与配置类相同的包和子包，查找带有@ComponentScan的类并自动创建Bean


#### 为扫描的组件命名
- 通过@Component("AnotherID"")可以为Bean设置不同的ID

#### 设置组件扫描的基础包
- 通过@ComponentScan("packagePosition")可以为设置扫描的包
- 通过@ComponentScan(basePackage = {"packagePosition1","packagePosition2"...})可是设置多个扫描包

#### 通过为Bean添加注解实现自动装配
- 声明@Autowired可以让Spring寻找匹配某个Bean需求的其他Bean
- @Autowired允许用在构造器，类方法进行依赖注入

### 通过Java代码装配Bean
有时候自动化配置行不通: 比如在第三方组件配置应用，无法在它的类声明组件注解。

#### 声明简单的Bean
- @Bean注解: 返回一个对象，这个对象要注册为Spring应用上下文的Bean。通过@Bean(name="name")重命名bean

#### 借助JavaConfig实现注入(依赖注入)
- 通过引用创建Bean的方法
> Spring默认的Bean都是单例的，当通过引用创建Bean的方法，Spring会拦截它所有的调用，并确保直接返回该方法
所创建的bean(而不是实际的调用)

- 通过将依赖的Bean作为参数
> 不要求二者在一个配置类中，可以将配置分散到多个配置类、Xml文件及自动扫描中

- 带有Bean的方法可以采用java任何函数进行注入并生成Bean

### 通过XML代码装配Bean
#### 声明简单的Bean
- 通过<Bean>元素生成

#### 借助构造器注入初始化Bean
- <constructor-arg ref>元素进行依赖注入
- <constructor-arg value>元素对字面变量进行注入

#### 设置属性
- <bean class>声明依赖注入

### 导入和混合配置
#### 在java中引用XML配置
- @Import(class)引用配置类
- @ImportResource("xmlPath"")引用XML配置

#### 在XML中引用JAVA配置
- <bean class>引用配置类
- <import resource="path">引用XML配置
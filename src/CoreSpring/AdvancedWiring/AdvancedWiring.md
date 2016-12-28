## 第三章 高级装配
### Spring Profile
#### 环境与Profile
- 开发环境: EmbeddeDatabaseBuilder对象可以使用嵌入式的Hypersonic数据库
- 生产环境: Jndi从容器中获取数据源

#### 配置profile bean
Spring是在运行时做出bean创建/不创建的决策，而不是在构建时
- 配置Profile bean，需要保证对应的bean处于激活状态
- 采用@Profile注解应用在类级别上能够配置Profile

#### 激活Profile
- 依赖两个属性: spring.profiles.active(优先)，spring.profiles.default
设置这两个属性的方法
1. 作为DispatcherServlet的初始化参数
2. 作为Web应用的上下文参数
3. 环境变量
4. 在集成测试类上，用@ActiveProfiles注解设置
- 推荐:在web应用中的web.xml设置参数

#### 使用Profile进行测试
用@ActiveProfiles注解激活Profile

### 条件化的Bean
- @Conditional进行条件化判断
#### 条件化配置Bean
- @Conditional(class)中的class文件需要实现Condition接口，重写matches(ConditionContext context,AnnotatedTypeMetadata data)方法
通过ConditionContext可以获取以下:
1. 返回BanDefinitionRegistry检查Bean定义
2. 返回ConfigurableListableBeanFactory检查Bean是否存在，甚至检查bean的属性
3. 返回Environment检查环境变量的值
4. 返回ResourceLoader检查加载的资源
5. 返回Classloader加载并检查类的存在

- @Profile本身也是借助@Condition注解实现的
#### 处理自动装配的歧义性
- 通过@Primary设置为首选
- 通过@Qualifier指向bean的ID
- 自定义注解

### bean的作用域
- bean默认采用单例模式
- 原型模式: 每次注入/通过上下文获取时候，都会创建一个新的Bean
- 会话模式: 为每一个会话创建一个bean
- 请求模式: 为每一个请求创建一个bean

#### 使用会话和请求作用域
- 采用@Scope注解指定作用域
- proxyMode属性设置代理类/代理接口注入

### 运行值注入
- 采用@PropertySource引用外部配置文件，自动装配Environment变量通过getProperty()获取值
- 通过@Value占位符进行注入

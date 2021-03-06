## 第四章 面向切面的spring(要点)
### 什么是面向切面编程
为了重用通用功能，其中:
- 继承: 每个类使用相同的基类，导致一个脆弱的对象体系
- 委托: 对委托对象进行复杂的调用
- 面向切面: 通过声明的方式这个功能要以何种方式在何处应用，无需修改原始类
面向切面编程的好处在与非侵入式编程
#### 定义aop术语
- 通知(advice): 定义了切面是什么，什么时候使用，spring切面可以应用五种类型通知:
> 1. Before: 目标方法被调用之前调用通知
> 2. After: 目标方法完成之后调用通知（不会关心方法的输出）
> 3. After-returning: 在目标方法成功执行之后调用通知
> 4. After-throwing: 在目标方法抛出异常后调用通知
> 5. Around: 通知包裹了被通知的方法，被通知方法调用之前/之后的自定义行为

- 连接点(Join point): 在应用执行过程中能够插入切面的一个点（如调用方法时，抛出异常时），可以利用这些连接点添加新的行为。
- 切点(Pointcut): 定义了切面在何处匹配通知，来织入一个或者俄多个的连接点
- 切面（Aspect): 切面是通知和切点的结合，共同定义了切面的全部内容:它是什么，在何时何处完成功能
- 引入(Introduction): 对我们现有的类添加新方法或者属性
- 织入(Weaving): 把切面应用到目标对象并创建新的代理对象的过程，在目标对象的生命周期有多个点可以织入
> 编译器: 编译织入（AspectJ)
> 类加载期: 目标类加载到JVM织入，需要特殊的ClassLoader
> 运行期: 运行类进行织入（Spring AOP）

#### Spring对AOP的支持
- 基于代理的经典Spring AOP
- 纯POJO切面
- @AspectJ注解驱动的切面
- 注入式AspectJ切面


Spring在运行时的通知对象原理:
- 在代理类包裹切面，Spring在运行期织入到Spring的管理Bean中，拦截被通知方法的调用，执行切面逻辑再把调用转发给真正的目标Bean，执行目标方法。
- Spring只支持方法级别的连接点
### 通过切点来选择连接点
Spring需要借助AspectJ的切点表达式语言来定义Spring切面

- arg(): 限制连接点匹配参数为指定类型的执行方法
- @args(): 限制连接点匹配参数为指定注解标注的执行方法
- execution(): 用于匹配是连接点的执行方法
- this(): 限制连接点匹配AOP代理的bean引用为指定类型的类
- target(): 限制连接点匹配目标对象为制指定类型的类
- @target(): 限制连接点匹配特定的执行对象，这些对象对应的类要具有指定类型的注解
- within(): 限制连接点匹配指定的类型
- @within(): 限制连接点匹配指定注解的类型

### 使用注解创建切面

- @AspecJ注解定义一个切面POJO
- @Pointcut注解定义频繁使用的切点
- @Around注解创建环绕通知，即让逻辑被通知的目标方法完全包装起来
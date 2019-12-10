## application even
spring 事件，为bean和bean的消息通信提供了支持，当一个bean通知另一个bean进行操作的时候，我们可以使用application event
+ 流程
    + 自定义事件，继承ApplicationEvent
    + 自定义事件监听器
    + 使用容器发布事件
+ demo1 同步的事件通知(application event 默认是同步的) 
+ demo2 异步通知事件 只需要在监听器方法上（onApplicationEvent(ApplicationEvent event)）添加@Async注解即可 
    + 只添加@Async注解没起作用，如何解决
    + 配置文件上添加 @EnableAsync springboot 在启动类上添加即可@EnableAsync 作用是使@Async起作用
- 输出结果：
  进入同步
  进入异步
  hello sync
  结束
  hello async
  
    
# springboot-time
Date 如果不格式化，打印的日期可读性查，
如果格式化，使用SimpleDateFormat进行时间格式化，但是由于SimpleDateFormat使用Calendar进行格式化
Calendar是共享变量，没有做线程安全控制，当多个线程同时使用SimpleDateFormat对象时，【static修饰的SimpleDateFormat】
对导致一个线程刚测试号time,另外一个线程会马上把设置的time值修改了，导致返回的时间有问题。
那么多线程如何保证线程安全，避免线程之前共享一个SimpleDateFormat对象，
每个线程使用都创建一次SimpleDateFormat对象 => 创建和销毁对象的开销大 -
对使用format和parse方法的地方进行加锁 => 线程阻塞性能差 - 使用ThreadLocal保证每个线程最多只创建一次SimpleDateFormat对象 => 较好的方法


LocalDate 只会获取年月日
LocalTime 只会获取几点几分几秒
LocalDateTime 获取年月日时分秒，等于LocalDate+LocalTime


SpringBoot中应用LocalDateTime
1）将LocalDateTime字段以时间戳的方式返回给前端 添加日期转化类 LocalDateTimeConverter
字段上添加@JsonSerialize(using = LocalDateTimeConverter.class)

2）将LocalDateTime字段以指定格式化日期的方式返回给前端
在字段前注解@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")

3）对前端传入的日期进行格式化
在LocalDateTime上添加@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")即可。
需要引入依赖joda-time（处理日期时间的库）



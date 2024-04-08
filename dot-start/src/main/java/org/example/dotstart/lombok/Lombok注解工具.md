## val
终于来了轻松的final局部变量。
## var
变了！轻松的局部变量。
## @NonNull
或者：我是如何学会停止担心并爱上NullPointerException的。
## @Cleanup
自动资源管理：安全地调用您的 close() 方法，没有任何麻烦。
## @Getter/@Setter
不要再写 public int getFoo() {return foo;} 了。
## @ToString
不需要启动调试器来查看您的字段：只需让lombok为您生成一个 toString ！
## @EqualsAndHashCode
简单的相等：从对象的字段生成 hashCode 和 equals 实现。
## @NoArgsConstructor, @RequiredArgsConstructor and @AllArgsConstructor
按顺序生成的构造函数：生成不带参数的构造函数；每个final /非nullfield一个参数；或者所有字段一个参数。
## @Data
现在一起：所有字段上的 @ToString ， @EqualsAndHashCode ， @Getter 的快捷方式，所有非最终字段上的 @Setter ，以及 @RequiredArgsConstructor ！
## @Value
不可变类变得非常简单。@Value 是 @Data 的不可变变体;默认情况下，所有字段都是 private 和 final ，并且不生成setter。
## @Builder
... Bob's your uncle：用于对象创建的无需麻烦的花哨的API！
## @SneakyThrows
大胆地抛出检查异常，在没有人抛出过的地方！
## @Synchronized
synchronized 方法修饰符的一个更安全的变体。
## @Locked 没了！
打开锁上！#00000;，现在少了一点麻烦。
## @With
创建一个克隆的方法，但只有一个字段被改变。
## @Getter(lazy=true)
你可以让lombok生成一个getter，它将在第一次调用这个getter时计算一个值，并从那时起缓存它。
## @Log
您将 @Log 的变体放在您的类上（无论哪一个适用于您使用的日志记录系统）;然后您就有了一个静态的final log 字段，按照您使用的日志记录框架通常规定的方式进行初始化，然后您可以使用它来编写日志语句。

有几个可用的选择：
### @CommonsLog
创建 private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(LogExample.class);
### @Flogger
创建 private static final com.google.common.flogger.FluentLogger log = com.google.common.flogger.FluentLogger.forEnclosingClass();
### @JBossLog
创建 private static final org.jboss.logging.Logger log = org.jboss.logging.Logger.getLogger(LogExample.class);
### @Log
创建 private static final java.util.logging.Logger log = java.util.logging.Logger.getLogger(LogExample.class.getName());
### @Log4j
创建 private static final org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(LogExample.class);
### @Log4j2
创建 private static final org.apache.logging.log4j.Logger log = org.apache.logging.log4j.LogManager.getLogger(LogExample.class);
### @Slf4j
创建 private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(LogExample.class);
### @XSlf4j
创建 private static final org.slf4j.ext.XLogger log = org.slf4j.ext.XLoggerFactory.getXLogger(LogExample.class);
### @CustomLog
创建 private static final com.foo.your.Logger log = com.foo.your.LoggerFactory.createYourLogger(LogExample.class);
此选项要求您将配置添加到 lombok.config 文件中，以指定 @CustomLog 应执行的操作。







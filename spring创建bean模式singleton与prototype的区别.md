<h5>spring创建bean模式singleton与prototype的区别</h5>

spring 创建bean有单例模式(singleton)和原始模型模式(prototype)这两种模式。

在默认的情况下，Spring中创建的bean都是单例模式的（注意Spring的单例模式与GoF提到的单例模式略微有些不同，详情参考Spring的官方文档）。

一般情况下，有状态的bean需要使用prototype模式，而对于无状态的bean一般采用singleton模式（一般的dao都是无状态的）。

所谓的状态场景是：

每次调用bean的方法，prototype都会提供一个新的对象（重新new），并不保存原有的实例，而singleton不同，多次调用bean实际上使用的是同一个singleton对象，而且保存了对象的状态信息。 
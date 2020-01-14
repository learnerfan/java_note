### 基础语法
#### 大小写敏感
#### 类名
> 首字母大写，多个单词，每个单词的首字母大写
#### 方法名
> 驼峰命名，单词首字母小写，其他字母大写
#### 源文件名
> 源文件名和类名相同，文件后缀为.java
#### 主方法入口
> public static void mian(String[] args) or (String... args)
### java标识符
* 所有标识符都应以字母(A~Z or a~z),$,或者下划线(_)开始
* 关键字不能用作标识符
* 合法字符
> age、$salary、_value、__1_value
* 非合法字符
> 123And,-sale

### java修饰符
#### 访问控制修饰符
* default
* public
* protected
* private
#### 非访问控制修饰符
* final
* abstract
* static
* synchronized
### java变量
#### 局部变量
#### 类变量(静态变量)
#### 成员变量(非静态变量)
### java数组
### java枚举
> 枚举限制变量只能是预先设置好的值。使用枚举可以减少代码中的bug

### java单个文件编译执行
```
javac
 将.java文件编译成.class文件,javac -encoding UTF-8 *.java
java
class文件执行命令,java 
class TestOne{
    public static void main(String[] args){
        System.out.println("hello");
    }
}
javac -encoding UTF-8 TestOne.java
生成 TestOne.class
java TestOne 执行文件
注意: java 后只跟类名即可，不需要加后缀名

```
### java关键字(不常见)
<table>
    <tr>
	    <th>类别</th>
	    <th>关键字</th>
	    <th>说明</th>  
	</tr>
    <tr>
        <th>访问控制</th>
        <th></th>
        <th></th>
    </tr>
    <tr>
        <th rowspan="5">类、方法和变量修饰符</th>
        <th>abstract</th>
        <th>声明抽象</th>
    </tr>
    <tr>
        <th>extends</th>
        <th>扩充、继承</th>
    </tr>
    <tr>
        <th>native</th>
        <th>本地、原生方法(非java实现)</th>
    </tr>
    <tr>
        <th>strictfp</th>
        <th>短暂</th>
    </tr>
    <tr>
        <th>volatile</th>
        <th>易失</th>
    </tr>

</table>

### java运算符
#### ++i 与 i++
* i++返回原来的值,++i返回+1后的值
* i++不能作为左值，而++i可以
* 左值与右值
    * 通俗地说。以赋值符号 = 为界，= 左边的就是左值，= 右边就是右值
    * 更深一层，可以将 L-value 的 L, 理解成 Location，表示定位，地址。将 R-value 的 R 理解成 Read，表示读取数据
    * 内存有两个很基本的属性：内存地址和内存里面放的数据
* 在Java语言中，这两条语句都只能作为右值，而不能作为左值
* 多线程并发引发的混乱
```
原因是：++i操作不是原子操作。先来看看之前博客中的一个例子，例子中展示了在多线程环境下由++i操作引起的数据混乱。引发混乱的原因是：++i操作不是原子操作。虽然在Java中++i是一条语句，字节码层面上也是对应iinc这条JVM指令，但是从最底层的CPU层面上来说，++i操作大致可以分解为以下3个指令：
取数
累加
存储
其中的一条指令可以保证是原子操作，但是3条指令合在一起却不是，这就导致了++i语句不是原子操作。
```
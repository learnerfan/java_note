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



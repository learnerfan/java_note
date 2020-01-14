/**
 * 文件名与类名不一致,但是仍然可以执行
 * javac 编译文件后,生成的class文件以类名命名
 * javac -encoding UTF-8 .\Test01.java
 * 产生 Test.class
 * 执行 java Test 
 * 备注: java 执行class文件时,只需要文件名，
 */
class Test{
  public static void main(String... args){
    m1();
  }
  public static void m1(){
    int i = 1 ;    
    int j = i++ ;
    // i++ 返回原来的值
    // ++i 返回+1后的值
    // 此时: i = 2, j = 1
    if((i==(++j))&&((i++)==j)){
    // i == (++j) 等价于 2 == 2 为true
    // (i++) == j 等价于 2 == 2 为true
    // 此时 i = 3,j = 2
    //返回结果为 2 + 3 = 5
      i += j;
    }
    System.out.println("i = "+i);
  }
}
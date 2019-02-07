package com.zcp.demo01;
//
// 
//                          ,.
//                         (_|,.
//                        ,' /, )_______   _
//                     __j o``-'        `.'-)'
//                    (")                 \'
//                     `-j                |
//                       `-._(           /
//                   zcp    |_\  |--^.  /
//                         /_]'|_| /_)_/
//                            /_]'  /_]'
//
//

/**
 * @ClassName Test
 * @Author ZCP
 * @Date 2019/2/7 23:02
 **/
public class Test {

    public static void main(String[] args){
        HasSelfPrivateNum n1=new HasSelfPrivateNum();
        HasSelfPrivateNum n2=new HasSelfPrivateNum();
        ThreadA t1=new ThreadA(n1);
        t1.start();

        ThreadB t2=new ThreadB(n2);
        t2.start();

    }
}

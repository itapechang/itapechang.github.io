package com.zcp.demo02;
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
 * @Date 2019/2/8 0:07
 **/
public class Test {

    public static void main(String[] args) {

        try {
            PublicVar pv = new PublicVar();
            ThreadA ta = new ThreadA(pv);
            ta.start();
            Thread.sleep(200);//打印结果受此值大小影响
            pv.getValue();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

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
 * @ClassName HasSelfPrivateNum
 * @Author ZCP
 * @Date 2019/2/7 22:57
 **/
public class HasSelfPrivateNum {
    private int num = 0;

    synchronized public void addl(String username) {
        try {
            if (username.equals("a")) {
                num = 100;
                System.out.println("a set over");
                Thread.sleep(2000);
            } else {
                num = 200;
                System.out.println("b set over");
            }
            System.out.println(username + " num=" + num);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

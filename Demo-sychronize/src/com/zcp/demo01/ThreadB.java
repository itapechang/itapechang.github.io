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
 * @ClassName ThreadB
 * @Author ZCP
 * @Date 2019/2/7 23:01
 **/
public class ThreadB extends Thread{

    private HasSelfPrivateNum numRef;

    public ThreadB(HasSelfPrivateNum numRef) {

        this.numRef = numRef;
    }

    @Override
    public void run() {
        super.run();
        numRef.addl("b");
    }
}

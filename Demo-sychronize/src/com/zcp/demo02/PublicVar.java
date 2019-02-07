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
 * @ClassName PublicVar
 * @Author ZCP
 * @Date 2019/2/8 0:00
 **/
public class PublicVar {

    public String username="A";
    public String password="AA";

    synchronized public void setValue(String username,String password){
        try {
            this.username=username;
            Thread.sleep(2000);
            this.password=password;
            System.out.println("setValue线程的名字>>>" + Thread.currentThread().getName() + "  username=" + username + "   password=" + password);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //该方法前加上synchronized关键字就同步了
    synchronized public void getValue(){
        System.out.println("getValue线程的名字>>>" + Thread.currentThread().getName() + "  username=" + username + "   password=" + password);
    }
}

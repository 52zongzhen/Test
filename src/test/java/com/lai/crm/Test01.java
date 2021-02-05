package com.lai.crm;/*
 * @author  lai
 * @date  2021-02-05 20:44
 *
 */

public class Test01 {
    public static void main(String[] args) {
        /*//验证失效时间
        String exprireTime = "2021-02-05 22:42:55";
        String da = DateTimeUtil.getSysTime();
        int count = exprireTime.compareTo(da);
        System.out.println(count);*/

        /*//equals判断要把常量放前面
        //判断是否锁定
        String lockstate = "0";
        if ("0".equals(lockstate)){
            System.out.println("用户被锁定");
        }*/

        //断送IP地址
        String ip = "192.168.8.90";
        String allowIps = "192.168.8.91,127.0.0.1";
        if(allowIps.contains(ip)){
            System.out.println("IP地址有效");
        }else {
            System.out.println("IP地址无效");
        }
    }


}

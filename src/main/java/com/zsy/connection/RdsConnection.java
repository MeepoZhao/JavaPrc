package com.zsy.connection;

public class RdsConnection {
    public static void main(String[] args) {
        /*使用rds数据库中的信息，连接其他数据库，然后遍历执行查询，捕获执行错误的内容
        * 1、使用jdbc连接rds数据库
        * 2、获取rds中的入湖表清单以及UAT环境的数据库名以及模式名以及上游的连接串
        * 3、对获取的结果进行遍历，然后连接上游数据库
        * 4、然后在上游的连接中执行SQL查询，然后捕获错误内容，放到该记录后面的列中
        * */
    }
}

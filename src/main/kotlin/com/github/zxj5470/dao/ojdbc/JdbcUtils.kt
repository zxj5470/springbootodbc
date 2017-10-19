package com.github.zxj5470.dao.ojdbc

import org.springframework.beans.factory.annotation.Value
import java.lang.Class.forName
import java.sql.Connection
import java.sql.DriverManager


class JdbcUtils{
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            forName("oracle.jdbc.driver.OracleDriver")
            val conn = DriverManager.getConnection(args[0], args[1],args[2])
            val stmt=conn.createStatement()
            for(ie in 1..10){
                val t=System.currentTimeMillis()
                val resultset=stmt.executeQuery("select * from mylake")
                val t2=System.currentTimeMillis()
                println(t2-t)
                var i=0
                while(resultset.next()){
                    i++
                }
                println(i)
            }
        }

    }
}

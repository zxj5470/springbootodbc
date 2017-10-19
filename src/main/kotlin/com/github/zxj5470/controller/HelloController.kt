package com.github.zxj5470.controller

import com.github.zxj5470.dao.ojdbc.JdbcUtils
import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController{
    @Value("\${ice.Name}")
    lateinit var s:String

    @Value("\${ojdbc.connectString}")
    lateinit var connectString:String

    @Value("\${ojdbc.username}")
    lateinit var username:String

    @Value("\${ojdbc.password}")
    lateinit var password:String

    @RequestMapping(value="/fvck")
    fun sayHello():String{
        JdbcUtils.main(arrayOf(connectString,username,password))
        return "Hello"+s
    }

}
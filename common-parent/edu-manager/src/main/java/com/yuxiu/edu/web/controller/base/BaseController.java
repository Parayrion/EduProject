package com.yuxiu.edu.web.controller.base;

import com.yuxiu.edu.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public abstract class BaseController<T> {
    //===============service===============
    @Autowired
    protected IUserService userService;
    //===============页面 ================
    protected static  String EDIT_PAGE;//添加编辑页面
    protected static  String INFO_PAGE;//列表界面
    protected static  String MANAGE_PAGE;//管理界面
    public BaseController(){
        try {
            ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass();
            //1.获取泛型真实类型
            Type[] types = pt.getActualTypeArguments();
            //2.把type类型赋值给Class类型
            Class<T> clz = (Class<T>) types[0];
            //3.定义页面的静态变量
            String modelName = clz.getSimpleName().toLowerCase();
            EDIT_PAGE = modelName + "/edit";
            INFO_PAGE = modelName + "/info";
            MANAGE_PAGE = modelName + "/manage";
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

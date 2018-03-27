package org.yaccc.dike.core;

import java.lang.reflect.Method;

/**
 * Created by xiezhaodong  on 2018/3/27
 */
public class MethodResourcesWrapper extends IResourcesWrapper {

    public MethodResourcesWrapper(Method method,String type){
        setType(type);
        setName(method.getName());
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public void setType(String type) {

    }
}

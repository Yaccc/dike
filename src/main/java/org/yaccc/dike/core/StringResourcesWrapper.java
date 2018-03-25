package org.yaccc.dike.core;

/**
 * Created by xiezhaodong  on 2018/3/25
 */
public class StringResourcesWrapper extends IResourcesWrapper {

    public StringResourcesWrapper(String name, String type) {
        setName(name);
        setType(type);
    }

    @Override
    public void setName(String name) {
        super.rName = name;
    }

    @Override
    public void setType(String type) {
        super.rType = type;
    }
}

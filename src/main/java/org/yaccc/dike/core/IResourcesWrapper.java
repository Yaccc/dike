package org.yaccc.dike.core;

import lombok.Getter;

/**
 * Created by xiezhaodong  on 2018/3/25
 * resources wrapper,
 */
public abstract class IResourcesWrapper {
    //
    @Getter
    protected String rName;
    @Getter
    protected String rType;

    protected abstract void setName(String name);

    protected abstract void setType(String type);

}

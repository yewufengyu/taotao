package com.taotao.common.pojo;

import java.io.Serializable;
import java.util.List;

public class EasyUiDatagridResult implements Serializable {
    public List rows;
    public long total;

    public List getRows() {
        return rows;
    }

    public void setRows( List rows ) {
        this.rows = rows;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(long total ) {
        this.total = total;
    }
}

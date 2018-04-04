package com.taotao.common.pojo;

import java.io.Serializable;

public class EasyUiTreeResult implements Serializable {
    public long id;
    public String text;
    public String state;

    public long getId() {
        return id;
    }

    public void setId( long id ) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText( String text ) {
        this.text = text;
    }

    public String getState() {
        return state;
    }

    public void setState( String state ) {
        this.state = state;
    }
}

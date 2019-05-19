package org.open918.lib.domain;


/**
 * Created by Joel Haasnoot on 26/04/15.
 */
public class TicketBlock {

    private String type;
    private int version;
    private int length;
    private String body;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}





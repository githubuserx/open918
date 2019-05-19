package org.open918.lib.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Joel Haasnoot on 26/04/15.
 */
public class TicketContent extends TicketBlock {

    private String layout;
    private int numberOfFields;
    private List<TicketField> fields = new ArrayList<>();

    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    public int getNumberOfFields() {
        return numberOfFields;
    }

    public void setNumberOfFields(int numberOfFields) {
        this.numberOfFields = numberOfFields;
    }

    public List<TicketField> getFields() {
        return fields;
    }

    public void setFields(List<TicketField> fields) {
        this.fields = fields;
    }
}

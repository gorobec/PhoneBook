package ua.artcode.model;

import ua.artcode.enums.Group_type;

/**
 * Created by Lisa on 12/4/2016.
 */
public class Group {
    private Group_type group_type;
    private int group_number;

    public Group(Group_type group_type, int group_number) {
        this.group_type = group_type;
        this.group_number = group_number;
    }
}

package ucap.generator.entity;

import lombok.Data;

/**
 * @Description:列实体类
 * @author: chengyun
 * @date: 2020-11-15
 */
@Data
public class ColumnEntity {
    //列名
    private String columnName;
    //列名类型
    private String dataType;
    //列名备注
    private String comments;

    //属性名称(第一个字母大写)，如：user_name => UserName
    private String attrName;
    //属性名称(第一个字母小写)，如：user_name => userName
    private String attrname;

    //属性类型
    private String attrType;
    //auto_increment
    private String extra;

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    public void setAttrname(String attrname) {
        this.attrname = attrname;
    }

    public void setAttrType(String attrType) {
        this.attrType = attrType;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public String getColumnName() {
        return columnName;
    }

    public String getDataType() {
        return dataType;
    }

    public String getComments() {
        return comments;
    }

    public String getAttrName() {
        return attrName;
    }

    public String getAttrname() {
        return attrname;
    }

    public String getAttrType() {
        return attrType;
    }

    public String getExtra() {
        return extra;
    }
}

package com.fsl.manager.pojo;

import java.io.Serializable;

public class Roleinfo implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column roleinfo.ID
     *
     * @mbg.generated Tue Nov 12 15:40:11 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column roleinfo.RoleName
     *
     * @mbg.generated Tue Nov 12 15:40:11 CST 2019
     */
    private String rolename;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column roleinfo.Description
     *
     * @mbg.generated Tue Nov 12 15:40:11 CST 2019
     */
    private String description;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column roleinfo.ID
     *
     * @return the value of roleinfo.ID
     *
     * @mbg.generated Tue Nov 12 15:40:11 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column roleinfo.ID
     *
     * @param id the value for roleinfo.ID
     *
     * @mbg.generated Tue Nov 12 15:40:11 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column roleinfo.RoleName
     *
     * @return the value of roleinfo.RoleName
     *
     * @mbg.generated Tue Nov 12 15:40:11 CST 2019
     */
    public String getRolename() {
        return rolename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column roleinfo.RoleName
     *
     * @param rolename the value for roleinfo.RoleName
     *
     * @mbg.generated Tue Nov 12 15:40:11 CST 2019
     */
    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column roleinfo.Description
     *
     * @return the value of roleinfo.Description
     *
     * @mbg.generated Tue Nov 12 15:40:11 CST 2019
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column roleinfo.Description
     *
     * @param description the value for roleinfo.Description
     *
     * @mbg.generated Tue Nov 12 15:40:11 CST 2019
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}
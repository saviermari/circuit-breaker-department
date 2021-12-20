package com.smari.department.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/departments")
public class DepartmentResource {

    @GET
    @Path("{name}")
    public String getDepartment(@PathParam("name") String name){
        return name;
    }
}

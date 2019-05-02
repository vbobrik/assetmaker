package com;

import com.models.Cct_project;
import com.requests.Project;

public class Main {
    public static void main(String[] args) {

        Cct_project project = new Cct_project.Builder()
                .getProjectName("Val1")
                .getProjectVersion(1)
                .getScheme(2)
                .getSoftwareVersion("19.0426.0")
                .build();

        Cct_project createdProject  =  Project.createProject("",  project);
        System.out.println(createdProject.getProjectId());
    }
}

//  1,
//          "t(1)",
//          "19.0426.0",
//          3
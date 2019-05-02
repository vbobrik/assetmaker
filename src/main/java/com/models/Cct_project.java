package com.models;

import java.util.ArrayList;

public class Cct_project {
    private String projectId;
    private String projectName;
    private int scheme;

    public String getProjectId() {
        return projectId;
    }

    private String softwareVersion;
    private String projectPreview;
    private int projectVersion;
    private ArrayList<Object> scenes;

    public static class Builder{
        private Cct_project newCct_project;

        public Builder () {
            newCct_project = new Cct_project();
        }

        public Builder getProjectId(String projectId) {
            newCct_project.projectId = projectId;
            return this;
        }

        public Builder getProjectName(String projectName) {
            newCct_project.projectName = projectName;
            return this;
        }

        public Builder getScheme (int scheme) {
            newCct_project.scheme = scheme;
            return this;
        }

        public Builder getSoftwareVersion(String softwareVersion) {
            newCct_project.softwareVersion = softwareVersion;
            return this;
        }

        public Builder getProjectPreview(String projectPreview) {
            newCct_project.projectPreview = projectPreview;
            return this;
        }

        public Builder getProjectVersion(int projectVersion) {
            newCct_project.projectVersion = projectVersion;
            return  this;
        }
        public Builder getScenes(ArrayList<Object> scenes) {
            newCct_project.scenes = scenes;
            return this;
        }

        public Cct_project build() {
            return newCct_project;
        }
    }

}

// "projectId" : "5ccb0720e75d1a0009865af3",
//         "scheme" : 1,
//         "projectName" : "t(1)",
//         "createdDate" : "2019-05-02T18:18:52.661Z",
//         "projectPreview" : null,
//         "scenes" : [ {
//         "position" : 0,
//         "name" : "Scene 1",
//         "data" : {
//         "imageActor" : [ ],
//         "modelActor" : [ ],
//         "templateActor" : [ ],
//         "textActor" : [ {
//         "message" : "g",
//         "animationId" : "22",
//         "regionId" : "default",
//         "fontId" : "noto_sans",
//         "depth" : 0.30000001192092896,
//         "color" : "#B2B2B2",
//         "materialType" : 0
//         } ],
//         "priceActor" : [ ],
//         "effectActor" : [ ]
//         }
//         }, {
//         "position" : 1,
//         "name" : "Scene 2",
//         "data" : {
//         "imageActor" : [ {
//         "id" : "5ccb348b88d876000180936a",
//         "animationId" : "27",
//         "depth" : 0.30000001192092896,
//         "croppingSettings" : {
//         "relativePosX" : 0.5000000596046448,
//         "relativePosY" : 0.4999998211860657,
//         "relativeRaduis" : 0.7071067690849304,
//         "absoluteDiameter" : 1024.0
//         }
//         } ],
//         "modelActor" : [ ],
//         "templateActor" : [ ],
//         "textActor" : [ ],
//         "priceActor" : [ ],
//         "effectActor" : [ ]
//         }
//         }, {
//         "position" : 2,
//         "name" : "Scene 3",
//         "data" : {
//         "imageActor" : [ ],
//         "modelActor" : [ ],
//         "templateActor" : [ {
//         "id" : "magicsphere",
//         "sourceId" : "",
//         "sourceType" : "Null",
//         "bestFit" : 0.0
//         } ],
//         "textActor" : [ ],
//         "priceActor" : [ ],
//         "effectActor" : [ ]
//         }
//         } ],
//         "mediaSettings" : {
//         "wallType" : 1,
//         "width" : 880,
//         "height" : 880
//         },
//         "softwareVersion" : "19.0426.0",
//         "projectVersion" : 3
//         }
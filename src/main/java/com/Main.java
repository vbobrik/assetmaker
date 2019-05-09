package java.com;

import java.com.models.Cct_project;
import java.com.models.Scene;
import java.com.requests.ProjectAPI;
import java.com.requests.autenthication.Credentials;
import java.com.requests.autenthication.Token;
import java.util.ArrayList;

;

public class Main {
    public static void main(String[] args) {

//        Cct_project project = new Cct_project.Builder()
//                .getProjectName("Val1")
//                .getProjectVersion(1)
//                .getScheme(2)
//                .getSoftwareVersion("19.0426.0")
//                .build();
//        String tokenUserValentina = Token.getToken(Credentials.getLogin(), Credentials.getPass());
//        String gotProjects  =  ProjectAPI.getAllProjects(tokenUserValentina);
//        System.out.println("---MAIN class ______GET TOKEN" + gotProjects);



        String   tokenUserValentina = Token.getToken(Credentials.getLogin(), Credentials.getPass());
        ArrayList<Scene>   scene1 = new ArrayList<Scene>();
//        scene1 = new Scene(1, "scene1", 0);

        Cct_project     cct_project1 = new Cct_project.Builder()
                    .getProjectName("ValTest2")
                    .getProjectVersion(0)
                    .getScheme(2)
                    .getSoftwareVersion("19.0426.0")
                    .getScenes(scene1)
                    .build();

            System.out.println(ProjectAPI.createProject(tokenUserValentina, cct_project1));

            System.out.println(ProjectAPI.getProjectById(tokenUserValentina, cct_project1.getProjectId()));

    }
}

//  1,
//          "t(1)",
//          "19.0426.0",
//          3
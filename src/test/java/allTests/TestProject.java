package allTests;

import java.com.models.Cct_project;
import java.com.models.Scene;
import java.com.requests.ProjectAPI;
import java.com.requests.autenthication.Credentials;
import java.com.requests.autenthication.Token;
import java.util.ArrayList;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestProject {
    private static String tokenUserValentina;
    private static Cct_project cct_project1;
    private static ArrayList<Scene> scene1;

    @BeforeClass
    public void setUp() {
        tokenUserValentina = Token.getToken(Credentials.getLogin(), Credentials.getPass());
        scene1 = new ArrayList<Scene>();
//        scene1 = new Scene(1, "scene1", 0);
        cct_project1 = new Cct_project.Builder()
                .getProjectName("ValTest1")
                .getProjectVersion(0)
                .getScheme(2)
                .getSoftwareVersion("19.0426.0")
                .getScenes(scene1)
                .build();
    }

    @Test
    public static void testCreateProject() {
        System.out.println(ProjectAPI.createProject(tokenUserValentina, cct_project1));
    }

    @Test
    public static void testGetProjectById() {
        System.out.println(ProjectAPI.getProjectById(tokenUserValentina, cct_project1.getProjectId()));
    }
}

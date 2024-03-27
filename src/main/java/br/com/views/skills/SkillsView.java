package br.com.views.skills;

import br.com.views.MainLayout;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.HasStyle;
import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility.*;

@PageTitle("Skills")
@Route(value = "skills", layout = MainLayout.class)
public class SkillsView extends Main implements HasComponents, HasStyle {

    private OrderedList imageContainer;

    public SkillsView() {
        constructUI();

        imageContainer.add(new SkillsViewCard("https://www.vectorlogo.zone/logos/java/java-ar21.svg", "Java"));
        imageContainer.add(new SkillsViewCard("https://www.vectorlogo.zone/logos/python/python-ar21.svg", "Python"));
        imageContainer.add(new SkillsViewCard("https://www.vectorlogo.zone/logos/golang/golang-ar21.svg", "Go"));
        imageContainer.add(new SkillsViewCard("https://www.vectorlogo.zone/logos/kotlinlang/kotlinlang-ar21.svg", "Kotlin"));
        imageContainer.add(new SkillsViewCard("https://www.vectorlogo.zone/logos/nodejs/nodejs-ar21.svg", "NodeJs"));
        imageContainer.add(new SkillsViewCard("https://www.vectorlogo.zone/logos/angular/angular-ar21.svg", "angular"));
        imageContainer.add(new SkillsViewCard("https://www.vectorlogo.zone/logos/oracle/oracle-ar21.svg", "oracle"));
        imageContainer.add(new SkillsViewCard("https://www.vectorlogo.zone/logos/springio/springio-ar21.svg", "spring"));
        imageContainer.add(new SkillsViewCard("https://www.vectorlogo.zone/logos/javascript/javascript-horizontal.svg", "JavaScript"));
        imageContainer.add(new SkillsViewCard("https://www.vectorlogo.zone/logos/typescriptlang/typescriptlang-ar21.svg", "Typescript"));
        imageContainer.add(new SkillsViewCard("https://www.vectorlogo.zone/logos/w3_html5/w3_html5-ar21.svg", "HTML5"));
        imageContainer.add(new SkillsViewCard("https://www.vectorlogo.zone/logos/w3_css/w3_css-ar21.svg", "CSS3"));
        imageContainer.add(new SkillsViewCard("https://www.vectorlogo.zone/logos/pocoo_flask/pocoo_flask-ar21.svg", "flask"));
        imageContainer.add(new SkillsViewCard("https://www.vectorlogo.zone/logos/apache_maven/apache_maven-ar21.svg", "maven"));
        imageContainer.add(new SkillsViewCard("https://www.vectorlogo.zone/logos/hibernate/hibernate-ar21.svg", "hibernate"));
        imageContainer.add(new SkillsViewCard("https://www.vectorlogo.zone/logos/getbootstrap/getbootstrap-ar21.svg", "boostrap"));
        imageContainer.add(new SkillsViewCard("https://www.vectorlogo.zone/logos/postgresql/postgresql-ar21.svg", "postgreSQL"));
        imageContainer.add(new SkillsViewCard("https://www.vectorlogo.zone/logos/mysql/mysql-ar21.svg", "mysql"));
        imageContainer.add(new SkillsViewCard("https://www.vectorlogo.zone/logos/sqlite/sqlite-ar21.svg", "sqlite"));
        imageContainer.add(new SkillsViewCard("https://www.vectorlogo.zone/logos/visualstudio_code/visualstudio_code-ar21.svg", "visual studio code"));
        imageContainer.add(new SkillsViewCard("https://www.vectorlogo.zone/logos/git-scm/git-scm-ar21.svg", "git"));
        imageContainer.add(new SkillsViewCard("https://www.vectorlogo.zone/logos/gitlab/gitlab-ar21.svg", "gitlab"));
        imageContainer.add(new SkillsViewCard("https://www.vectorlogo.zone/logos/github/github-ar21.svg", "github"));
        imageContainer.add(new SkillsViewCard("https://www.vectorlogo.zone/logos/bitbucket/bitbucket-ar21.svg", "bitbucket"));
        imageContainer.add(new SkillsViewCard("https://www.vectorlogo.zone/logos/apache_tomcat/apache_tomcat-ar21.svg", "tomcat"));
        imageContainer.add(new SkillsViewCard("https://www.vectorlogo.zone/logos/jenkins/jenkins-ar21.svg", "jenkins"));
        imageContainer.add(new SkillsViewCard("https://www.vectorlogo.zone/logos/redis/redis-ar21.svg", "redis"));
        imageContainer.add(new SkillsViewCard("https://www.vectorlogo.zone/logos/getpostman/getpostman-ar21.svg", "postman"));
        imageContainer.add(new SkillsViewCard("https://raw.githubusercontent.com/devicons/devicon/6910f0503efdd315c8f9b858234310c06e04d9c0/icons/swagger/swagger-plain-wordmark.svg", "swagger"));
        imageContainer.add(new SkillsViewCard("https://www.vectorlogo.zone/logos/atlassian_jira/atlassian_jira-ar21.svg", "jira"));
        imageContainer.add(new SkillsViewCard("https://raw.githubusercontent.com/gilbarbara/logos/52addcaa18dfecb4df77f3ee0753dca6b98187ad/logos/notion.svg", "notion"));
        imageContainer.add(new SkillsViewCard("https://www.vectorlogo.zone/logos/discord/discord-ar21.svg", "discord"));
        imageContainer.add(new SkillsViewCard("https://www.vectorlogo.zone/logos/heroku/heroku-ar21.svg", "heroku"));
        imageContainer.add(new SkillsViewCard("https://upload.vectorlogo.zone/logos/kali/images/4f107199-98a3-43c2-9d1f-19af3082b59b.svg", "Kali"));
        imageContainer.add(new SkillsViewCard("https://www.vectorlogo.zone/logos/microsoft/microsoft-ar21.svg", "windows"));


    }

    private void constructUI() {
        addClassNames("skills-view");
        addClassNames(MaxWidth.SCREEN_XLARGE, Margin.Horizontal.AUTO, Padding.Bottom.SMALL, Padding.Horizontal.XSMALL);

        HorizontalLayout container = new HorizontalLayout();
        container.addClassNames(AlignItems.CENTER, JustifyContent.BETWEEN);

        VerticalLayout headerContainer = new VerticalLayout();
        H1 header = new H1("Habilidades");
        header.addClassNames(Margin.Bottom.NONE, Margin.Top.AUTO, FontSize.XXXLARGE);
        headerContainer.add(header);

        imageContainer = new OrderedList();
        imageContainer.addClassNames(Gap.SMALL, Display.GRID);

        container.add(headerContainer);
        add(container, imageContainer);

    }
}

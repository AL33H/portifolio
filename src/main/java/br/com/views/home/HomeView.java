package br.com.views.home;

import br.com.views.MainLayout;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.dom.Style;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import com.vaadin.flow.theme.lumo.LumoUtility;

@PageTitle("Home")
@Route(value = "/", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
@Uses(Icon.class)
public class HomeView extends VerticalLayout {


    public HomeView() {
        setClassName("main-view");
        setBackground();
        setHeight("100%");
        addContent();
    }

    private void setBackground() {
        getStyle().set("background-image", "url(https://aakash-sharma.netlify.app/static/media/cloudBg.f28b5c6961fd82be839c.png)");
    }

    private void addContent() {
        HorizontalLayout horizontalLayout = new HorizontalLayout();
        horizontalLayout.add(createTextSection(), createImageSection());
        horizontalLayout.setAlignItems(FlexComponent.Alignment.CENTER);
        horizontalLayout.setJustifyContentMode(FlexComponent.JustifyContentMode.CENTER);
        add(horizontalLayout);
    }

    private Div createTextSection() {
        Div divText = new Div();
        divText.addClassName("text-section");

        H2 greeting = new H2("Olá, meu nome é");
        divText.add(greeting);

        H1 name = new H1("Aleff Remberto");
        name.addClassNames("name", "large-text", "bold", "uppercase", "flex");
        divText.add(name);

        H2 occupation = new H2("FullStack developer");
        divText.add(occupation);

        HorizontalLayout socialIcons = createSocialIcons();
        divText.add(socialIcons);

        return divText;
    }

    private HorizontalLayout createSocialIcons() {
        Anchor instagram = createSocialLink("https://www.instagram.com/aleff_remberto/", "instagram");
        Anchor github = createSocialLink("https://github.com/AL33H", "github");
        Anchor linkedin = createSocialLink("https://www.linkedin.com/in/aleff-remberto-0b60b21b2/", "linkedin");

        HorizontalLayout iconsLayout = new HorizontalLayout(instagram, github, linkedin);
        iconsLayout.setSpacing(true);
        return iconsLayout;
    }

    private Anchor createSocialLink(String href, String iconName) {
        Anchor anchor = new Anchor(href);
        anchor.add(new Image("https://img.icons8.com/doodle/40/000000/" + iconName + ".png", iconName));
        anchor.setTarget("_blank");
        return anchor;
    }

    private Image createImageSection() {
        Image image = new Image("https://aakash-sharma.netlify.app/static/media/webdev.4d72dbba32efee3890cef9bcacce7aa7.svg", "Imagem");
        image.setWidth("50%");
        return image;
    }
}

package br.com.views.home;

import br.com.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Section;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;

@PageTitle("Home")
@Route(value = "/", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
@Uses(Icon.class)
public class HomeView extends Composite<VerticalLayout> {

    private final Image image = new Image("https://aakash-sharma.netlify.app/static/media/webdev.4d72dbba32efee3890cef9bcacce7aa7.svg", "Imagem");


    public HomeView() {
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        getStyle().set("background-image", "url(https://aakash-sharma.netlify.app/static/media/cloudBg.f28b5c6961fd82be839c.png)");
        getStyle().setHeight("100%");

    }
}

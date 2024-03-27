package br.com.views.contact;

import br.com.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Contact")
@Route(value = "contact", layout = MainLayout.class)
@Uses(Icon.class)
public class ContactView extends Composite<VerticalLayout> {

    public ContactView() {
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");



    }
}

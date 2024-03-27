package br.com.views.about;

import br.com.views.MainLayout;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility;


@PageTitle("About")
@Route(value = "about", layout = MainLayout.class)
@Uses(Icon.class)
public class AboutView extends VerticalLayout {

    public AboutView() {
        this.getStyle().setWidth("100%");
        this.getStyle().set("flex-grow", "1");

        addClassNames(LumoUtility.AlignItems.CENTER, LumoUtility.FontSize.XXLARGE);

        H1 h1 = new H1("Sobre mim");

        Paragraph h3Txt1 = new Paragraph("Como profissional de tecnologia, tenho habilidades avançadas em programação de back-end e front-end, o que me permite desenvolver soluções FullStack com expertise em Java e AngularJs. Além disso, estou comprometido em continuar aprimorando minhas habilidades e conhecimentos na área, por isso estou cursando Engenharia de Software pela Estácio.");

        Paragraph h3Txt2 = new Paragraph("Para me destacar no mercado de tecnologia, mantenho-me atualizado sobre as tendências e tecnologias emergentes. Além disso, estou focado em desenvolver minhas habilidades de comunicação e colaboração, pois acredito que são habilidades cada vez mais valorizadas pelas empresas");

        Paragraph h3Txt3 = new Paragraph("Com minha dedicação e comprometimento, tenho certeza de que posso agregar muito valor a qualquer equipe de desenvolvimento e estou sempre aberto a novas oportunidades de aprendizado e crescimento profissional.");

        VerticalLayout verticalLayout = new VerticalLayout();
        verticalLayout.add(h3Txt1, h3Txt2, h3Txt3);
        verticalLayout.setSpacing(true);

        add(h1, verticalLayout);

    }
}

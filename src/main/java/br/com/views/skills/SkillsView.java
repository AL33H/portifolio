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

        imageContainer.add(new SkillsViewCard("/icons/java.png", "Java"));
        imageContainer.add(new SkillsViewCard("/icons/python.png", "Python"));
        imageContainer.add(new SkillsViewCard("https://raw.githubusercontent.com/devicons/devicon/master/icons/typescript/typescript-original.svg", "typescript"));
        imageContainer.add(new SkillsViewCard("https://raw.githubusercontent.com/devicons/devicon/master/icons/typescript/typescript-original.svg", "typescript"));
        imageContainer.add(new SkillsViewCard("https://raw.githubusercontent.com/devicons/devicon/master/icons/typescript/typescript-original.svg", "typescript"));
        imageContainer.add(new SkillsViewCard("https://raw.githubusercontent.com/devicons/devicon/master/icons/typescript/typescript-original.svg", "typescript"));
        imageContainer.add(new SkillsViewCard("https://raw.githubusercontent.com/devicons/devicon/master/icons/typescript/typescript-original.svg", "typescript"));
        imageContainer.add(new SkillsViewCard("https://raw.githubusercontent.com/devicons/devicon/master/icons/typescript/typescript-original.svg", "typescript"));
        imageContainer.add(new SkillsViewCard("https://raw.githubusercontent.com/devicons/devicon/master/icons/typescript/typescript-original.svg", "typescript"));
        imageContainer.add(new SkillsViewCard("https://raw.githubusercontent.com/devicons/devicon/master/icons/typescript/typescript-original.svg", "typescript"));
        imageContainer.add(new SkillsViewCard("https://raw.githubusercontent.com/devicons/devicon/master/icons/typescript/typescript-original.svg", "typescript"));
        imageContainer.add(new SkillsViewCard("https://raw.githubusercontent.com/devicons/devicon/master/icons/typescript/typescript-original.svg", "typescript"));
        imageContainer.add(new SkillsViewCard("https://raw.githubusercontent.com/devicons/devicon/master/icons/typescript/typescript-original.svg", "typescript"));
        imageContainer.add(new SkillsViewCard("https://raw.githubusercontent.com/devicons/devicon/master/icons/typescript/typescript-original.svg", "typescript"));
        imageContainer.add(new SkillsViewCard("https://raw.githubusercontent.com/devicons/devicon/master/icons/typescript/typescript-original.svg", "typescript"));
        imageContainer.add(new SkillsViewCard("https://raw.githubusercontent.com/devicons/devicon/master/icons/typescript/typescript-original.svg", "typescript"));
        imageContainer.add(new SkillsViewCard("https://raw.githubusercontent.com/devicons/devicon/master/icons/typescript/typescript-original.svg", "typescript"));
        imageContainer.add(new SkillsViewCard("https://raw.githubusercontent.com/devicons/devicon/master/icons/typescript/typescript-original.svg", "typescript"));

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

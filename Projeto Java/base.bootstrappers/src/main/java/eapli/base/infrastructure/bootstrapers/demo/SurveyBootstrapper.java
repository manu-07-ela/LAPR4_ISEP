package eapli.base.infrastructure.bootstrapers.demo;

import eapli.base.clientmanagement.domain.Client;
import eapli.base.clientmanagement.domain.Email;
import eapli.base.clientmanagement.repositories.ClientRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.surveymanagement.application.AtribuirQuestionarioAosClientesService;
import eapli.base.surveymanagement.domain.*;
import eapli.base.surveymanagement.repository.SurveyRepository;
import eapli.framework.actions.Action;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Optional;

public class SurveyBootstrapper extends BaseDemoBootstrapper implements Action {

    private final SurveyRepository surveyRepository = PersistenceContext.repositories().surveys();

    private final ClientRepository clientRepository = PersistenceContext.repositories().client();

    @Override
    public boolean execute() {
        createSurveys();
        return true;
    }

    private void createSurveys(){

        AtribuirQuestionarioAosClientesService service = new AtribuirQuestionarioAosClientesService();

        Questionnaire questionnaire = new Questionnaire();

        questionnaire.modifyId(new Identifier("01-SAT2"));
        questionnaire.modifyTitle(new Titulo("Customer Satisfaction"));
        questionnaire.modifyInitialMessage(new Message("Hello!\nPlease take a few minutes of your time to complete the following questionnaire."));

        Section section = new Section();
        section.modifyId(1L);
        section.modifyTitle(new Titulo("Service feedback"));
        section.modifyObligatoriness("mandatory");

        Question question = new Question();
        question.modifyId(1L);
        question.modifyPergunta(new Message("How is the quality of our services compared to other companies?"));
        question.modifyObligatoriness("mandatory");
        question.modifyType("Single-Choice");
        question.addOption(1L,"Much better");
        question.addOption(2L,"A bit better");
        question.addOption(3L,"Equal");
        question.addOption(4L,"A bit worse");
        question.addOption(5L,"Much worse");
        question.modifyExtraInfo(new Message("Answer the question by selecting one (and only one) of the options provided."));
        section.addQuestion(question);

        Question question1 = new Question();
        question1.modifyId(2L);
        question1.modifyPergunta(new Message("What changes can the company make to improve the quality of its services?"));
        question1.modifyObligatoriness("optional");
        question1.modifyType("Free-Text");
        question1.modifyExtraInfo(new Message("Answer the question by typing some text."));
        section.addQuestion(question1);

        Question question2 = new Question();
        question2.modifyId(3L);
        question2.modifyPergunta(new Message("How many purchases have you made with us?"));
        question2.modifyObligatoriness("mandatory");
        question2.modifyType("Numeric");
        question2.modifyExtraInfo(new Message("Answer the question by entering a numeric value."));
        section.addQuestion(question2);

        Question question5 = new Question();
        question5.modifyId(3L);
        question5.modifyPergunta(new Message("How did you find out about our company?"));
        question5.modifyObligatoriness("mandatory");
        question5.modifyType("Single-Choice with input value");
        question5.addOption(1L,"Television ads");
        question5.addOption(2L,"Outdoors");
        question5.addOption(3L,"Social Media");
        question5.addOption(4L,"Other:");
        question5.modifyExtraInfo(new Message("The last option, if selected, implies that you write a numeric value or free text."));
        section.addQuestion(question5);

        Question question6 = new Question();
        question6.modifyId(4L);
        question6.modifyPergunta(new Message("Have you ever had a problem shopping with us?"));
        question6.modifyObligatoriness("mandatory");
        question6.modifyType("Multiple-Choice with input value");
        question6.addOption(1L,"Payment Error");
        question6.addOption(2L,"Packaging damage");
        question6.addOption(3L,"Order loss");
        question6.addOption(4L,"Other:");
        question6.modifyExtraInfo(new Message("The last option, if selected, implies that you write a numeric value or free text."));
        section.addQuestion(question6);

        Question question7 = new Question();
        question7.modifyId(5L);
        question7.modifyPergunta(new Message("How would you compare our products to our competitors?"));
        question7.modifyObligatoriness("optional");
        question7.modifyType("Scaling Options");
        question7.addOption(1L,"Our products have a higher quality than the ones from our competitors");
        question7.addOption(2L,"Our products are cheaper than the ones from our competitors");
        question7.addOption(3L,"Our products have more availability than the ones from our competitors");
        question7.addOption(4L,"You prefer to buy products from us");
        question7.modifyExtraInfo(new Message("Select a scale value for each of the specified options."));
        section.addQuestion(question7);

        questionnaire.addSection(section);

        Section section1 = new Section();
        section1.modifyId(2L);
        section1.modifyTitle(new Titulo("Personal Preference"));
        section1.modifyObligatoriness("mandatory");

        Question question3 = new Question();
        question3.modifyId(6L);
        question3.modifyPergunta(new Message("What items would you like us to have more on offer?"));
        question3.modifyObligatoriness("mandatory");
        question3.modifyType("Multiple-Choice");
        question3.addOption(1L,"Clothing");
        question3.addOption(2L,"Cosmetic");
        question3.addOption(3L,"Home appliances");
        question3.addOption(4L,"House and Garden and decoration");
        question3.addOption(5L,"Books and Stationery");
        question3.modifyExtraInfo(new Message("Select more than one."));
        section1.addQuestion(question3);

        Question question4 = new Question();
        question4.modifyId(7L);
        question4.modifyPergunta(new Message("We are proud to work with renowned brands in all our categories, in terms of cosmetics, please order them in your order of preference?"));
        question4.modifyObligatoriness("optional");
        question4.modifyType("Sorting Options");
        question4.addOption(1L,"Nivea");
        question4.addOption(2L,"Garnier");
        question4.addOption(3L,"Uriage");
        question4.addOption(4L,"Vichy");
        question4.addOption(5L,"Dove");
        question4.modifyExtraInfo(new Message("Sorting the options as desired and according to the instructions provided."));
        section1.addQuestion(question4);

        questionnaire.addSection(section1);

        questionnaire.modifyFinalMessage(new Message("Thank you for answering the questionnaire!"));

        Calendar initialDate = Calendar.getInstance();
        initialDate.set(2022, 5, 12);
        Calendar finalDate = Calendar.getInstance();
        finalDate.set(2022, 7, 1);
        Period period = new Period(initialDate,finalDate);

        questionnaire.modifyPeriod(period);

        questionnaire.modifyRestricao(new Restricao(Criterio.NONE));

        surveyRepository.save(questionnaire);

        Optional<Client> client = clientRepository.findByEmail(Email.valueOf("arianasobral26@outlook.pt"));

        client.get().addUnansweredQuestionnaire(surveyRepository.findByIdentifier(questionnaire.getSurveyId()).get());

        clientRepository.save(client.get());

    }
}

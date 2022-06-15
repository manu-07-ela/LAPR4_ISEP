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

        questionnaire.modifyId(new Identifier("01-SAT2022"));
        questionnaire.modifyTitle(new Titulo("Satisfação do cliente"));
        questionnaire.modifyInitialMessage(new Message("Bom dia!\nDedique, por favor, alguns minutos do seu tempo para preencher o questionário seguinte."));

        Section section = new Section();
        section.modifyId(1L);
        section.modifyTitle(new Titulo("Feedback do atendimento"));
        section.modifyObligatoriness("mandatory");

        Question question = new Question();
        question.modifyId(1L);
        question.modifyPergunta(new Message("Como é a qualidade dos nossos serviços em comparação com as outras empresas?"));
        question.modifyObligatoriness("mandatory");
        question.modifyType("Single-Choice");
        question.addOption(1L,"Muito melhor");
        question.addOption(2L,"Um bocado melhor");
        question.addOption(3L,"Igual");
        question.addOption(4L,"Um bocado pior");
        question.addOption(5L,"Muito pior");
        question.modifyExtraInfo(new Message("Escolha uma das seguintes frases."));
        section.addQuestion(question);

        questionnaire.addSection(section);

        questionnaire.modifyFinalMessage(new Message("Obrigado por responder ao questionário!"));

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

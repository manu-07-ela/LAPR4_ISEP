package eapli.base.surveymanagement.antlr.eapli.base.surveymanagement.antlr;

import eapli.base.surveymanagement.antlr.SurveyLexer;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class QuestionnaireMain {

    public static void main(String[] args) throws IOException {
        parseWithVisitor();
    }


    public static void parseWithVisitor() {
        try {
            SurveyLexer lexer = new SurveyLexer(CharStreams.fromFileName("teste.txt"));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            SurveyParser parser = new SurveyParser(tokens);
            ParseTree tree = parser.start();
            SurveyVisitor eval = new QuestionnaireVisitor();
            eval.visit(tree);
            System.out.println("Survey has a valid format!");
        } catch(IOException e) {
            System.out.println("Make sure the file has the correct path");
        } catch (Exception e) {
            System.out.println("The Survey does not follow the required format.");
        }
    }

}

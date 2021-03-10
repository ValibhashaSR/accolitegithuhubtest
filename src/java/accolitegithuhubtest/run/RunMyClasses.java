package accolitegithuhubtest.run;

import accolitegithuhubtest.GitHubTest1;
import accolitegithuhubtest.PRTest;
import accolitegithuhubtest.ci.CiTest;
import accolitegithuhubtest.newfeatures.SecondFeatureAdd;

public class RunMyClasses {
	public static void main(String[] args) {
		GitHubTest1.main(args);
		System.out.println("********");
		PRTest.main(args);
		System.out.println("********");
		CiTest.main(args);
		System.out.println("********");
		SecondFeatureAdd.main(args);
		System.out.println("********");
	}
}
